package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;



public class ScreenShot {

	public void screenshot(WebDriver driver,String name) throws IOException {
		
		File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File destination = new File("D:\\Velocity\\Automation\\Screenshot\\"+name );// System ka path jaha par hume file save karni hain
		
		FileHandler.copy(source, destination);// file source is temprory memory se file destination is system ke permanant memory main save hogi
		
		
		}

	}
	

