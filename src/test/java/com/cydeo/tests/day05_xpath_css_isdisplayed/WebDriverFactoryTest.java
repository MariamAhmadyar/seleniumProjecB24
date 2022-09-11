package com.cydeo.tests.day05_xpath_css_isdisplayed;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class WebDriverFactoryTest {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.etsy.com");



    }
}
