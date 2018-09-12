package uk.co.nationwide.nbs.test.infrastructure.page.impl;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;

import uk.co.nationwide.nbs.test.infrastructure.page.Page;
import uk.co.nationwide.nbs.test.infrastructure.utils.TestHelper;

@Component
public class ViewProfileHelper extends AbstractPageUtils implements Page {
	
	private WebDriver driver;
	private Map<String, String> propositionsUrls;
	
	private String fname="first-name-input";
	private String sname="surname-input";
	private String email="email-address-input";
	private String pword="cfm-pwd-fst-input";
	private String profile="myProfile";
	private String back="back-to-confirm-btn";
	private String edit="edit";
	private String cancel="header--button__cancel";
	private String savelink="header--button__save_changes";
	private String continuebutton="saved-changes-profile-continue";
	private String savebutton="profile--buttons_confirm";
	private String username="//*[@id=\"chat-bubble-wrapper\"]/div/p";
	
	
    // For editing the same fields in the edit page
	private String firstNameLabel = "//*[@id='input-field-top-section']/div[1]/div[1]/h4";
	private String firstNameInput = "first-name-input";
	private String surnameLabel = "//*[@id='input-field-top-section']/div[1]/div[2]/h4";
	private String surnameInput = "surname-input";
	private String emailAddressLabel = "//*[@id='input-field-top-section']/div[1]/div[3]/h4";
	private String emailAddressInput = "email-address-input";
	
	
	//headers

	private String h4Text1 = "Your first name";
	private String h4Text2 = "Your surname";
	private String h4Text3 = "Your email address";
	private String h4Text4 = "Your password";
	
	//button
	private String editButton = "edit";
	private String backButton = "back-to-confirm-btn";
	private String deleteProfileButton = "deleteAccount";
	private String deleteProfileButtonText = "Delete My Profile";
	
	
	

	@Override
	public void go(String proposition) {
		// TODO Auto-generated method stub
		this.driver.get(String.format("%s/profile", this.propositionsUrls.get(proposition)));
		
	}

	@Override
	public void click(String element) {
		// TODO Auto-generated method stub
		switch (element.toLowerCase()) {
		case"back":
			this.driver.findElement(By.id(back)).click();
			System.out.println("buttonclicked");
			break;
		case"delete":
			this.driver.findElement(By.id(deleteProfileButton)).click();
			System.out.println("buttonclicked");
			break;
		case"edit":
			this.driver.findElement(By.id(edit)).click();
			System.out.println("buttonclicked");
			break;
		case"savelink":
			this.driver.findElement(By.className(savelink)).isDisplayed();
			this.driver.findElement(By.className(savelink)).click();
			System.out.println("linkclicked");
			break;
		case"save":
			this.driver.findElement(By.className(savebutton)).isDisplayed();
			this.driver.findElement(By.className(savebutton)).click();
			System.out.println("buttonclicked");
		case"cancel":
			this.driver.findElement(By.className(cancel)).isDisplayed();
			this.driver.findElement(By.className(cancel)).click();
			System.out.println("buttonclicked");
			break;
		case"continue":
	     	TestHelper.waitforelement(this.driver, continuebutton, "id", 6);
			this.driver.findElement(By.id(continuebutton)).isDisplayed();
			this.driver.findElement(By.id(continuebutton)).click();
			System.out.println("buttonclicked");
			break;
		default:
			System.out.println("Cant find element " + element);
			assertTrue(false);
		}
		
	}

