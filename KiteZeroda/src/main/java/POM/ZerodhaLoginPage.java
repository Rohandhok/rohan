package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ZerodhaLoginPage {
	@FindBy(xpath="//input[@type='text']") private WebElement UserId;
	@FindBy(xpath="//input[@type='password']") private WebElement pass;
	@FindBy(xpath="//button[@type='submit']") private WebElement login;
	@FindBy(xpath="//a[@class='text-light forgot-link']") WebElement Forget;
	@FindBy(xpath="//a[text()=\"Don't have an account? Signup now!\"]") WebElement Signup;
	
	
	public ZerodhaLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void enterUserId(String user) {
		UserId.sendKeys(user);
	}
	public void enterPassword(String Pass) {
		pass.sendKeys(Pass);
	}
	public void ClickOnLogin() {
		login.click();
	}
	public void ClickOnForget() {
		Forget.click();
	}
	public void ClickOnSignUp() {
		Signup.click();
		
	}
	
	


	
	

}

