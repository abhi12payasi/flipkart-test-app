package com.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginApp {
    public static void main(String[] args) throws InterruptedException {

        String driverPath = "C:\\softwares\\chromedriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        Actions action = new Actions(driver);
        // cross dialog box
        // driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();

//        String loginBtnXPath = "//a[text()='Login']";
//        WebElement loginBtnElement = driver.findElement(By.xpath(loginBtnXPath));
//        loginBtnElement.click();

        //Thread.sleep(10000);
        String username = "abhi12payasi@gmail.com";
        String password = "Abhi@1230";

        String userNameXPath = "//input[@class='_2zrpKA _1dBPDZ']"; //input[@type='text']";
        WebElement userNameElement = driver.findElement(By.xpath(userNameXPath));
        userNameElement.sendKeys(username);

        String passwordXPath = "//input[@type='password']";
        WebElement passwordElement = driver.findElement(By.xpath(passwordXPath));
        passwordElement.sendKeys(password);

        String loginXPath = "//button[@class='_2AkmmA _1LctnI _7UHT_c']"; //button[@type='submit']";
        WebElement loginElement = driver.findElement(By.xpath(loginXPath));
        loginElement.click();

        Thread.sleep(5000);
        String moreBtnXPath = "//div[@class='_1jA3uo'][2]";
        WebElement moreBtnElement = driver.findElement(By.xpath(moreBtnXPath));
        action.moveToElement(moreBtnElement).perform();

        String notificationBtnXPath = "//div[@class='_1Q5BxB'][1]";
        WebElement notificationBtnElement = driver.findElement(By.xpath(notificationBtnXPath));
        notificationBtnElement.click();

        Thread.sleep(10000);
        String emailBtnXPath = "//li[text()='Email']";
        WebElement emailBtnElement = driver.findElement(By.xpath(emailBtnXPath));
        emailBtnElement.click();

        Thread.sleep(3000);

        String check1XPath = "//div[@class='_2kFyHg']";
        WebElement check1Element = driver.findElement(By.xpath(check1XPath));
        check1Element.click();

    }
}
