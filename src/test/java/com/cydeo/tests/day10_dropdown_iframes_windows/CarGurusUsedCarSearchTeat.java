package com.cydeo.tests.day10_dropdown_iframes_windows;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class CarGurusUsedCarSearchTeat {

    WebDriver driver;
    String url ="https://www.cargurus.com";


    @BeforeClass
    public void setUp(){
       driver= WebDriverFactory.getDriver("chrome");
       driver.get(url);
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void TitleTest(){
        String expectedTitle= "Buy & Sell Cars: Reviews, Prices, and Financing - CarGurus";
        Assert.assertEquals(driver.getTitle(),expectedTitle);

        /*WebElement make = driver.findElement(By.id("carPickerUsed_makerSelect"));
        Select select =new Select(make);
        select.selectByVisibleText("Toyota");*/

        Select allcars=new Select(driver.findElement(By.id("carPickerUsed_makerSelect")));
        allcars.selectByValue("m7");

        System.out.println(allcars.getFirstSelectedOption().getText());

        WebElement zibCode = driver.findElement(By.id("dealFinderZipUsedId_dealFinderForm"));
        zibCode.sendKeys("22003");

        WebElement searchButton = driver.findElement(By.id("dealFinderForm_0"));
        searchButton.click();


        /*Select allModels = new Select(driver.findElement(By.id("cargurus-desktop-new-search-form-car-model")));
        allcars.selectByValue("d308");*/

        WebElement resultNum=driver.findElement(By.xpath("//span[@class='eegHEr']/strong[2]"));
        System.out.println("resultNum.getText() = " + resultNum.getText());
        String s = resultNum.getText().trim().substring(0, resultNum.getText().indexOf(',')) + resultNum.getText().substring(resultNum.getText().indexOf('0'));
        System.out.println(s);

        int number=Integer.parseInt(s);
        System.out.println("number = " + number);
        Assert.assertEquals(number,5021);
    }
}
