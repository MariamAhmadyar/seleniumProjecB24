package com.cydeo.tests.day02_brwser_level_operations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleAndURLandSourse {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.esty.com");
        String title= driver.getTitle();
        System.out.println(title);
        String url= driver.getCurrentUrl();
        System.out.println("url = " + url);
        // System.setProperties(); other way to wright WebDriverManager.chromedriver().setup();
        String sourseCode= driver.getPageSource();
        System.out.println("driver.getPageSource() = " + sourseCode.length());
        driver.quit();

    }

}
