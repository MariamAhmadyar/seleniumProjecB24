package com.cydeo.tests.day03_locators_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC5_SmartBearLoninTest {
    public static void main(String[] args) {
        String appUrl = "http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx";
        String userName = "Tester";
        String password = "test";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(appUrl);
        WebElement userNameElement= driver.findElement(By.id("ctl00_MainContent_username"));
        userNameElement.sendKeys(userName);

        WebElement passwordElement= driver.findElement(By.id("ctl00_MainContent_password"));
        passwordElement.sendKeys(password);

        WebElement loginElement=driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginElement.click();
        String expectedTitle="Web Orders";
        String actualTitle=driver.getTitle();
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Passed! :verification title passed");
        }else {
            System.out.println("Failed! :verification title failed");
        }
        WebElement logOut = driver.findElement(By.partialLinkText("Log"));
        logOut.click();





    }

}
