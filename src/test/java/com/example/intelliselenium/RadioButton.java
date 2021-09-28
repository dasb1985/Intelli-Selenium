package com.example.intelliselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButton {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Workspace\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Workspace/Intelli-Selenium/src/WebApp/RedioButtonTest.html");
        //Don't use this one is just for this fun
        Thread.sleep(5000);
        List<WebElement> radioButtons =driver.findElements(By.name("color"));
        radioButtons.get(1).click();

    }
}
