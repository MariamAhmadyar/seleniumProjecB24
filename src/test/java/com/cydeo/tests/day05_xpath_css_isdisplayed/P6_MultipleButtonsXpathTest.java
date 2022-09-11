package com.cydeo.tests.day05_xpath_css_isdisplayed;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P6_MultipleButtonsXpathTest {

    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        WebElement button1= driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        button1.click();
        //WebElement button2= driver.findElement(By.xpath("//button[.='Button 2']"));
        //OR
        WebElement button2= driver.findElement(By.xpath("//button[text()='Button 2']"));
        if(button1.isDisplayed()){
            System.out.println("PASS: Button2 is displayed");
            button2.click();
        }else {
            System.out.println("Failed: Button2 is Not Displayed");
        }

        /*WebElement button3= driver.findElement(By.xpath("//button[@onclick='button3()']"));
        button3.click();
        WebElement button4= driver.findElement(By.xpath("//button[@onclick='button4()']"));
        button4.click();
        WebElement button5= driver.findElement(By.xpath("//button[@onclick='button5()']"));
        button5.click();*/
        WebElement resultMessage= driver.findElement(By.xpath("//p[@id='result']"));
        System.out.println(resultMessage.getText());





    }
}
