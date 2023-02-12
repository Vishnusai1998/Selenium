package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingTest {

	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
      driver.get("https://www.amazon.in"); 
      driver.manage().window().maximize();
     Thread.sleep(1000);
     driver.close();
  }
}
