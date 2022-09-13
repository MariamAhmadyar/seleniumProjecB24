package com.cydeo.tests.day09_testng_dropdowns;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EtsySearchTests {

    @BeforeMethod
    public  void setUp(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.etsy.com");
    }

      @Test
      public void TestNGIntro(){

          /*String actualTitle = driver.getTitle();
          String expectedTitle= "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
          Assert.assertEquals(actualTitle,expectedTitle);*/
      }



}
