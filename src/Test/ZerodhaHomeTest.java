package Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;





public class ZerodhaHomeTest {

	@Test
	public void GoHomepageTest() {
	System.out.println("Homepage opened");	
	}
	
	@Test
	@Parameters({"c"})
	public void HomePageTest(String c) {
		System.out.println(c);
	}
	
	@Test
	@Parameters({"a","b"})
	public void add(int a,int b) {
		System.out.println(a+b);
	}
		
}
