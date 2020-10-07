package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Base {
	
	
		 public static ExtentHtmlReporter htmlReporter;
		    public static ExtentReports extent;
		    public static ExtentTest logger;
		   
		@BeforeSuite
		public void startReport(){
		           
		       htmlReporter = new ExtentHtmlReporter("D:\\LatestReport.html");
		       extent = new ExtentReports();
		       extent.attachReporter(htmlReporter);
		}
		  @AfterMethod
		    public void getResult(ITestResult result)
		    {
		       if(result.getStatus() == ITestResult.SUCCESS)
		       {
		           logger.log(Status.PASS, "Test Case Passed " + result.getName());
		       }
		       if(result.getStatus() == ITestResult.FAILURE)
		       {
		           logger.log(Status.FAIL, "Test Case Failed is "+result.getName() + result.getThrowable());
		       }
		       else if(result.getStatus() == ITestResult.SKIP)
		       {
		           logger.log(Status.SKIP, "Test Case Skipped is "+result.getName());
		       }
		}
        
		@AfterSuite
		  public void endReport(){
		                 extent.flush();
		    }
		
		WebDriver driver;
		@Parameters({"browser","url"})
		@BeforeMethod
		public void LaunchBrowser(String browser,String url)
		{
			//ChromeOptions options=new ChromeOptions();
			//options.addArguments("--disable-notifications");
			if(browser.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.get(url);
				driver.manage().window().maximize();
			}
		}
		
	/*	@Parameters({"browser","url"})
		@BeforeMethod
		public void LaunchBrowser(String browser,String url)
		{
		    if(browser.equals("chrome"))
		    {
		    	System.out.println(" Chrome Browser Launched");
		    }
		    
		    if(browser.equals("ie"))
		    {
		    	System.out.println("Ie browser launched");
		    }
		}*/
		
		

	/*@AfterMethod
	public void CloseBrowser()
	{
		System.out.println("Browser Close");
	}
	@DataProvider
	public String[][] ReadExcel()
	{
		String[][] arr=new String[3][2];
		
		arr[0][0]="UN";
		arr[0][1]="PWD";
		
		arr[1][0]="InUN";
		arr[1][1]="InPwd";
		
		arr[2][0]="";
		arr[2][1]="";
		
		return arr;
	}*/
	}

