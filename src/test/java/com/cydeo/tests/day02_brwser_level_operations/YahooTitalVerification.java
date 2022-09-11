package com.cydeo.tests.day02_brwser_level_operations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooTitalVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver  =new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.yahoo.com");
        String title=driver.getTitle();
        String expected="Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";
        if(title.equalsIgnoreCase(expected)){
            System.out.println("Title verification passed");
        }else {
            System.out.println("Title verification failed");
        }

    }
}
