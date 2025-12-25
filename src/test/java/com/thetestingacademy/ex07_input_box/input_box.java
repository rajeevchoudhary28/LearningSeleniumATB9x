package com.thetestingacademy.ex07_input_box;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class input_box {

    @Description
    @Test
    public void test_input_box(){


        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();

        driver.findElement(By.name("firstname")).sendKeys("Rajeev Choudhary");
        driver.findElement(By.id("sex-0")).click();

        // Radio box
        driver.findElement(By.id("exp-1")).click();
        // check box
        driver.findElement(By.id("tool-1")).click();




    }
}
