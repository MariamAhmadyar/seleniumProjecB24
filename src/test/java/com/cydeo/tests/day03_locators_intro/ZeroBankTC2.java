package com.cydeo.tests.day03_locators_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBankTC2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        String appUrl = "http://zero.webappsecurity.com/login.html";
        driver.navigate().to(appUrl);
        //WebElement zeroBankText= driver.findElement(By.linkText("Zero Bank"));
        WebElement zeroBankText1= driver.findElement(By.className("brand"));
        String textOfZeroBankText= zeroBankText1.getText();
        System.out.println(textOfZeroBankText);
        String expectedText="Zero Bank";
        if(textOfZeroBankText.equals(expectedText)){
            System.out.println("Passed!");
        }else {
            System.out.println("Failed");
        }
      String href = driver.findElement(By.className("brand")).getAttribute("href");
        System.out.println("href = " + href);

    }
}
