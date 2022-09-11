package com.cydeo.tests.day05_xpath_css_isdisplayed;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WorldPopulation {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.worldometers.info/world-population/");
          Thread.sleep(4000);

        WebElement worldPopulation = driver.findElement(By.xpath("//div[@class='maincounter-number']"));
        System.out.println(worldPopulation.getText());

       // List<WebElement> list=driver.findElements()
        for (int i = 0; i <=9; i++) {
            Thread.sleep(2000);
            System.out.println(i+" - "+worldPopulation.getText());
        }



    }
}
