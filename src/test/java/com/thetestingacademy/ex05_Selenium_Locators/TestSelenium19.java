package com.thetestingacademy.ex05_Selenium_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium19 {

    @Description("To verify invalid user name and password shown")
    @Test

    public void test_negative_vwo_login() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();

        // <a href="https://vwo.com/free-trial/?utm_medium=website&amp;utm_source=login-page&amp;utm_campaign=mof_eg_loginpage"
        // class="text-link Td(n) Whs(nw)" data-qa="bericafeqo"
        // vwo-html-translate="login:startFreeTrial">
        // Start a free trial</a>

        //WebElement a_tag_free_trial = driver.findElement(By.linkText("Start a free trial"));
        //a_tag_free_trial.click();

        // Partial match
        WebElement a_tag_free_trial = driver.findElement(By.partialLinkText("free trial"));
        a_tag_free_trial.click();

        Thread.sleep(15000);
        driver.quit();
    }
}
