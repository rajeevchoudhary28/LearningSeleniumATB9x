package com.thetestingacademy.ex02_SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testselenium {

    @Description("ACGI QA test")
    @Test

    public void test_selenium(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://lifesciences-qa.acgi.in/");
        driver.manage().window().maximize();

    }
}
