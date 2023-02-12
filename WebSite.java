package Automation;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.service.DriverService;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class WebSite {
	public void time() throws Throwable
	{
		Thread.sleep(5000);
	}

WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
	}
	@Test
	public void test() throws Throwable
	{
		driver.get("https://www.flipkart.com/"); 
    driver.manage().window().maximize();
    time();
    driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
    driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys("Sarees");// opening url 
    time();
    driver.findElement(By.className("L0Z3Pu")).click();
    System.out.println("Automating the Shopping website");
    time();
    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[1]/div/div/div[2]/div[5]")).click();
    time();
    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[1]/div/div/div[2]/div[4]")).click();
    time();
    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[1]/div/div/div[2]/div[2]")).click();
    time();
    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[1]/div/div/div[2]/div[3]")).click();
    time();
    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[1]/div/div/div[2]/div[1]")).click();
    time();
   
    }
	@AfterClass
	public void tierDown()
	{
		driver.close();
	}

}
