package Test;

import org.testng.annotations.Test;

public class Keywords {
    // priority keyword se hum Test case ki priority mation karate hain
	@Test(priority=1,timeOut=1000)//timeOut se time set kar sakte hain test run karne ka
	public void testA() throws InterruptedException {
		//Thread.sleep(2000);
		System.out.println("testA Executed");
	}
	@Test(priority=2,invocationCount=1)//inocationCount test ko multile time run karata hain 
	public void testB() {
		System.out.println("testB Executed");
	}
	@Test(enabled=false)// agar hume koi test temporary skip karana hain to enabled=false keyword use karate hain
	public void testC() {
		System.out.println("testC Executed");
	}
	
	@Test(dependsOnMethods= {"testA"})//jab ek test dusare test ke result per depend hota hain to dependsOnMethods ye keyword use karate hain
	public void testD() {  // yaha par testD testA per depend hain
		System.out.println("testD Executed");
	}
	
}
