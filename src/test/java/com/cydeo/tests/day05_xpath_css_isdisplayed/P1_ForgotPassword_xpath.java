package com.cydeo.tests.day05_xpath_css_isdisplayed;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P1_ForgotPassword_xpath {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement homeLink = driver.findElement(By.xpath("//a[.='Home']"));
        System.out.println("homeLink.isDisplayed() = " + homeLink.isDisplayed());
        WebElement forgotPass = driver.findElement(By.xpath("//h2[.='Forgot Password']"));
        System.out.println("forgotPass.isDisplayed() = " + forgotPass.isDisplayed());
        WebElement e_mail = driver.findElement(By.xpath("//label[.='E-mail']"));
        System.out.println("e_mail.isDisplayed() = " + e_mail.isDisplayed());
        WebElement e_mail_Input= driver.findElement(By.xpath("//input[@type='text']"));
        System.out.println("e_mail_Input.isDisplayed() = " + e_mail_Input.isDisplayed());
        WebElement retrievePassword= driver.findElement(By.xpath("//i[.='Retrieve password']"));
        System.out.println("retrievePassword.isDisplayed() = " + retrievePassword.isDisplayed());
        WebElement poweredByCydeo= driver.findElement(By.xpath("//div[@style='text-align: center;']"));
        System.out.println("poweredByCydeo.isDisplayed() = " + poweredByCydeo.isDisplayed());
    }
}
