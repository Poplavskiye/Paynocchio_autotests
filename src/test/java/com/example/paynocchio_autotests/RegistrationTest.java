package com.example.paynocchio_autotests;
import PageObject.SignUpPage;
import PageObject.SignInPage;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
public class RegistrationTest {
    private static WebDriver driver;

    @BeforeEach
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
        @AfterEach
        public void TearDown() {driver.quit();}

    @Test
    public void inputData(){
        SignUpPage signUpPage = new SignUpPage(driver);
        driver.get("https://cp.dev.paynocchio.com/sign-up");
        String expectedResult = "https://cp.dev.paynocchio.com/sign-up-success";
        signUpPage.sendKeyFirstName("TestName");
        signUpPage.sendKeyLastName("TestSurname");
        signUpPage.sendKeyEmail("i.poplavsky+29@paynocchio.com");
        signUpPage.sendKeyPhone("9189032909");
        signUpPage.sendKeyOrganization("Organization");
        signUpPage.submit();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        signUpPage.sendKeyPassword("Qwerye1!2345");
        signUpPage.sendKeyConfirmPassword("Qwerye1!2345");
        signUpPage.submit();
        String url = driver.getCurrentUrl();
        assertEquals(expectedResult, url, "Registration failed");
    }
}
