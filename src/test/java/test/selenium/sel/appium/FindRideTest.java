package test.selenium.sel.appium;

import Pages.FindRidePage;
import test.AbstractBaseTests.TestBase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Tests for a Offer Ride page
 */
public class FindRideTest extends TestBase {

	private FindRidePage findridePage;

	@Override
	public String getName() {
		return "Find Ride Page";
	}

	@BeforeTest
	@Override
	public void setUpPage() {
		findridePage = new FindRidePage(driver);
	}

	/**
	 * Ride is find
	 * 
	 * @throws InterruptedException
	 */

	@Test
	public void findridePage() throws InterruptedException {
		System.out.println("Find Ride");
		findridePage.offeraride();
		// Assert.assertEquals(loginPage.getMessage(), LOGIN_SUCCESS_MESSAGE);
	}

}
