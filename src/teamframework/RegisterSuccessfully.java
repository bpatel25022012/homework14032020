package teamframework;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterSuccessfully {

    /*
    Test Case 2 User should register successfully.
Click on Register
Enter correct details in field
Click on register  button.
Expected Result:
Success Message  “Your registration completed”
Assert above message.

     */
    WebDriver driver;

    @Before
    public void openBrowser() {
        String baseUrl = "https://demo.nopcommerce.com";
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @Test
    public void usersDetails() throws InterruptedException {

        WebElement register = driver.findElement(By.xpath("//a[@class=\"ico-register\"]"));
        register.click();

        WebElement genderMale = driver.findElement(By.xpath("//span[@class=\"male\"]//input[@type='radio']"));
        genderMale.click();
        Thread.sleep(3000);

        WebElement firstName = driver.findElement(By.xpath("//input[@id='FirstName']"));
        firstName.sendKeys("Bhavesh");


        WebElement lastName = driver.findElement(By.xpath("//input[@id=\"LastName\"]"));
        lastName.sendKeys("Patel");

        WebElement date = driver.findElement(By.xpath("//select[@name=\"DateOfBirthDay\"]"));
        date.sendKeys("4");

        WebElement month = driver.findElement(By.xpath("//select[@name=\"DateOfBirthMonth\"]"));
        month.sendKeys("July");

        WebElement year = driver.findElement(By.xpath("//select[@name=\"DateOfBirthYear\"]"));
        year.sendKeys("1976");

        WebElement email = driver.findElement(By.xpath("//input[@id=\"Email\"]"));
        email.sendKeys("bpatel286@gmail.com");

        WebElement companyName = driver.findElement(By.xpath("//input[@id=\"Company\"]"));
        companyName.sendKeys("Testing Team");

        WebElement password = driver.findElement(By.xpath("//input[@id=\"Password\"]"));
        password.sendKeys("Tiger123");

        WebElement confirmPassword = driver.findElement(By.xpath("//input[@id=\"ConfirmPassword\"]"));
        confirmPassword.sendKeys("Tiger123");

        WebElement register1 = driver.findElement(By.xpath("//input[@id=\"register-button\"]"));
        register1.click();

        WebElement registerMsg = driver.findElement(By.xpath("//div[@class=\"result\"]"));
        registerMsg.getText();


        String expectedResult = "Your registration completed";
        String actualResult = registerMsg.getText();
        Assert.assertEquals(expectedResult,actualResult);

        Thread.sleep(3000);
    }
    @Test
    public void usersDetail() throws InterruptedException {

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
        month.sendKeys("July");

        WebElement year = driver.findElement(By.xpath("//select[@name=\"DateOfBirthYear\"]"));
        year.sendKeys("1976");

        WebElement email = driver.findElement(By.xpath("//input[@id=\"Email\"]"));
        email.sendKeys("bpatel287@gmail.com");

        WebElement companyName = driver.findElement(By.xpath("//input[@id=\"Company\"]"));
        companyName.sendKeys("Testing Team");

        WebElement password = driver.findElement(By.xpath("//input[@id=\"Password\"]"));
        password.sendKeys("Tiger123");

        WebElement confirmPassword = driver.findElement(By.xpath("//input[@id=\"ConfirmPassword\"]"));
        confirmPassword.sendKeys("Tiger123");

        WebElement register1 = driver.findElement(By.xpath("//input[@id=\"register-button\"]"));
        register1.click();

        WebElement registerMsg = driver.findElement(By.xpath("//div[@class=\"result\"]"));
        registerMsg.getText();

        Thread.sleep(3000);

       /* String expectedResult = "Your registration completed";
        String actualResult = register1.getText();
        Assert.assertEquals(expectedResult,actualResult);*/

        String expectedResult = "Your Registration completed";
        String actualResult = registerMsg.getText();
        Assert.assertEquals(expectedResult, actualResult);



    }


    @After
    public void browserClosed() {
        driver.quit();
    }
}
