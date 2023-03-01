package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {
public static WebDriver driver;
String edgeDriverpath = System.getProperty("user.dir")+"\\drivers\\msedgedriver.exe";
	 
	@BeforeTest
	public void StartDriver() {
		System.setProperty( "webdriver.edge.driver", edgeDriverpath);
		driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.navigate().to("https://192.168.11.11:5006/Portal/Account/Login");
		
		
	}
	
	@AfterTest
	public void TearDown() {
//		driver.quit();
	}

}
