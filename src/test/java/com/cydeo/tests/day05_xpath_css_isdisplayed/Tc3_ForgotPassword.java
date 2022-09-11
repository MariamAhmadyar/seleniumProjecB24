package com.cydeo.tests.day05_xpath_css_isdisplayed;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Tc3_ForgotPassword {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        String url = "http://practice.cybertekschool.com/forgot_password";
        driver.get(url);
        WebElement searchBox= driver.findElement(By.name("email"));
        searchBox.sendKeys("vabaro2365@lurenwu.com");
        WebElement retrievePassword= driver.findElement(By.id("form_submit"));
        retrievePassword.click();
        String getUrl = driver.getCurrentUrl();

        if(getUrl.contains("email_sent")){
            System.out.println("URL contain email_sent: Test is passed");
        }else {
            System.out.println("URL does not contain email_sent: test is failed");
        }

        WebElement messageText=driver.findElement(By.name("confirmation_message"));
        String s=messageText.getText();

        if(s.equals("Your e-mail's been sent!")){
            System.out.println("Test has been passed");
        }else {
            System.out.println("Test has been failed");
        }
        System.out.println(messageText.getAttribute("name"));
        driver.quit();







    }
}
