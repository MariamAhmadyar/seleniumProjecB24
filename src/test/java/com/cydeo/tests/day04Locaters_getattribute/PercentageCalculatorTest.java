package com.cydeo.tests.day04Locaters_getattribute;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PercentageCalculatorTest {
    public static void main(String[] args) {
        WebDriver driver =WebDriverFactory.getDriver("chrome");
        String url="https://www.calculator.net";
        driver.get(url);
        WebElement percentageCalculator= driver.findElement(By.linkText("Percentage Calculator"));
        percentageCalculator.click();
        String expectedTitle="Percentage Calculator";
        String actualTitle=driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Passed! verification of title");
        }else {
            System.out.println("Failed! verification of title failed");
        }

       WebElement percent= driver.findElement(By.id("cpar1"));
       percent.sendKeys("20");
       WebElement of = driver.findElement(By.id("cpar2"));
       of.sendKeys("120000");

       WebElement calculate= driver.findElement(By.xpath("//input[@value='Calculate']"));
       calculate.click();

       WebElement result= driver.findElement(By.className("h2result"));
       String resultValue=result.getText();
        System.out.println(resultValue);

        long a =Long.parseLong(resultValue.substring(resultValue.indexOf("2")));
        System.out.println(a);









    }
}
