package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class aggrigatorSupervisor extends PageBase {

	public aggrigatorSupervisor(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	

	@FindBy(xpath ="//*[@id=\"scrollminus\"]/i")
	WebElement scrollhorizeontal ;


	@FindBy(xpath ="//*[@id=\"divListPanel\"]/div/div[2]/div/table/tbody/tr[1]/td[11]/p/a")
	WebElement detailsOFNewMErchant ;
	
	@FindBy(xpath ="//button[@id='btnSave']")
	WebElement saveBtn ;
	
	@FindBy(xpath ="//a[@class='dropdown-toggle loging_tap']")
	WebElement welcomeUSer  ;

	@FindBy(xpath ="/html/body/div[1]/div/div/div[1]/div[3]/ul/li/ul/li[2]/a")
	WebElement logout  ;
	
	
	public void aggrigatorApprove() throws Exception {
		
		scrollhorizeontal.click();
		scrollhorizeontal.click();
		Thread.sleep(3000);
		detailsOFNewMErchant.click();
		saveBtn.click();
		welcomeUSer.click();
		logout.click();
	}
	
	

}
