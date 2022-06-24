package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaforgetPage {
	@FindBy(xpath="//label[@for='radio-60']")private WebElement remember;
	@FindBy(xpath="//label[@for='radio-61']") private WebElement forgot;
	@FindBy(xpath="//input[@placeholder='User ID']") private WebElement UserId;
	@FindBy(xpath="//input[@placeholder='PAN']")private WebElement Pan;
	@FindBy(xpath="//label[@for='radio-65']")private WebElement EmailId;
	@FindBy(xpath="//input[@placeholder='E-mail (as on account)']")private WebElement EnterEmail;
	@FindBy(xpath="class=\"button-orange wide\"") private WebElement Reset;
	
	public ZerodhaforgetPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void ClickOnRemember() {
		remember.click();
	}
	public void ClickOnforget() {
		forgot.click();
	}
	public void EnterUserId(String User) {
		UserId.sendKeys(User);	
	}
//	public void EnterPanNumber(String number) {
//		Pan.sendKeys(number);
//	}
	public void ClickOnEmailId() {
		EmailId.click();
	}
	public void ClickOnReset() {
		Reset.click();
	}
	public void EnterEmailId(String email) {
		EnterEmail.sendKeys(email);
	}

}
