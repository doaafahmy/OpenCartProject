import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class GoogleTest {

    public static void main(String[] args) {
        WebDriver driver ;
        //1.open the browser
        driver= new ChromeDriver();
        //2.navigate to google
        driver.navigate().to("https://www.google.com/");
        // 3. locate searchbar
        WebElement SearchBar= driver.findElement(By.id("APjFqb"));
        //4.search for linkedin
        SearchBar.sendKeys("linkedin");
        //5.click enter
        SearchBar.sendKeys(Keys.ENTER);
        // Close
        driver.close();


    }
}
