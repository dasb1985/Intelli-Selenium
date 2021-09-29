package com.example.intelliselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverTables {

     public static void main(String[] args){

          System.setProperty("webdriver.chrome.driver", "C:\\Workspace\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();
          driver.get("file:///C:/Workspace/Intelli-Selenium/src/WebApp/TableTest.html");


//          WebElement outterTable = driver.findElement(By.tagName("table"));
//          WebElement innerTable = outterTable.findElement(By.tagName("table"));
//          WebElement row = innerTable.findElement(By.name("td"));

          WebElement row = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[2]/table/tr[2]/td"));

          System.out.println(row.getText());
     }


}
