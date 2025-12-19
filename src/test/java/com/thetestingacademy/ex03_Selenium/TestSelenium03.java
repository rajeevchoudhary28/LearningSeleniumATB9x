package com.thetestingacademy.ex03_Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium03 {

    @Description("Open the App.vwo.com and get the title")
    @Test
    public void test_Selenium01() {

      // selenium
        // you need to set up the drivers
      //  system.getProperty("web driver.gecko.driver", "path/geckdriver");

        // selenium 4
        // selenium manager -- utility -- which can download the driver automatically
        // start and stop itself

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://google.com");

    }
}