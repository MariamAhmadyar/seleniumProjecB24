package com.cydeo.tests.day05_xpath_css_isdisplayed;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleMapXpathTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.google.com/maps/@38.832741,-77.2077967,15z");
        WebElement searchBox= driver.findElement(By.xpath("//input[@id='searchboxinput']"));
        searchBox.sendKeys("Cydeo"+Keys.ENTER);
        Thread.sleep(3000);
        WebElement directionButton= driver.findElement(By.xpath("//img[@alt='Directions']"));
        directionButton.click();
        WebElement startingAddressField=driver.findElement(By.xpath("//input[@placeholder='Choose starting point, or click on the map...']"));
        Thread.sleep(3000);
        startingAddressField.sendKeys("8104 amethyst dr, Mclean VA"+Keys.ENTER);
    }
}
