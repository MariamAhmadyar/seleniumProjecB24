package com.cydeo.tests.day06_css;

import com.cydeo.Utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p3_AmazonCSSPractice {
    public static void main(String[] args) {
     WebDriver driver =WebDriverFactory.getDriver("chrome");
        driver.navigate().to("https://www.amazon.com/");
        WebElement searchBox= driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
        searchBox.sendKeys("Wooden spoon", Keys.ENTER);


    }
}
