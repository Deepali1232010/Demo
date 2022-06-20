package HomeworkWebtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import POJO.Browser2;

public class HighestpricePreviousclose {
	public static void main(String[]args) {
		WebDriver driver = Browser2.OpenBrowser("https://demo.guru99.com/test/web-table-element.php");
		List<WebElement>  preprice = driver.findElements(By.xpath("//table//tbody//tr[10]//td"));
		int a =  preprice.size() ;
		System.out.println(a);
		
		for(int i = 0 ; i<preprice.size(); i++)
		{
			WebElement A = preprice.get(i);
			String tdcolumn = A.getText();
			System.out.println(tdcolumn);
		}
		
	
		List<WebElement>  previousprice = driver.findElements(By.xpath("//table//tbody//tr//td[3]"));
		int X = previousprice.size();
		System.out.println("Total count of previousCloseprice " + X);
		
		  double max=0;
		for(int d =0; d<previousprice.size(); d++)
		{
			WebElement Y = previousprice.get(d);
			String totalprise = Y.getText();
			System.out.println(totalprise);
			Double E =Double.parseDouble(totalprise);
		
		if(max < E)
		{
			max = E;
		}
		}	
		 System.out.println("highest previousCloseprice = " + max);
}
}