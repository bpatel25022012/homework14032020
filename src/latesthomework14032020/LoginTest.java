package latesthomework14032020;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginTest {
    WebDriver driver;

    @Before
    public void openBrowser() {
        String baseUrl = "https://demo.nopcommerce.com/";
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessFully() {

        WebElement loginButton = driver.findElement(By.xpath("//a[@class=\"ico-login\"]"));
        loginButton.click();
    }


    @Test
    public void userShouldLoginSuccessfully() {

        WebElement loginButton = driver.findElement(By.xpath("//a[@class=\"ico-login\"]"));
        loginButton.click();

        WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("Tiger123@gmail.com");

        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("xyz123");


        WebElement clickOnLoginButton = driver.findElement(By.xpath("//input[@class=\"button-1 login-button\"]"));
        clickOnLoginButton.click();
    }

    @After
    public void browserClosing() {
        driver.quit();
    }
}
