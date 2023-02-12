package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LanguageScript {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt =new ChromeOptions();
		opt.addArguments("--lang=es");
		WebDriver driver = new ChromeDriver(opt);
        driver.get("https://www.google.co.in/"); 
        driver.quit();

	}

}
