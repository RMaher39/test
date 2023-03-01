package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mail extends PageBase {



	public Mail(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void sendreport() throws InterruptedException, IOException, AWTException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		//driver.switchTo().newWindow(WindowType.TAB);
//		// Opens LambdaTest homepage in the newly opened tab
//		driver.navigate().to("https://mail.google.com/");
		driver.get("https://mail.google.com/");
		// waiting for the user name field
		WebElement userName = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='identifierId']")));
		// typing user name
		userName.sendKeys("automationupg");
		// wait next button after typing the email
		WebElement userNameNext = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='identifierNext']")));
		// clicking next after typing the email
		userNameNext.click();
		// waiting password field
		WebElement password = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='password']//input[@name='password']")));
		// typing the password
		password.sendKeys("Koko44##");

		// waiting next button after typing the password
		WebElement passwordNext = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='passwordNext']")));
		// clicking next after typing the password
		passwordNext.click();

		// waiting the compose email button
		WebElement compaseEmailButton = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),'Compose')]")));
		// clicking compose email button
		compaseEmailButton.click();

		// waiting the TO email text field
		WebElement sendToTextField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name='to']")));
		// clicking and send keys the 'to' text field
		sendToTextField.sendKeys(String.format("majles.automate@gmail.com"));
		sendToTextField.sendKeys(Keys.ENTER);
		// fetching Email Body from property file

		// sending keys in subject(adding the email.subject from property file + time
		// stamp to confirm unique identifier for the email subject used)
		// waiting email subject field
		WebElement emailSubject = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='subjectbox']")));
		// sending keys in Email subject
		emailSubject.sendKeys("automation report");

		// upload file from windows
		driver.findElement(By.xpath("//div[@aria-label='Attach files']")).click();
		Robot robot = new Robot();
		StringSelection selection = new StringSelection(
				"C:\\Users\\rmaher\\eclipse-workspace\\Objectpage\\test-output\\index.html");
		Clipboard clibboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clibboard.setContents(selection, null);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(10000);
		WebElement sendButton = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[text()='Send'])[1]")));

		// clicking send button
		sendButton.click(); 
		//		WebElement assert1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'automation report')]")));
		//		assertTrue(assert1.isDisplayed());
	} 
}
