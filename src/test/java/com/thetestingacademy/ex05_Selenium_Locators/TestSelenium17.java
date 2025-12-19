package com.thetestingacademy.ex05_Selenium_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium17 {

    @Description("To verify invalid user name and password shown")
    @Test

    public void test_negative_vwo_login() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();

        // <input type="email"
        // class="text-input W(100%)" name="username"
        // vwo-html-translate-attr="placeholder"
        // vwo-html-translate-placeholder="login:enterEmailID"
        // id="login-username" data-qa="hocewoqisi"
        // placeholder="Enter email ID" data-gtm-form-interact-field-id="0">

        WebElement emailInputBox1 = driver.findElement(By.id("login-username"));

        emailInputBox1.sendKeys("admin@admin.com");

        // <input type="password" class="text-input W(100%)" vwo-html-translate-attr="placeholder"
        // vwo-html-translate-placeholder="login:enterPassword"
        // name="password" id="login-password" data-qa="jobodapuxe"
        // placeholder="Enter password" data-gtm-form-interact-field-id="1">

        WebElement emailInputBox2 = driver.findElement(By.name("password"));
        emailInputBox2.sendKeys("asdf@123");

        // button type="submit" id="js-login-btn"
        // class="btn btn--primary btn--inverted W(100%) Mb(8px) Mb(0):lc"
        // onclick="login.login(event)"
        // data-qa="sibequkica"> <span class="icon loader hidden"
        // data-qa="zuyezasugu"></span> <span data-qa="ezazsuguuy"
        // vwo-html-translate="login:signIn">Sign in</span> </button>

        WebElement buttonSubmit = driver.findElement(By.id("js-login-btn"));
        buttonSubmit.click();

        // <div
        // class="notification-box-description"
        // id="js-notification-box-msg"
        // data-qa="rixawilomi">
        // Your email, password,
        // IP address or location did not match</div>

        Thread.sleep(4000);

        WebElement errorMessage = driver.findElement(By.className("notification-box-description"));
        Assert.assertEquals(errorMessage.getText(), "Your email, password, IP address or location did not match");


        Thread.sleep(15000);
        driver.quit();
    }
}
