package ru.deliveryClub;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    public ChromeDriver driver;

       @Test
       public void firstTest() {
           System.setProperty("webdriver.chrome.driver", "/Users/ekuri/Downloads/chromedriver_win32(2)/chromedriver.exe");
           Chromedriver driver = new ChromeDriver();

        driver.get("https://www.delivery-club.ru/");

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Delivery Club — Доставка еды и продуктов"));

        driver.quit();    }




}
