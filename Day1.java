package Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day1 {
	WebDriver driver;

	@SuppressWarnings("deprecation")
	public void time()
	{
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void test() throws Throwable
	{
		System.out.println("performing Get command operations");
		driver.get("file:///D:/Testing.html"); 
	    driver.manage().window().maximize();
	    time();
	    
	    System.out.println("Automating the Shopping website");
	    Thread.sleep(2000);
		String name =driver.getTitle();
		System.out.println(name);
		String sc= driver.getPageSource();
		System.out.println(sc);
		String url= driver.getCurrentUrl();
		System.out.println(url);
		time();
		driver.findElement(By.id("textbox")).sendKeys("VishnuSai");
		Thread.sleep(2000);
		driver.findElement(By.id("emailid")).sendKeys("sai2@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/center/form/input[3]")).sendKeys("01/10/1998");
		Thread.sleep(2000);
		Select dd = new Select(driver.findElement(By.xpath("/html/body/center/form/select")));
		dd.selectByVisibleText("+91");
		Thread.sleep(2000);
		driver.findElement(By.className("mradio")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("cbox")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("submit")).click();
		time();
		String it;
		it=driver.switchTo().alert().getText();
		System.out.println(it);
		driver.switchTo().alert().accept();
		
	}
	@AfterClass
	public void tierDown()
	{
		driver.quit();
	}
}
