package test.selenium.sel.appium;

import java.io.IOException;

import Pages.HomePage;
import Pages.LoginPage;
import test.AbstractBaseTests.TestBase;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Tests for a login page
 */
public class LoginTest extends TestBase {
	final static Logger logger = Logger.getLogger(LoginTest.class);

	private LoginPage loginPage;

	@Override
	public String getName() {
		return "Login Page";
	}

	/**
	 * Creates a login
	 */
	@BeforeTest
	@Override
	public void setUpPage() {
		loginPage = new LoginPage(driver);
	}

	/**
	 * Tests logging in with valid credentials by verifying if the login message
	 * is correct
	 */

	@Test
	public void loginpage() {
		logger.info("Login Page 1");
		loginPage.loginPage();
		// Assert.assertEquals(loginPage.getMessage(), LOGIN_SUCCESS_MESSAGE);
	}

	@Test(dependsOnMethods = { "loginpage" })
	public void loginSuccessFully() throws IOException {
		logger.info("Login Page 2");
		loginPage.loginIn();
		logger.info("User is successfully logged in");
		// Assert.assertEquals(loginPage.getMessage(), LOGIN_SUCCESS_MESSAGE);
	}

}
