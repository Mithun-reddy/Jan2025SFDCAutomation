package automationframeworksfdcjan25;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class TestNgDemo {
	@BeforeMethod
	public void bm() {
		System.out.println("bm..");
	}
	
	@BeforeTest
	public void bt() {
		System.out.println("bt..");
	}
	@BeforeGroups(groups = "sanity")
	public void bc() {
		System.out.println("bc..");
	}
	
	@Test(priority = 0)
	public void loginwithInvalid() {
//		throw new ElementClickInterceptedException("");
		System.out.println("login invalid . . .");
	}
	@Test(priority = 0, groups = "sanity")
	public void loginwithInvalid2() {
//		throw new ElementClickInterceptedException("");
		System.out.println("login invalid . . .");
	}
	
	
	@Test(priority = -3, groups = "sanity")
	public void method1() {
		System.out.println("method 1 test . . .");
	}
	
	@Test(priority = 1, groups = "smoke")
	public void method2() {
		System.out.println("method2 test . . .");
	}
	
//	[A-Z][a-z][0-9]

}
