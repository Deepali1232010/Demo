package HomeworkWebtable;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import POJO.Browser2;

public class MinimumPrice {
	
  public static void main(String[] args) {
	WebDriver driver =  Browser2.OpenBrowser("https://demo.guru99.com/test/web-table-element.php");
	//List<WebElement> a = driver.findElements(By.xpath(""));
	
	List<WebElement> column = driver.findElements(By.xpath("//table//tbody//tr"));
	 int columnsize = column.size();
	 System.out.println(columnsize);
List<WebElement> currentPrice = driver.findElements(By.xpath("//table//tbody//tr//td[4]"));
double j = 0;
for(int i =0; i<currentPrice.size();i++)
{
WebElement price = currentPrice.get(i) ;
String currentPriceValue = price.getText();
System.out.println(currentPriceValue);
Double cpv =Double.parseDouble(currentPriceValue);
if (j < cpv)
{
	j=cpv;
} 
}

System.out.println("MINIMUM price = " + j);
	    
	
	
  	
}


	
}

