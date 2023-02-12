package Practice;

import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Testing {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/"); 
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys("Handbags");// opening url 
        WebElement textbox = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"));
        textbox.sendKeys(Keys.ENTER);
        System.out.println("Automating the Shopping website");
        Thread.sleep(500);
        driver.close();
        
       
		
	}

}
