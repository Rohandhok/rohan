package Test;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.ZerodhaLoginPage;
import POM.ZerodhaSignUpPage;
import Utility.Parameterization;
import Utility.ScreenShot;

public class ZerodhaSignPageTest {
	WebDriver driver;
	
	@BeforeMethod
	public void browser(){
		driver=Browser.openBrowser();
	}
	@Test
	public void zerodhasignwithnumber() throws EncryptedDocumentException, IOException {
		ZerodhaLoginPage zerodhaloginpage=new ZerodhaLoginPage(driver);
		zerodhaloginpage.ClickOnSignUp();
		
		
		ArrayList<String> list=new ArrayList<String>(driver.getWindowHandles());
		list.get(0);
		driver.switchTo().window(list.get(1));
	
		
		
		ZerodhaSignUpPage zerodhasignpage=new ZerodhaSignUpPage(driver);
		String mobile=Parameterization.getData(6, 1);
		System.out.println(mobile);
		zerodhasignpage.EmterMoblieNum(mobile);
		zerodhasignpage.ClickOnSubmit();
		
		
//		ScreenShot.takeScreenShot(driver, mobile);
		
	}
	

}
