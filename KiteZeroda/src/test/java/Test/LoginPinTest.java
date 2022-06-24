package Test;

import java.io.IOException;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.ZerodhaLoginPage;
import POM.ZerodhaPinPage;
import POM.ZerodhaShereByPage;
import Utility.Parameterization;
import Utility.ScreenShot;
@Listeners(TestListeners.class)

public class LoginPinTest extends BaseTest  {

//	WebDriver driver;
	
	@BeforeMethod
	public void browser() {
		driver=Browser.openBrowser();
	}
	@Test
	public void loginToZerodhaWithPinTest() throws EncryptedDocumentException, IOException, InterruptedException {
		ZerodhaLoginPage zerodhaloginpage=new ZerodhaLoginPage(driver);
		String username=Parameterization.getData(0, 1);
		String password=Parameterization.getData(1, 1);
		zerodhaloginpage.enterUserId(username);
		zerodhaloginpage.enterPassword(password);
		zerodhaloginpage.ClickOnLogin();
		Thread.sleep(3000);
		
		ZerodhaPinPage zerodhapinpage=new ZerodhaPinPage(driver);
		String pin=Parameterization.getData(2,1);
       zerodhapinpage.Enterpin(pin);
        System.out.println(pin);
		zerodhapinpage.ClickOnSubmit();
		
		
	
		ZerodhaShereByPage zerodhasherebypage=new  ZerodhaShereByPage(driver);
	    String Shere=Parameterization.getData(7, 1);
	
		
		System.out.println(Shere);
		Thread.sleep(3000);
	zerodhasherebypage.EnterSearch(Shere);
	
		zerodhasherebypage.buy(driver);
	zerodhasherebypage.sell(driver);
		zerodhasherebypage.sellshere();
		
	Thread.sleep(2000);
	zerodhasherebypage.Cancel();
		
		ScreenShot.takeScreenShot(driver, username);
	}
		
		
		
		@Test
		public void demo() {
			System.out.println("demo");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
//        zerodhapinpage.ClickonMenu();
//        Thread.sleep(2000);
//		zerodhapinpage.ClickonHolding();
//		
//		
//		

		
		
		
	
	

}}
