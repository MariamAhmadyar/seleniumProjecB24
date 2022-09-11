package com.cydeo.tests.day05_xpath_css_isdisplayed;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Practice_cybertek_school {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/");
        WebElement multipleButtons= driver.findElement(By.xpath("/html/body/div/div[2]/div/ul/li[34]/a"));
        multipleButtons.click();
        WebElement button1 = driver.findElement(By.xpath("/html/body/nav/div[2]/div/div[1]/botton[1]"));
    }
}
