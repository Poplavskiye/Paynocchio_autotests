package ApiTests;
import PageObject.LoginForNextTests;
import groovyjarjarantlr4.v4.runtime.misc.NotNull;
import io.qameta.allure.Step;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.*;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.CoreMatchers.*;


public class ApiTestAuthorization {

    @BeforeEach
    public void setUp() {
        RestAssured.baseURI = "https://admin.dev.paynocchio.com/";
    }
    @Test
    @DisplayName("Verify that login is succeed")
    public void authorizationByPostApi() {
        String email = "i.poplavsky+29@paynocchio.com";
        String password = "Qwerye1!2345";
        Map<String, String> request = new HashMap<>();
        request.put("email", email);
        request.put("password", password);
        request.put("device", "desktop");
        given().contentType("application/json")
                .body(request)
                .when()
                .post(baseURI + "user/auth/login")
                .then()
                .log().all()
                .assertThat()
                .statusCode(200)
                .body("access_token", is(notNullValue()));
    }
    @Test
    @DisplayName("Input wrong password during login")
    public void invalidAuthorizationByPostApi() {
        String email = "i.poplavsky+29@paynocchio.com";
        String password = "Qwerye1!0988";
        Map<String, String> request = new HashMap<>();
        request.put("email", email);
        request.put("password", password);
        request.put("device", "desktop");
        given().contentType("application/json")
                .body(request)
                .when()
                .post(baseURI + "user/auth/login")
                .then()
                .log().all()
                .assertThat()
                .statusCode(403)
                .body("detail", equalTo("Could not validate credentials"));
    }
    //TODO Fix 404 not found "Expected status code <204> but was <404>."
    @Test
    @DisplayName("Logout after authorization check")
    public void logOutAfterAuthorization() {
        LoginForNextTests loginForNextTests = new LoginForNextTests();
        loginForNextTests.loginForNextTest("i.poplavsky+29@paynocchio.com", "Qwerye1!0988");
        given().contentType("application/json")
                .when()
                .post(baseURI + "/user/auth/logout")
                .then()
                .log().all()
                .assertThat()
                .statusCode(204);
    }
}