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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get("https://cp.dev.paynocchio.com/sign-up");
        String expectedResult = "https://cp.dev.paynocchio.com/sign-up-success";
        String myPassword = "Qwerye1!2345";
        signUpPage.sendKeyFirstName("TestName");
        signUpPage.sendKeyLastName("TestSurname");
        signUpPage.sendKeyEmail("i.poplavsky+290@paynocchio.com");
        signUpPage.sendKeyPhone("(999)-901-2390");
        signUpPage.sendKeyOrganization("Organization");
        signUpPage.submit();
        //wait.until(ExpectedConditions.visibilityOf();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        signUpPage.sendKeyPassword(myPassword);
        signUpPage.submit();
        wait.until(ExpectedConditions.urlToBe("https://cp.dev.paynocchio.com/sign-up-success"));
        assertEquals(expectedResult, driver.getCurrentUrl(), "Registration failed");
    }
}
