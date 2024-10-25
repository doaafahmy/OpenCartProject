package org.example;

import org.openqa.selenium.WebDriver;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

    public class LoginTests {

        WebDriver driver;

        @BeforeMethod
        public void setup() {
            // Set up WebDriver
            System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://awesomeqa.com/login");
        }

        @Test
        public void testLoginWithValidCredentials() {
            // Locate the username, password, and login button elements
            WebElement username = driver.findElement(By.id("input-email"));
            WebElement password = driver.findElement(By.id("input-password"));
            WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));

            // Enter valid credentials
            username.sendKeys("validUser@example.com");
            password.sendKeys("validPassword");

            // Click on the login button
            loginButton.click();

            // Wait for the dashboard or homepage to load and check for successful login
            WebElement dashboard = driver.findElement(By.id("dashboard"));  // Example element on the dashboard

            // Validate that the dashboard or a unique element for logged-in users is displayed
            Assert.assertTrue(dashboard.isDisplayed(), "Login Failed: Dashboard not displayed.");
        }

        @AfterMethod
        public void tearDown() {
            // Close the browser
            driver.quit();
        }
    }





}