package Test;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import POJO.Browser;
import POM.ZerodhaLoginPage;
import Utility.Parameterization;
import Utility.Report;
import io.netty.handler.codec.http.HttpContentEncoder.Result;

@Listeners(TestListeners.class)

public class LoginPageTest extends BaseTest {
	
	ExtentReports reports;
	ExtentTest test;
	
	@BeforeTest
	public void ExtentReports() {
		reports=Report.createReport();
	}
	
//	WebDriver driver;// because they inside the private method not call another class that use 
	                  //in public 
	
	
	@BeforeMethod
	public void browser() {
		driver =Browser.openBrowser();
	}
	
	@Test
	
	public void loginWithCrenditalTest() throws EncryptedDocumentException, IOException {
		test=reports.createTest("loginWithCrenditalTest");
		ZerodhaLoginPage zerodhaLoginPage=new ZerodhaLoginPage(driver);
		String username=Parameterization.getData(0, 1);
		String password=Parameterization.getData(1, 1);
		zerodhaLoginPage.enterUserId(username);
		
		zerodhaLoginPage.enterPassword(password);
		zerodhaLoginPage.ClickOnLogin();
	}
	
	
	@Test
	
	public void ForgetLinkText() {
		test=reports.createTest("ForgetLinkText");
		ZerodhaLoginPage zerodhaLoginPage=new ZerodhaLoginPage(driver);
		zerodhaLoginPage.ClickOnForget();
	}
	
	@Test
	public void SignupLinkTest() {
		test=reports.createTest("SignupLinkTest");
		ZerodhaLoginPage zerodhaLoginPage=new ZerodhaLoginPage(driver);
		zerodhaLoginPage.ClickOnSignUp();
	}
		
		
     @Test
     @AfterMethod
     public void closeBrowser(ITestResult result) {
    	 if (result.getStatus()==ITestResult.FAILURE)
     
     {
    	test.log(Status.FAIL,result.getName()); 
     }
    	 else if (result.getStatus()==ITestResult.SUCCESS)
    	 {
    		 test.log(Status.PASS,result.getName());
    		 
    	 }
    	 else
    	 {
    		 test.log(Status.SKIP,result.getName());
    	 }
     }
    	@AfterTest
    	public void flushResult() 
    	{
    		reports.flush();
    	}		
	}


