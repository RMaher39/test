package pages;

import java.util.Properties;
import java.util.Random;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
 
public class PageBase {
	
	public WebDriver driver;
	public Actions action;
	//create constructor 
	public PageBase(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	} 
	
	protected  static void Clickbutton(WebElement button) {
		
	    button.click();
		
		
	}
	
	protected static void settextinText(WebElement textelement,String value) {
		
		textelement.sendKeys(value);
	}
	
	
	public static String  RandomName() {
		 String generatedString = RandomStringUtils.randomAlphabetic(10);
		 return generatedString;
	}
	
	
	public static int RandomMobile()
	{
	Random num = new Random();
    int num0, num1, num2, num3, num4, num5, num6, num7, num8, num9, num10, num11;
    num0 = 1;
    num1 = 1;
    num2 = 1;
    num3 = num.nextInt(9) + 10;
    num4 = num.nextInt(10);
    num5 = num.nextInt(5) + 11;
    num6 = num.nextInt(10);
    num7 = num.nextInt(3);
    num8 = num.nextInt(5);
    num9 = num.nextInt(10);
    int mobileData  =Integer.valueOf(String.valueOf(num1) + String.valueOf(num2) 
    +String.valueOf(num3) + String.valueOf(num4)+String.valueOf(num5) + String.valueOf(num6) + String.valueOf(num7)+String.valueOf(num8));
      System.out.println(mobileData);
   
    return mobileData ;
 }      
	
	
	public static void main(String[] args) {

	    final String username = "automationupg@gmail.com"; //change to your Gmail username
	    final String password = "Koko44##"; //change to your Gmail password
	    final String from = "automationupg@gmail.com"; //change to from email address
	    final String to = "automationupg@gmail.com"; //change to to email address
	   final String cc = "test.cc.email@helloselenium.com"; //change to cc email address
	   final String bcc = "test.bcc.email@helloselenium.com"; //change to bcc email address
	    final String subject = "Test Email from Hello Selenium"; //change to your subject
	    final String msg = "Test Email from Hello Selenium to learn the automation of email message sending using Java Mail API from Gmail."; //change to your message

	    Properties props = new Properties();
	    props.put("mail.smtp.auth", true);
	    props.put("mail.smtp.starttls.enable", true);
	    props.put("mail.smtp.host", "smtp.gmail.com");
	    props.put("mail.smtp.port", "587");


	    Session session = Session.getInstance(props,
	            new javax.mail.Authenticator() {
	                protected PasswordAuthentication getPasswordAuthentication() {
	                    return new PasswordAuthentication(username, password);
	                }
	            });

	    try {

	        Message message = new MimeMessage(session);
	        message.setFrom(new InternetAddress(from));
	        message.setRecipients(Message.RecipientType.TO,
	                InternetAddress.parse(to));
	        //below code only requires if your want cc email address
	        message.setRecipients(Message.RecipientType.CC,
	                InternetAddress.parse(cc));
	        //below code only requires if your want bcc email address
	        message.setRecipients(Message.RecipientType.BCC,
	                InternetAddress.parse(bcc));
	        message.setSubject(subject);
	        message.setText(msg);

	        MimeBodyPart messageBodyPart = new MimeBodyPart();

	        Multipart multipart = new MimeMultipart();

	        messageBodyPart = new MimeBodyPart();
	        String file1 = "C:\\Users\\r.ayoub\\Downloads\\license41.txt"; //change to your attachment filepath
	        String fileName1 = "file.txt"; //change to your attachment filename
	        DataSource source1 = new FileDataSource(file1);
	        messageBodyPart.setDataHandler(new DataHandler(source1));
	        messageBodyPart.setFileName(fileName1);
	        multipart.addBodyPart(messageBodyPart);

	        message.setContent(multipart);

	        System.out.println("Sending");

	        Transport.send(message);

	        System.out.println("Done");

	    } catch (MessagingException e) {
	        e.printStackTrace();
	    }
	  }

	
	
}  
	
	
	
