package Pages;

import java.io.IOException;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;

import utilities.Propertyutil;

/**
 * A login page
 */
public class LoginPage extends BasePage {
	final static Logger logger = Logger.getLogger(LoginPage.class);

	/**
	 * The login button
	 */

	@AndroidFindBy(className = "android.widget.Button")
	private MobileElement loginButton;

	public LoginPage(AppiumDriver driver) {
		super(driver);
	}

	public void loginPage() {
		logger.info("--------Login Test Case Started------\n\n\n\n");
		loginButton.click();
	}

	/**
	 * Tries to login with a set of credentials
	 * 
	 * @throws IOException
	 */

	public void loginIn() throws IOException {

		try {
			logger.info("Login Test cases tarted  ");
			String loginaccount = Propertyutil.getPropValues("loginaccount");

			logger.info("Choose Account from Config:  " + loginaccount);
			Thread.sleep(5000);

			driver.findElement(By.xpath("//android.widget.TextView[@text="+loginaccount.trim()+"]")).click();
			Thread.sleep(15000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			logger.error("---inside catch" + e1.toString());
		}

	}

}

/**
 *
 * @return the login message
 */
/*
 * public String getMessage(){
 * logger.info("--------------"+driver.findElementsByTagName
 * ("content-desc").toString()); return "aa";
 * //driver.findElementById("login_alt_message_textView").getText(); }
 */

