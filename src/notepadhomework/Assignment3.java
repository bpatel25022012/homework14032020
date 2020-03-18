package notepadhomework;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*
Assignment 3- Handle the captcha

Navigate to website "https://timesofindia.indiatimes.com/poll.cms"
add the numbers
handle the operators +, - & x.
 */


public class Assignment3 {

    public static void main(String[] args) {


        String baseUrl = "https://timesofindia.indiatimes.com/poll.cms";
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);

        WebElement yesPollbutton = driver.findElement(By.xpath("//input[@class=\"radio1\"]"));
        yesPollbutton.click();

        String mathquestionvalue = driver.findElement(By.xpath("//span[@id='mathq2']")).getText().trim();

        // remove space if exist
        String removespace = mathquestionvalue.replaceAll("\\s+", "");
        // get two numbers
        String[] parts = removespace.split("\\+");
        String part1 = parts[0];
        String part2 = parts[1];
        String[] parts1 = part2.split("=");
        String part11 = parts1[0];
        // sum two numbers
        int summation = Integer.parseInt(part1) + Integer.parseInt(part11);
        // Math Captcha value

        WebElement captcha = driver.findElement(By.xpath("//input[@id=\"mathuserans2\"]"));
        captcha.clear();
        captcha.sendKeys(""+summation);

        WebElement voteButton = driver.findElement(By.xpath("//div[@class=\"homesprite vot\"]"));
        voteButton.click();

    }
}