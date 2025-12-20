package com.thetestingacademy.ex06_SeleniumXpath;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Testseleniumex20 {

    @Description("Xpath test")
    @Test
    public void test_katalon_login() throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();

        WebElement make_appointment_button = driver.findElement(By.xpath("//a[@id='btn-make-appointment']"));
        make_appointment_button.click();

        Thread.sleep(3000);


        // Or use Id
        List<WebElement> User_name_input_box = driver.findElements(By.xpath("//input[@placeholder='Username']"));
        User_name_input_box.get(1).sendKeys("John Doe");

        WebElement Password_input_box = driver.findElement(By.xpath("//input[@name='password']"));
        Password_input_box.sendKeys("ThisIsNotAPassword");

        WebElement login_button = driver.findElement(By.xpath("//button[@id='btn-login']"));
        login_button.click();


        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");
    }
}
