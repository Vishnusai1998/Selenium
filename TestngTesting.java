package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngTesting {
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
		driver.get("https://www.amazon.in"); 
    driver.manage().window().maximize();
    Thread.sleep(1000);
    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mixer grinder");// opening url
    driver.findElement(By.id("nav-search-submit-button")).click();
    
    System.out.println("Automating the Shopping website");
    Thread.sleep(5000);
    }
	@AfterClass
	public void tierDown()
	{
		driver.close();
	}

}
