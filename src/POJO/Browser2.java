package POJO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser2 {
	public static WebDriver OpenBrowser(String url) {// here webdriver is return tye
		ChromeOptions options = new ChromeOptions();//class of Selenium
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","D:\\Selineum\\chromedriver.exe" );
		WebDriver driver = new  ChromeDriver(options);//Webdriver ki sari method driver is variable main save ki hain
		driver.get(url);// method of webdriver interface
		
		driver.manage().window().maximize();
		return driver;
	}

}
