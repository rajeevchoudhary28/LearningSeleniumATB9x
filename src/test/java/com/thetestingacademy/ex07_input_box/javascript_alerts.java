package com.thetestingacademy.ex07_input_box;

import io.qameta.allure.Description;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class javascript_alerts {

    @Description
    @Test
    public void alert_box(){


        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        //WebElement element = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        //element.click();

        //Alert alert = driver.switchTo().alert();
        //alert.accept();

        //WebElement elemests1 = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        //elemests1.click();

        //Alert alert = driver.switchTo().alert();
        //alert.accept();




        WebElement elemests1 =driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        elemests1.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Rajeev");
        alert.accept();

        String result = driver.findElement(By.id("result")).getText();
        //Assert.assertEquals(result, "You successfully clicked an alert");

        //Assert.assertEquals(result, "You clicked: Ok");

        Assert.assertEquals(result, "You entered: Rajeev");




    }
}
