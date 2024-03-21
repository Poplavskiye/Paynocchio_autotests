package PageObject;

import com.example.paynocchio_autotests.AllureLogger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class LoginForNextTests {
    private final AllureLogger LOG = new AllureLogger(LoggerFactory.getLogger(ProfileManagementPage.class));
    private String email;
    private String password;
    public void loginForNextTest(String currentEmail, String currentPassword) {
        email = currentEmail;
        password = currentPassword;
        Map<String, String> request = new HashMap<>();
        request.put("email", email);
        request.put("password", password);
        request.put("device", "desktop");
        given().contentType("application/json")
                .body(request)
                .when()
                .post(baseURI + "user/auth/login")
                .then()
                .log().all();
        LOG.info("Sent POST to Authorization");
    }
}
