package com.example.intelliselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CheckBox {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Workspace\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Workspace/Intelli-Selenium/src/WebApp/CheckBox.html");

        //CheckBox

        WebElement checkBox = driver.findElement(By.id("lettuceCheckbox"));
        checkBox.click();
//SELECT ITEMS TO HANDLE
        WebElement selectItem = driver.findElement(By.id("select1"));
        Select select = new Select(selectItem);

        select.selectByVisibleText("Maybe");




    }
}
