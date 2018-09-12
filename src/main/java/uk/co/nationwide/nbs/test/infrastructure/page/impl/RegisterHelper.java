package uk.co.nationwide.nbs.test.infrastructure.page.impl;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Component;

import uk.co.nationwide.nbs.test.infrastructure.page.Page;
import uk.co.nationwide.nbs.test.infrastructure.utils.TestHelper;

@Component
public class RegisterHelper extends AbstractPageUtils implements Page {

	private WebDriver driver;
	private Map<String, String> propositionsUrls;

	/****
	 * xpaths will need changed below when we have time!!!!!!!!!
	 */

	// elements
	// by className
	private String alreadyRegisteredLink = "dismiss-btn";
	// by xpath
	private String firstNameLabel = "//*[@id='input-field-top-section']/div[1]/div[1]/h4";
	// by id
	private String firstNameInput = "first-name-input";
	// by xpath
	private String surnameLabel = "//*[@id='input-field-top-section']/div[1]/div[2]/h4";
	// by id
	private String surnameInput = "surname-input";
	// by xpath
	private String emailAddressLabel = "//*[@id='input-field-top-section']/div[1]/div[3]/h4";
	// by id
	private String emailAddressInput = "email-address-input";
	// by xpath
	private String setPasswordLabel = "//*[@id=\'input-field-top-section\']/div[1]/div[4]/h4";
	// by id
	private String setPasswordInput = "cfm-pwd-fst-input";
	// by xpath
	private String confirmPasswordLabel = "//*[@id='input-field-top-section']/div[1]/div[5]/h4";
	// by id
	private String confirmPasswordInput = "cfm-pwd-snd-input";
	// by xpath
	private String nextButton = "next-btn";
	// by classname
	private String firstNameInputHighlight = "firstName";

	private String lastNameInputHighlight = "lastName";

	private String emailInputHighlight = "email";

	private String setPasswordInputHighlight = "newPassword";

	// by name
	private String confirmPasswordInputHighlight = "confirmNewPassword";

	// by xpath
	private String backarrow = "back-to-register-btn";

	// by link
	private String confirmdetials = "confirm-details-btn";

	// by link
	private String editdetails = "edit-details-btn";

	private String registerback = "back-to-welcome-btn";

	// by class
	private String passwordtext = "help-text";

	// by class
	private String passwordtextLines = "help-text-line";

	private String FpnLink = "//*[@id=\"input-field-top-section\"]/div[1]/div[6]/p/a";

	private String confirmFpnLink = "//*[@id=\"input-field-top-section\"]/div[1]/div[6]/p/a";

	@Override
	public void go(String proposition) {
		this.driver.get(String.format("%s/register", this.propositionsUrls.get(proposition)));

	}

	@Override
	public void click(String element) {
		switch (element.toLowerCase()) {
		case "already registered":
			this.driver.findElement(By.className(alreadyRegisteredLink)).click();
			break;
		case "next":
			this.driver.findElement(By.id(nextButton)).click();
			break;
		case "confirm details":
			this.driver.findElement(By.id(confirmdetials)).click();
			break;
		case "edit your details":
			this.driver.findElement(By.id(editdetails)).click();
			break;
		case "back":
			this.driver.findElement(By.id(backarrow)).click();
			break;
		case "register back":
			this.driver.findElement(By.id(registerback)).click();
			break;
		case "fpnlink":
			this.driver.findElement(By.xpath(FpnLink)).click();
			break;
		case "confirmfpnlink":
			this.driver.findElement(By.xpath(confirmFpnLink)).click();
			break;
		default:
			System.out.println("Cant find element " + element);
		}

	}

	@Override
	public void enterText(String text, String element) {
		switch (element.toLowerCase()) {
		case "your first name":
			this.driver.findElement(By.id(firstNameInput)).clear();
			this.driver.findElement(By.id(firstNameInput)).sendKeys(text);
			break;
		case "your surname":
			this.driver.findElement(By.id(surnameInput)).clear();
			this.driver.findElement(By.id(surnameInput)).sendKeys(text);
			break;
		case "your email address":
			this.driver.findElement(By.id(emailAddressInput)).clear();
			this.driver.findElement(By.id(emailAddressInput)).sendKeys(text);
			break;
		case "generated email address":
			this.driver.findElement(By.id(emailAddressInput)).clear();
			long time = System.currentTimeMillis();
			this.driver.findElement(By.id(emailAddressInput)).sendKeys(text + time + "@test.com");
			System.out.println(text + time + "@test.com");
			break;
		case "set password":
			this.driver.findElement(By.id(setPasswordInput)).clear();
			this.driver.findElement(By.id(setPasswordInput)).sendKeys(text);
			break;
		case "confirm your password":
			this.driver.findElement(By.id(confirmPasswordInput)).clear();
			this.driver.findElement(By.id(confirmPasswordInput)).sendKeys(text);
			break;
		default:
			System.out.println("Cant find element " + element);
		}

	}

	@Override
	public void clearText(String type, String accessName) {
		// TODO Auto-generated method stub

	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "register";
	}

	@Override
	public void setDriver(WebDriver driver) {
		this.driver = driver;

	}

