package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpages {
    WebDriver driver;

    //locators

By input_email_Textbox =By.id("input-email");
By input_password_Textbox =By.id("input-password");
By Login_Button =By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");


    //methods
    public WebElement input-email();
    {
     return;driver.findElement(input_email_Textbox);

    }
    public WebElement input-password();
    {
        return;driver.findElement(input_password_Textbox);
    }
    public WebElement "//*[@id=\"content\"]/div/div[2]/div/form/input"();
    {
        return.findElement(Login_Button );

    }
}
