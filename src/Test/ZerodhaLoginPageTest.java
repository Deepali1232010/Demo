package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ZerodhaLoginPageTest {

	 
		@Test //ye BeforeMetod ke bad run hota hain ek bar
		public void test() {//4
			System.out.println("Test1 executed");
		}
		

		@Test // ye second test hain isliye ye AfterMethod aur BeforeMetod ke bad run hota hain ek bar
		public void test1() {//7
			System.out.println("Test2 Executed");
		}
		
		@BeforeClass // Before Test ke turant bad run hota hain,test ke execution start hone se pahale
		public void beforeClass() {//2
			System.out.println("Before Class is executed");
		}
		
		@AfterClass // sare test ke execution khatam hone ke bad last main aur AfterTest ke pahale run hota hain
		public void afterClass() {//9
			System.out.println("After Class is executed");
		}
		
		@BeforeMethod // ye har Test ke pahale run hoga
		public void beforeMethod() {//3 6
			System.out.println("Before method is executed");
		}
		
		@AfterMethod // ye har test ke bad run hoga
		public void afterMethod() {//5 8
			System.out.println("After method is executed");
			
		}
		
		@BeforeTest // ye sabse pahale run hota hain ek bar
		public void beforeTest() {//1  
			System.out.println("BeforeTest is executed");
			
		}
		
		@AfterTest // ye sabse last main run hota hain ek bar
		public void afterTest() {//10
			System.out.println("AfterTest is executed");
			
		}
		
}
