package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Test2 extends Base{
	
	@Test(priority=2,description="Fb Test case")
	public void facebook()
	{
		logger=extent.createTest("Facebook", "Fb Test case");
		
		logger.log(Status.INFO, "Enter credentials");
		
		logger.log(Status.INFO, "Click on chat icon");
		
		logger.log(Status.INFO, "Click on new messagde link");
		System.out.println("Inside tc04");
		Assert.assertTrue(true);;
	}
	@Test(priority=1,description="test case 05")
	public void tc05()
	{
	    logger=extent.createTest("tc05");
	    
        logger.log(Status.INFO, "Doing step1");
		
		logger.log(Status.INFO, "Doing step2");
		
		logger.log(Status.INFO, "Doing step3");
		System.out.println("Inside tc05");
		Assert.assertTrue(false);
	}
}
