package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/"); 
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("vishnu sai yadlapalli");// opening url 
        WebElement textbox = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
        textbox.sendKeys(Keys.ENTER);
        driver.manage().window().maximize();
		System.out.println(driver.getTitle());  //Printing title
		driver.findElement(By.linkText("Images")).click();
		Thread.sleep(2000);
		int n = 10;
        for (int i = -3*n/2; i <= n; i++) {
            for (int j = -3*n/2; j <= 3*n/2; j++) {
                if ((Math.abs(i) + Math.abs(j) < n)
                    || ((-n/2-i) * (-n/2-i) + ( n/2-j) * ( n/2-j) <= n*n/2)
                    || ((-n/2-i) * (-n/2-i) + (-n/2-j) * (-n/2-j) <= n*n/2)) {
                    System.out.print("* ");
                }
                else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
		
		driver.quit();
		
		
	}

}