	@Override
	public void setPropositionsUrls(Map<String, String> propositionsUrls) {
		// TODO Auto-generated method stub

	}

	@Override
	public void checkPageElements(List<String> list) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<String> elements = list;
		int size = elements.size();

		for (int i = 0; i < size; i++) {

			String element = elements.get(i).toString();

			switch (element.toLowerCase()) {
			case "your first name label":
				Assert.assertTrue("testing first name label",
						this.driver.findElement(By.xpath(firstNameLabel)).isDisplayed());
				break;
			case "your first name field":
				Assert.assertTrue("testing first name field",
						this.driver.findElement(By.id(firstNameInput)).isDisplayed());
				break;
			case "your surname label":
				Assert.assertTrue(this.driver.findElement(By.xpath(surnameLabel)).isDisplayed());
				break;
			case "your surname field":
				Assert.assertTrue(this.driver.findElement(By.id(surnameInput)).isDisplayed());
				break;
			case "your email address label":
				Assert.assertTrue(this.driver.findElement(By.xpath(emailAddressLabel)).isDisplayed());
				break;
			case "your email address field":
				Assert.assertTrue(this.driver.findElement(By.id(emailAddressInput)).isDisplayed());
				break;
			case "set password label":
				Assert.assertTrue(this.driver.findElement(By.xpath(setPasswordLabel)).isDisplayed());
				break;
			case "set password field":
				Assert.assertTrue(this.driver.findElement(By.id(setPasswordInput)).isDisplayed());
				break;
			case "confirm password label":
				Assert.assertTrue(this.driver.findElement(By.xpath(confirmPasswordLabel)).isDisplayed());
				break;
			case "confirm password field":
				Assert.assertTrue(this.driver.findElement(By.id(confirmPasswordInput)).isDisplayed());
				break;
			case "next":
				Assert.assertTrue(this.driver.findElement(By.id(nextButton)).isDisplayed());
				break;
			case "confirm details":
				Assert.assertTrue(this.driver.findElement(By.id(confirmdetials)).isDisplayed());
				break;
			case "edit your details":
				Assert.assertTrue(this.driver.findElement(By.id(editdetails)).isDisplayed());
				break;
			case "already registered link":
				Assert.assertTrue(this.driver.findElement(By.className(alreadyRegisteredLink)).isDisplayed());
				break;
			case "back":
				Assert.assertTrue(this.driver.findElement(By.id(backarrow)).isDisplayed());
				break;
			case "register back":
				Assert.assertTrue(this.driver.findElement(By.id(registerback)).isDisplayed());
				break;
			case "passwordtext":
				Assert.assertTrue(this.driver.findElement(By.className(passwordtext)).isDisplayed());
				break;
			default:
				System.out.println("Element not in list?");
				break;
			}
		}

	}

	@Override
	public void checkElementPresence(String type) {
		// TODO Auto-generated method stub

	}

	@Override
	public void checkElementColour(String element, String colour) {
		String expectedColour = colour;

		switch (element.toLowerCase()) {
		case "firstname":
			TestHelper.waitforelement(this.driver, firstNameInputHighlight, "name", 5);// third parameter chooses the
																						// type of locator
			String actualfnColour = this.driver.findElement(By.name(firstNameInputHighlight))
					.getCssValue("border-bottom-color");
			Assert.assertEquals("Testing " + element + " colour", expectedColour, actualfnColour);
			break;
		case "surname":
			String actualLNColour = this.driver.findElement(By.name(lastNameInputHighlight))
					.getCssValue("border-bottom-color");
			Assert.assertEquals("Testing " + element + " colour", expectedColour, actualLNColour);
			break;
		case "email":
			String actualEIColour = this.driver.findElement(By.name(emailInputHighlight))
					.getCssValue("border-bottom-color");
			Assert.assertEquals("Testing " + element + " colour", expectedColour, actualEIColour);
			break;
		case "set password":
			String actualpsColour = this.driver.findElement(By.name(setPasswordInputHighlight))
					.getCssValue("border-bottom-color");
			Assert.assertEquals("Testing " + element + " colour", expectedColour, actualpsColour);
			break;
		case "confirm password":
			String actualColour = this.driver.findElement(By.name(confirmPasswordInputHighlight))
					.getCssValue("border-bottom-color");
			Assert.assertEquals("Testing " + element + " colour", expectedColour, actualColour);
			break;
		default:
			System.out.println("Element not in list?");
			break;
		}
	}

	@Override
	public void checkText(String element) {
		// TODO Auto-generated method stub
		switch (element.toLowerCase()) {
		case "help text":
			String actualLine1 = this.driver.findElements(By.className(passwordtextLines)).get(0).getText();
			String actualLine2 = this.driver.findElements(By.className(passwordtextLines)).get(1).getText();
			String expectedLine1 = "Mixture of upper, lower case, numbers and special characters.";
			String expectedLine2 = "Include 8 - 20 characters.";
			Assert.assertTrue(actualLine1.equalsIgnoreCase(expectedLine1));
			Assert.assertTrue(actualLine2.equalsIgnoreCase(expectedLine2));
			break;
		default:
			System.out.println("Element not in list?");
			break;
		}

	}

}
