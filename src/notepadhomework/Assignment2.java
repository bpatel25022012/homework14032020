package notepadhomework;

/*
Navigate to website "https://demo.nopcommerce.com/"
Click on register link.
Fill the all fields.
Click on register button.

 */
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


public class Assignment2 {

    public static void main(String[] args) throws InterruptedException {

        String baseUrl = "https://demo.nopcommerce.com/";
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);

        WebElement register = driver.findElement(By.xpath("//div[@class=\"header-upper\"]//a[@class=\"ico-register\"]"));
        register.click();

        Thread.sleep(3000);
        WebElement gender = driver.findElement(By.xpath("//span[@class=\"male\"]//input[@type='radio']"));
        gender.click();

        WebElement firstname = driver.findElement(By.xpath("//div [@class=\"inputs\"]//input[@name=\"FirstName\"]"));
        firstname.sendKeys("Bhavesh");

        WebElement lastname = driver.findElement(By.xpath("//div [@class=\"inputs\"]//input[@name=\"LastName\"]"));
        lastname.sendKeys("Patel");

        WebElement day = driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
        day.sendKeys("4");

        WebElement month = driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
        month.sendKeys("April");

        WebElement year = driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
        year.sendKeys("1976");




        WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
        email.sendKeys("bpatel25@yahoo.com");

        WebElement companyname = driver.findElement(By.xpath("//input[@id='Company']"));
        companyname.sendKeys("ABC International Ltd.");

        WebElement newsletter = driver.findElement(By.xpath("//div[@class=\"inputs\"]//input[@type=\"checkbox\"]"));
        newsletter.sendKeys("");

        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("Tiger0604");

        WebElement confirmpassword = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
        confirmpassword.sendKeys("Tiger0604");

        WebElement registerbutton = driver.findElement(By.xpath("//input[@id='register-button']"));
        registerbutton.click();
    }
}