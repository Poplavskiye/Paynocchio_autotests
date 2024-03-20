package com.example.paynocchio_autotests;

import PageObject.ProfileManagementPage;
import PageObject.SignUpPage;
import PageObject.SignInPage;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;
public class AuthorizationTest {
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
    public void tearDown() {
        driver.quit();
    }
        @Test
        public void inputData() {
            SignInPage signInPage = new SignInPage(driver);
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            driver.get("https://cp.dev.paynocchio.com/sign-in");

            String expectedResult = "https://cp.dev.paynocchio.com/profile-management";
            signInPage.sendKeyEmail("i.poplavsky+29@paynocchio.com");
            signInPage.sendKeyPassword("Qwerye1!2345");
            signInPage.submit();
            wait.until(ExpectedConditions.urlToBe("https://cp.dev.paynocchio.com/profile-management"));
            Assertions.assertEquals(expectedResult, driver.getCurrentUrl(), "Authorization failed");}
    }
