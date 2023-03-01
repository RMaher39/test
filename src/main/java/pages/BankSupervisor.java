package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BankSupervisor extends PageBase{

	//public  String approvedAssert = null;


	public BankSupervisor(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	} 
 
	@FindBy(xpath ="//*[@id=\"scrollminus\"]/i")
	WebElement scrollhorizeontal ;


	@FindBy(xpath ="//*[@id=\"divListPanel\"]/div/div[2]/div/table/tbody/tr/td[11]/p/a")
	WebElement detailsOFNewMErchant ;

	@FindBy(xpath ="/html/body/div[2]/div[2]/div/div[2]")
	WebElement label ;

	@FindBy(xpath ="//*[@id=\"btnSave\"]")
	WebElement saveBTn ;

	@FindBy(xpath ="/html/body/div[2]/div[2]/div/div[4]/a[5]/span/span")
	WebElement OptionBTN ;
//
	@FindBy(xpath ="(//tr/td[@data-name=\"Status\"])[1]")
	public
	WebElement  approvedAssert ;
	

	@FindBy(xpath ="/html/body/div[1]/div/div/div[1]/div[3]/ul/li/a")
	WebElement welcomeUSer  ;

	@FindBy(xpath ="/html/body/div[1]/div/div/div[1]/div[3]/ul/li/ul/li[2]/a")
	WebElement logout  ;
	
	@FindBy(xpath ="//*[@id=\"BulkApprovalStatusApprovalPipeline\"]/a")
	WebElement bulkapprovalStatus  ;
	
	@FindBy(xpath ="//*[@id=\"divListPanel\"]/div/div[2]/div/table/tbody/tr/td[6]/p/a")
	WebElement detailsofbulkmerchant  ;
	
	
	
	

	public void saveNEwmerchant() throws InterruptedException {
		Thread.sleep(3000);
		scrollhorizeontal.click();
		scrollhorizeontal.click();
		Thread.sleep(2000);
		detailsOFNewMErchant.click();
		label.click();
		Thread.sleep(2000);
		saveBTn.click();
		welcomeUSer.click();
		logout.click();
		
	}

}