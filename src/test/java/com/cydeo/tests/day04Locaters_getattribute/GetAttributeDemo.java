package com.cydeo.tests.day04Locaters_getattribute;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetAttributeDemo {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.navigate().to("https://www.google.com");
        WebElement search=driver.findElement(By.name("q"));
        System.out.println("class value = "+search.getAttribute("class"));
        System.out.println("max = "+search.getAttribute("maxlength"));
        search.click();
        search.sendKeys("java book");
        System.out.println(  search.getAttribute("value"));
        System.out.println("name = "+search.getAttribute("name"));



    }
}
