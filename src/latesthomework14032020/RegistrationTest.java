package latesthomework14032020;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;

public class RegistrationTest {
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
    public void userShouldNavigateToRegisterPageSuccessFully() {

        WebElement register = driver.findElement(By.xpath("//a[@class=\"ico-register\"]"));
        register.click();
    }


    @Test
    public void userShouldRegisterSuccessfully() throws InterruptedException {

        WebElement register = driver.findElement(By.xpath("//a[@class=\"ico-register\"]"));
        register.click();

        WebElement genderMale = driver.findElement(By.xpath("//span[@class=\"male\"]//input[@type='radio']"));
        genderMale.click();

        WebElement firstName = driver.findElement(By.xpath("//input[@id=\"FirstName\"]"));
        firstName.sendKeys("Bhavesh");


        WebElement lastName = driver.findElement(By.xpath("//input[@id=\"LastName\"]"));
        lastName.sendKeys("Patel");

        WebElement date = driver.findElement(By.xpath("//select[@name=\"DateOfBirthDay\"]"));
        date.sendKeys("4");

        WebElement month = driver.findElement(By.xpath("//select[@name=\"DateOfBirthMonth\"]"));
        month.sendKeys("April");

        WebElement year = driver.findElement(By.xpath("//select[@name=\"DateOfBirthYear\"]"));
        year.sendKeys("1986");

        WebElement email = driver.findElement(By.xpath("//input[@id=\"Email\"]"));

        Thread.sleep(2000);

        Random anyEmail = new Random();
        int randomInt = anyEmail.nextInt(1000);
        email.sendKeys(+randomInt + "@gmail.com");
        email.click();

        WebElement companyName = driver.findElement(By.xpath("//input[@id=\"Company\"]"));
        companyName.sendKeys("Testing Team");

        WebElement password = driver.findElement(By.xpath("//input[@id=\"Password\"]"));
        password.sendKeys("Tiger123");

        WebElement confirmPassword = driver.findElement(By.xpath("//input[@id=\"ConfirmPassword\"]"));
        confirmPassword.sendKeys("Tiger123");

        WebElement register1 = driver.findElement(By.xpath("//input[@id=\"register-button\"]"));
        register1.click();
    }

    @After
    public void browserClosing() {
        driver.quit();
    }
}
