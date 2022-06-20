package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import POJO.Browser2;

public class DemoTable {
	
	public static void main (String[]args) {
		WebDriver driver = Browser2.OpenBrowser("https://demo.guru99.com/test/web-table-element.php");
		WebElement stock = driver.findElement(By.xpath("//table//tbody//tr[2]//td[4]"));
		 String name  = stock.getText();
		 System.out.println(name);
		 
	
	}
}
