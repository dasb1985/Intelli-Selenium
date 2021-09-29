package com.example.intelliselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumTest {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Workspace\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");

        driver.manage().window().maximize();
        WebElement searchField = driver.findElement(By.name("q"));
        searchField.click();
        searchField.sendKeys(new CharSequence[]{"pluralsight"});
        searchField.sendKeys(new CharSequence[]{Keys.ENTER});

        WebDriverWait wait = new WebDriverWait(driver,10000);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Imágenes")));

        WebElement imagesLink = driver.findElement(By.linkText("Imágenes"));
        imagesLink.click();

        WebElement imageElement = driver.findElement(By.cssSelector("img[class='rg_i Q4LuWd']"));
        imageElement.click();
    }
}