	@Override
	public void enterText(String text, String element) {
		// TODO Auto-generated method stub
		switch (element.toLowerCase()) {
	case "change your first name":
		this.driver.findElement(By.id(firstNameInput)).clear();
		this.driver.findElement(By.id(firstNameInput)).sendKeys(text);
		break;
	case "change your surname":
		this.driver.findElement(By.id(surnameInput)).clear();
		this.driver.findElement(By.id(surnameInput)).sendKeys(text);
		break;
	case "change your email address":
		this.driver.findElement(By.id(emailAddressInput)).clear();
		this.driver.findElement(By.id(emailAddressInput)).sendKeys(text);
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
		return "profile";
	}

	@Override
	public void setDriver(WebDriver driver) {
		this.driver =driver;
		
	}

	@Override
	public void setPropositionsUrls(Map<String, String> propositionsUrls) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkPageElements(List<String> list) {
		// TODO Auto-generated method stub
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
			case "firstname":
				Assert.assertFalse("First name",this.driver.findElement(By.id(fname)).isEnabled());
				break;
			case "surname":
				Assert.assertFalse("Sur name",this.driver.findElement(By.id(fname)).isEnabled());
				break;
			case "email":
				Assert.assertFalse("Email",this.driver.findElement(By.id(email)).isEnabled());
				break;
			case "password":
				Assert.assertFalse("Password",this.driver.findElement(By.id(pword)).isEnabled());
				break;
			default:
				System.out.println("can't find element" +element);	
				break;
			}
		}
		
	}

	@Override
	public void checkElementPresence(String type) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void checkText(String element) {}
	
	@Override
	public void checkTextInsideElement(String element, String expectedText) {
		String expectedMessage = expectedText;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		switch (element.toLowerCase()) {
		case "username":
			String message = this.driver.findElement(By.xpath(username)).getText();
			System.out.println(message);
			Assert.assertTrue(message.equals(expectedMessage));

			break;
	default:
		System.out.println("can't find element" +element);	
		break;
	}
	}

	@Override
	public void checkElementColour(String element, String colour) {
		String expectedColour = colour;

		switch (element.toLowerCase()) {
		case "firstname":
			TestHelper.waitforelement(this.driver, fname, "id", 5);// third parameter chooses the
																						// type of locator
			String actualfnColour = this.driver.findElement(By.id(fname))
					.getCssValue("border-bottom-color");
			Assert.assertEquals("Testing " + element + " colour", expectedColour, actualfnColour);
			break;
		case "surname":
			String actualLNColour = this.driver.findElement(By.id(sname))
					.getCssValue("border-bottom-color");
			Assert.assertEquals("Testing " + element + " colour", expectedColour, actualLNColour);
			break;
		case "email":
			String actualEIColour = this.driver.findElement(By.id(email))
					.getCssValue("border-bottom-color");
			Assert.assertEquals("Testing " + element + " colour", expectedColour, actualEIColour);
			break;
		case "password":
			String actualpsColour = this.driver.findElement(By.id(pword))
					.getCssValue("border-bottom-color");
			Assert.assertEquals("Testing " + element + " colour", expectedColour, actualpsColour);
			break;
		
		default:
			System.out.println("Element not in list?");
			break;
		}
	}
	
	
	 // when hitting this page this method should be called to check UI is as  // expected

	    @SuppressWarnings("null")
	    public void validatePageUI() {
		// grab a list of h4 tags and get the text from them
		List<String> header4Text = null;
		String actualdeleteProfileButtonText = "";
		List<WebElement> header4Tags = this.driver.findElements(By.tagName("h4"));
		header4Tags.forEach((temp) -> {
		    String t = temp.getText();
		    header4Text.add(t);
		});


		// verify headers
		Assert.assertTrue(header4Text.contains(h4Text1));
		Assert.assertTrue(header4Text.contains(h4Text2));
		Assert.assertTrue(header4Text.contains(h4Text3));
		Assert.assertTrue(header4Text.contains(h4Text4));
		
		//verify textboxes
		assertTrue(this.driver.findElement(By.id(fname)).isDisplayed());
		assertTrue(this.driver.findElement(By.id(sname)).isDisplayed());
		assertTrue(this.driver.findElement(By.id(email)).isDisplayed());
		assertTrue(this.driver.findElement(By.id(pword)).isDisplayed());

		// verify buttons
		assertTrue(this.driver.findElement(By.id(deleteProfileButton)).isDisplayed());
		actualdeleteProfileButtonText = this.driver.findElement(By.id(deleteProfileButton)).getText();
		assertTrue(actualdeleteProfileButtonText.equalsIgnoreCase(deleteProfileButtonText));
		
		//verify header bar
		assertTrue(this.driver.findElement(By.id(backButton)).isDisplayed());
		assertTrue(this.driver.findElement(By.id(editButton)).isDisplayed());
		
	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



}
