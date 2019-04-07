package testngAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Module1
{
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After Suite");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test 1");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test 1");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method");
	}
	
	@Test(priority=1)
	public void test1()
	{
		System.out.println("Test1");
	}
	@Test(priority=0)
	public void test2()
	{
		System.out.println("Test2");
	}
	@Test(priority=2)
	public void test3()
	{
		System.out.println("Test3");
	}
	@Test(priority=3)
	public void test4()
	{
		System.out.println("Test4");
	}
	
}
