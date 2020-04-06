package com.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class App {
    public static void main(String[] args) throws InterruptedException {
        String driverPath = "C:\\softwares\\chromedriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        Actions action = new Actions(driver);
        // cross dialog box
        driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();

//        finding electronics
        String electronicSpanXPath = "//span[text()='Electronics']";
        WebElement electronicElement = driver.findElement(By.xpath(electronicSpanXPath));
        action.moveToElement(electronicElement).perform();


        Thread.sleep(5000);

        // finding desired item
        String appleAnchorXPath = "//a[text()='Apple']"; ////child::a[text()='Apple']
        WebElement appleElement = driver.findElement(By.xpath(appleAnchorXPath));
        appleElement.click();
        Thread.sleep(10000);

        String iPhone8XPath = "//a[@class='_1bn9xk']"; //img[@alt='iPhone 8 Plus X3 for Store']";
        WebElement iPhone8Element = driver.findElement(By.xpath(iPhone8XPath));
        iPhone8Element.click();

        Thread.sleep(10000);
        String desiredIPhone8XPath = "//div[text()='Apple iPhone 8 Plus (PRODUCT)RED (Red, 64 GB)']";
        WebElement desiredIPhoneElement = driver.findElement(By.xpath(desiredIPhone8XPath));

        if (desiredIPhoneElement != null) {
            System.out.println("Item found !!");
        } else {
            System.out.println("Item not found !!");
        }
    }
}
