package com.qa.TestNGScripts.Day4;

import org.testng.annotations.Test;

public class TestGroupDemo {
	
	
	// group 1 : UnitTesting
	// group 2 : IntgrationTesting
	// group3 : RegressionTesting
	
	@Test(priority='1', groups="UnitTesting")
	public void testcase1()
	{
		System.out.println(" it is part of unit testing");
	}
	@Test(priority='1', groups="IntegrationTesting")
	public void testcase2()
	{
		System.out.println(" it is part of Integration testing");
	}
	@Test(priority='2', groups="UnitTesting")
	public void testcase3()
	{
		System.out.println(" it is part of unit testing");
	}
	@Test(priority='1', groups="RegressionTesting")
	public void testcase4()
	{
		System.out.println(" it is part of Regression testing");
	}
	@Test(priority='2', groups="RegressionTesting")
	public void testcase5()
	{
		System.out.println(" it is part of Regression testing");
	}
	@Test(priority='3', groups="RegressionTesting")
	public void testcase6()
	{
		System.out.println(" it is part of Regression testing");
	}
}
