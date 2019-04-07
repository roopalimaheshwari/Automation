package testngAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Module2 {

	@BeforeTest
	public void beforeTest()
	{
		System.out.println(" Before Test 2");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println(" After Test 2");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("M2 Before Class");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("M2 After Class");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("M2 Before Method");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("M2 After Method");
	}
	
	@Test(priority=1)
	public void test1()
	{
		System.out.println("M2 Test1");
	}
	@Test(priority=0)
	public void test2()
	{
		System.out.println("M2 Test2");
	}
	@Test(priority=2)
	public void test3()
	{
		System.out.println("M2 Test3");
	}
	@Test(priority=3)
	public void test4()
	{
		System.out.println("M2 Test4");
	}
	
}
