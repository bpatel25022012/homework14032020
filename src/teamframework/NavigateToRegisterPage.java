package teamframework;


import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class NavigateToRegisterPage {
    /*
Test Case 1 User should navigate to register page successfully.
Click on Register Link
Message   “Your Personal Details“
Assert above message.
*/
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
    public void userShouldNavigateToRegisterPageSuccesfully() throws InterruptedException {
        WebElement register = driver.findElement(By.xpath("//a[@class=\"ico-register\"]"));
        register.click();

        WebElement registerFeature = driver.findElement(By.xpath("//strong[contains(text(),'Your Personal Details')]"));
        registerFeature.getText();

        String expectedText = "Your Personal Details";
        String actualText = registerFeature.getText();
        Assert.assertEquals(expectedText, actualText);

        Thread.sleep(3000);

    }

    @Test
    public void userShouldNavigateToRegisterPageUnSuccessfully() throws InterruptedException {
        WebElement register = driver.findElement(By.xpath("//a[@class=\"ico-register\"]"));
        register.click();

        WebElement registerFeature = driver.findElement(By.xpath("//strong[contains(text(),'Your Personal Details')]"));
        registerFeature.getText();

        Thread.sleep(3000);
        String expectedResult = "Your Personal Detail";
        String actualResult = registerFeature.getText();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @After
    public void browserClose() {
        driver.quit();


    }
}

