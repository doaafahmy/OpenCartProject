package Tests;

import Pages.Loginpages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login {
    //public static void main(String[] args) {

        //WebDriver driver;
        //1.open the browser
        //driver = new ChromeDriver();
        //2.navigate to google
        //driver.navigate().to("https://awesomeqa.com/ui/index.php?route=account/login");
        // 3. locate searchbar
        //WebElement EMailAddress= driver.findElement(By.id("input-email"));
        //EMailAddress.sendKeys("doaa.fahmi@gmail.com");
        //EMailAddress .sendKeys(Keys.ENTER);

        //driver.findElement(By.id("input-email")).sendKeys("doaa.fahmi@gmail.com");
        //driver.findElement(By.id("input-password")).sendKeys("Asd@101094");
        //driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
        //Assert.assertFalse(driver.findElement(By.xpath("//*[@id=\"column-right\"]/div/a[1]")).isDisplayed());
    //}
        WebDriver driver ;
    @BeforeMethod
    public void preconditions ()
    {
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://awesomeqa.com/ui/index.php?route=account/login");
    }
    @AfterMethod
    public void postconditions ()
    {
        driver.close();
    }
@Test (priority = 0)
public void TC1()
{

    // 3. locate searchbar
    //WebElement EMailAddress= driver.findElement(By.id("input-email"));
    //EMailAddress.sendKeys("doaa.fahmi@gmail.com");
    //EMailAddress .sendKeys(Keys.ENTER);

   // driver.findElement(By.id("input-email")).sendKeys("doaa.fahmi@gmail.com");
    WebElement input-email=driver.findElement(By.id("input-email")).sendKeys("Asd@101094");

driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
    Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"column-right\"]/div/a[1]")).isDisplayed());
}}
