package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class login extends PageBase{
	
	public login(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(id="details-button")
	WebElement AdvancedBtn;
	
	@FindBy(id="proceed-link")
	WebElement ContuineLINK;

	@FindBy(xpath =" //input[@id='UserName']")
	WebElement LoginuserTxtBox;
	
	@FindBy(id="userpassword")
	WebElement LoginpassworfTxtBox;
	
	@FindBy(id="sendotp")
	WebElement sendOTPBTN;
	
	@FindBy(id="otp")
	WebElement OTPtxtBox;
	
	@FindBy(id="signinbtn")
	WebElement SubmitLogin;


public void login() throws InterruptedException {
	
	   

	AdvancedBtn.click();
	ContuineLINK.click();
	LoginuserTxtBox.click();
	LoginuserTxtBox.sendKeys("QCsysadmin");
	LoginpassworfTxtBox.click();
	LoginpassworfTxtBox.sendKeys("1234");
	sendOTPBTN.click();
	OTPtxtBox.click();
	Thread.sleep(3000);
	OTPtxtBox.sendKeys("1111");
	SubmitLogin.click();
	
}

public void loginMerchant() throws InterruptedException {
	
	

	AdvancedBtn.click();
	ContuineLINK.click();
	LoginuserTxtBox.click();
	LoginuserTxtBox.sendKeys("01275346300");
	LoginpassworfTxtBox.click();
	LoginpassworfTxtBox.sendKeys("147258");
	sendOTPBTN.click();
	OTPtxtBox.click();
	Thread.sleep(3000);
	OTPtxtBox.sendKeys("1111");
	SubmitLogin.click();
	
}
public void BankMerchAdmin() throws InterruptedException {

	AdvancedBtn.click();
	ContuineLINK.click();
	LoginuserTxtBox.click();
	LoginuserTxtBox.sendKeys("BankMerchAdmin00");
	LoginpassworfTxtBox.click();
	LoginpassworfTxtBox.sendKeys("1234");
	sendOTPBTN.click();
	OTPtxtBox.click();
	Thread.sleep(3000);
	OTPtxtBox.sendKeys("1111");
	SubmitLogin.click();
}

public void BankMerchAdmin2() throws InterruptedException {
	LoginuserTxtBox.click();
	LoginuserTxtBox.sendKeys("BankMerchAdmin00");
	LoginpassworfTxtBox.click();
	LoginpassworfTxtBox.sendKeys("1234");
	sendOTPBTN.click();
	OTPtxtBox.click();
	Thread.sleep(3000);
	OTPtxtBox.sendKeys("1111");
	SubmitLogin.click();
}

public void BankMerchAdminapproval() throws InterruptedException {
	

	LoginuserTxtBox.click();
	LoginuserTxtBox.sendKeys("BankSupervisorQCUPG");
	LoginpassworfTxtBox.click();
	LoginpassworfTxtBox.sendKeys("1234");
	sendOTPBTN.click();
	OTPtxtBox.click();
	Thread.sleep(3000);
	OTPtxtBox.sendKeys("1111");
	SubmitLogin.click();
	
}
public void LoginChangePassword() throws InterruptedException {

	
	AdvancedBtn.click();
	ContuineLINK.click();
	LoginuserTxtBox.click();
	LoginuserTxtBox.sendKeys("01117211313");
	LoginpassworfTxtBox.click();
	LoginpassworfTxtBox.sendKeys("192837");
	sendOTPBTN.click();
	OTPtxtBox.click();
	Thread.sleep(3000);
	OTPtxtBox.sendKeys("1111");
	SubmitLogin.click();
}

public void loginAggregator() throws Exception {
	
	
	AdvancedBtn.click();
	ContuineLINK.click();
	LoginuserTxtBox.click();
	LoginuserTxtBox.sendKeys("01101007654");
	LoginpassworfTxtBox.click();
	LoginpassworfTxtBox.sendKeys("147258");
	sendOTPBTN.click();
	OTPtxtBox.click();
	Thread.sleep(3000);
	OTPtxtBox.sendKeys("1111");
	SubmitLogin.click();
	
}

public void loginAggregatorSuperVisor() throws Exception {
	

	LoginuserTxtBox.click();
	LoginuserTxtBox.sendKeys("BankSuperviso");
	LoginpassworfTxtBox.click();
	LoginpassworfTxtBox.sendKeys("Reda@123");
	sendOTPBTN.click();
	OTPtxtBox.click();
	Thread.sleep(3000);
	OTPtxtBox.sendKeys("1111");
	SubmitLogin.click();	
}
}
