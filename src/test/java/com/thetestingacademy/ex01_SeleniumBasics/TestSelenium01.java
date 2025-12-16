package com.thetestingacademy.ex01_SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium01 {

    @Description("Open the App.vwo.com and get the title")
    @Test
    public void test_Selenium01(){

        // open the url
        // print the title
        //ChromeDriver driver = new ChromeDriver();
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://app.vwo.com/#/login");
        System.out.println(driver.getTitle());



    }
}
