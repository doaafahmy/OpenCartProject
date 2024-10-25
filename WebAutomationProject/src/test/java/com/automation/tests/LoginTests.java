package com.automation.tests;
import org.openqa.selenium.By;
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
        public void Preconditions() {

            // Initialize the ChromeDriver (opens a new Chrome browser)
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            // Open the login page of the website
            driver.navigate().to("https://awesomeqa.com/ui/index.php?route=account/login");
        }
        @Test (priority = 0)
        //Verify user can log in with valid credentials
        public void testLoginWithValidCredentials() {
            // Locate the email, password, and login button fields using their IDs or XPaths
            WebElement username = driver.findElement(By.id("input-email")); // The actual ID
            WebElement password = driver.findElement(By.id("input-password")); // The actual ID
            WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));

            // Enter valid credentials
            username.sendKeys("doaa.fahmi@gmail.com");  //Actual valid email
            password.sendKeys("Asd@101094");  // Actual valid password

            // Click the login button
            loginButton.click();

            // Assert that the login was successful by checking if the Account element is displayed
            WebElement Account = driver.findElement(By.xpath("//*[@id=\"column-right\"]/div/a[1]"));
            Assert.assertTrue(Account.isDisplayed(), "My Account");
        }

        @Test (priority = 1)
        //Verify that login fails with an unregistered email
        public void testLoginWithInvalidCredentials() {
            // Locate the email, password, and login button fields
            WebElement username = driver.findElement(By.id("input-email")); // The actual ID
            WebElement password = driver.findElement(By.id("input-password")); // The actual ID
            WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
            // Enter invalid credentials
            username.sendKeys("basma.fahmi@gmail.com");
            password.sendKeys("Asd@101094");

            // Click the login button
            loginButton.click();

            // Check for the error message
            WebElement Warning = driver.findElement(By.xpath("//*[@id=\"account-login\"]/div[1]/i"));

            // Assert that the error message is displayed
            Assert.assertTrue(Warning.isDisplayed(), " Warning: No match for E-Mail Address and/or Password.");
        }
        @Test (priority = 2)
        //Verify login fails with a valid email and incorrect password
        public void testLoginWithInvalidCredentials2() {
            // Locate the email, password, and login button fields
            WebElement username = driver.findElement(By.id("input-email")); // The actual ID
            WebElement password = driver.findElement(By.id("input-password")); // The actual ID
            WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
            // Enter invalid credentials
            username.sendKeys("doaa.fahmi@gmail.com");
            password.sendKeys("Bsd@101094");

            // Click the login button
            loginButton.click();

            // Check for the error message
            WebElement Warning = driver.findElement(By.xpath("//*[@id=\"account-login\"]/div[1]/i"));

            // Assert that the error message is displayed
            Assert.assertTrue(Warning.isDisplayed(), " Warning: No match for E-Mail Address and/or Password.");
        }

        @Test (priority = 3)
        //Verify that login fails if no password is entered
        public void testLoginWithInvalidCredentials3() {
            // Locate the email, password, and login button fields
            WebElement username = driver.findElement(By.id("input-email")); // The actual ID
            WebElement password = driver.findElement(By.id("input-password")); // The actual ID
            WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));

            // Enter invalid credentials
            username.sendKeys("doaa.fahmi@gmail.com");

            // Click the login button
            loginButton.click();

            // Check for the error message
            WebElement Warning = driver.findElement(By.xpath("//*[@id=\"account-login\"]/div[1]/i"));

            // Assert that the error message is displayed
            Assert.assertTrue(Warning.isDisplayed(), " Warning: No match for E-Mail Address and/or Password.");
        }

        @Test (priority = 4)
        //Verify that the account is locked after several failed login attempts
        public void testLoginWithInvalidCredentials4() {
            // Locate the email, password, and login button fields
            for (int i = 0; i < 5; i++) {
            WebElement username = driver.findElement(By.id("input-email")); // The actual ID
            WebElement password = driver.findElement(By.id("input-password")); // The actual ID
            WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
                // Clear the input fields before each attempt
                username.clear();
                password.clear();
                // Enter valid email and incorrect password

            // Enter invalid credentials
            username.sendKeys("doaa.fahmi@gmail.com");
            password.sendKeys("Bsd@101094");  // Use incorrect password
            // Click the login button
            loginButton.click();

            // Check for the error message
            WebElement Warning = driver.findElement(By.xpath("//*[@id=\"account-login\"]/div[1]/i"));
            // Assert that the error message is displayed
            Assert.assertTrue(Warning.isDisplayed(), "Warning: Your account has exceeded allowed number of login attempts. Please try again in 1 hour." +(i + 1));
            WebElement accountLockedMessage = driver.findElement(By.xpath("//*[@id=\"account-login\"]/div[1]"));
            Assert.assertTrue(accountLockedMessage.isDisplayed(), "Warning: Your account has exceeded allowed number of login attempts. Please try again in 1 hour.");
        }}

    @AfterMethod
    public void postconditions ()
    {
        driver.close();
    }

}





