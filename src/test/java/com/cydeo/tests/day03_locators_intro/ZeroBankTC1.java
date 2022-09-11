package com.cydeo.tests.day03_locators_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBankTC1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://zero.webappsecurity.com/login.html");
        // verify zero bank header
        WebElement headerZeroBank= driver.findElement(By.tagName("h3"));
        String textOfZeroBank = headerZeroBank.getText();
        System.out.println("headerZeroBank = "+textOfZeroBank);


    }
}
