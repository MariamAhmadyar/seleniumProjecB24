package com.cydeo.tests.day03_locators_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3_ClickGmailVerifyTitle {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        String url="https://www.google.com";
        driver.navigate().to(url);

        WebElement gmailLink= driver.findElement(By.linkText("Gmail"));
        gmailLink.click();

        String actualGoogleTitle= driver.getTitle();
        String expectedGoogleTitle="Google";
        if(actualGoogleTitle.contains(expectedGoogleTitle)){
            System.out.println("Passed! :Gmail Title verification passed");
        }else {
            System.out.println("Failed! :Gmail Title verification failed");
        }
        driver.navigate().back();
        String expectedGmailTitle= "Google";
        String actualGmailTitle =driver.getTitle();
        if(actualGmailTitle.equals(expectedGmailTitle)){
            System.out.println("Passed! :Google Title verification passed");
        }else {
            System.out.println("Failed! :Google Title verification failed");
        }
        driver.quit();

    }
}
