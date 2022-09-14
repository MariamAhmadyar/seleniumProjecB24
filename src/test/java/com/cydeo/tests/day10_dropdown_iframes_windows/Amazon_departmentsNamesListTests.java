package com.cydeo.tests.day10_dropdown_iframes_windows;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

import static com.cydeo.Utilities.WebDriverFactory.getDriver;
import static org.testng.Assert.*;

public class Amazon_departmentsNamesListTests {

    WebDriver driver;
    String url ="https://www.amazon.com";

    @BeforeMethod
    public void setUp() {
        driver = getDriver("chrome");
        driver.get(url);
    }
    @Test
    public void test_all_Button() throws InterruptedException {
        String expectedTitle = "Amazon.com. Spend less. Smile more.";
        String actualTitle = driver.getTitle();
        assertEquals(actualTitle, expectedTitle);
    }

    @Test
    public void MyTest() throws InterruptedException {
            Thread.sleep(1234);
            Select deopartments = new Select(driver.findElement(By.id("searchDropdownBox")));
            assertEquals(deopartments.getFirstSelectedOption().getText(),"All Departments");
            List<WebElement>allDeportments =deopartments.getOptions();
            System.out.println("allDeportments.size() = " + allDeportments.size());

            for (WebElement allDeportment : allDeportments) {
                Thread.sleep(1000);
                if(allDeportment.getText().equals("Books")){
                    allDeportment.click();
                    Thread.sleep(1000);
                    WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
                    searchBox.sendKeys("selenium"+ Keys.ENTER);
                }
            }

            //allDeportments.forEach(p -> System.out.println("text of  departmen = "+p.getText()));




        }
    }


