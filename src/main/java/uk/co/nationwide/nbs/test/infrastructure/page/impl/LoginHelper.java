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
public class LoginHelper extends AbstractPageUtils implements Page {

	private WebDriver driver;
	private Map<String, String> propositionsUrls;

	// element text
	private String pageHeaderText = "Log In";
	private String emailText = "Your email address";
	private String passwordText = "Your password";
	private String helpTextLineText = "Full details about how we use your information are available here.";
	private String logMeInButtonText = "Log Me In";
	private String forgottenPasswordLinkText = "Forgotten Password";

	// by name
	private String emailTextbox = "email";
	// by name
	private String passwordTextbox = "password";
	// by xpath
	private String logMeInButton = "logmein-btn";
	// by class
	private String forgottenPasswordButton = "dismiss-btn";
	// by xpath
	private String backButton = "//*[@id='main-navbar']/a";
	// by xpath
	private String headerText = "//*[@id='login-input-field-bottom-section']/a[2]";
	private String loginErrorPath = "invalid-status";
	private String fpnLink = "//*[@id=\"input-field-top-section\"]/div[3]/p/a";

	@Override
	public String name() {
		return "login";
	}

	@Override
	public void setDriver(WebDriver driver) {
		this.driver = driver;

	}

	@Override
	public void refresh() {

	}

	@Override
	public void setPropositionsUrls(Map<String, String> propositionsUrls) {
		this.propositionsUrls = propositionsUrls;
	}

	@Override
	public void go(String proposition) {
		// TODO Auto-generated method stub

	}

	@Override
	public void click(String element) {
		switch (element.toLowerCase()) {
		case "log me in":
			this.driver.findElement(By.className(logMeInButton)).click();
			break;
		case "forgotten password":
			TestHelper.waitforelement(this.driver, forgottenPasswordButton, "classname", 5);
			this.driver.findElement(By.className(forgottenPasswordButton)).click();
			break;
		case "fpnlink":
			this.driver.findElement(By.xpath(fpnLink)).click();
			break;
		default:
			System.out.println("Cant find element " + element);
		}

	}

	@Override
	public void enterText(String text, String element) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		switch (element.toLowerCase()) {

		case "email":
			this.driver.findElement(By.name(emailTextbox)).clear();
			this.driver.findElement(By.name(emailTextbox)).sendKeys(text);
			break;
		case "password":
			this.driver.findElement(By.name(passwordTextbox)).clear();
			this.driver.findElement(By.name(passwordTextbox)).sendKeys(text);
			break;
		default:
			System.out.println("Cant find element " + element);
		}

	}

	@Override
	public void checkText(String element, String expected) {
		boolean result = false;
		switch (element.toLowerCase()) {
		case "error":
			result = expected.equalsIgnoreCase(this.driver.findElement(By.className(loginErrorPath)).getText());
			System.out.println(this.driver.findElement(By.className(loginErrorPath)).getText());
			assertTrue(result);
			break;
		default:
			System.out.println("Cant find element " + element);
			assertTrue(result);
		}
	}
	
    // when hitting this page this method should be called to check UI is as
    // expected
    @SuppressWarnings("null")
    public void validatePageUI() {

	// grab a list of h4 tags and get the text from them
	List<String> header4Text = null;
	List<WebElement> header4Tags = this.driver.findElements(By.tagName("h4"));
	header4Tags.forEach((temp) -> {
	    String t = temp.getText();
	    header4Text.add(t);
	});

	// assert page elements
	Assert.assertTrue(header4Text.contains(headerText));
	Assert.assertTrue(header4Text.contains(emailText));
	Assert.assertTrue(this.driver.findElement(By.className(emailTextbox)).isDisplayed());
	Assert.assertTrue(header4Text.contains(passwordText));
	Assert.assertTrue(this.driver.findElement(By.className(passwordTextbox)).isDisplayed());
	Assert.assertTrue(
		this.driver.findElement(By.className(helpTextLineText)).getText().equalsIgnoreCase(helpTextLineText));
	Assert.assertTrue(
		this.driver.findElement(By.className(logMeInButton)).getText().equalsIgnoreCase(logMeInButtonText));
	Assert.assertTrue(this.driver.findElement(By.className(forgottenPasswordButton)).getText()
		.equalsIgnoreCase(forgottenPasswordLinkText));
    }

	@Override
	public void clearText(String type, String accessName) {
		// TODO Auto-generated method stub

	}

	@Override
	public void checkPageElements(List<String> list) {
		// TODO Auto-generated method stub

	}

	@Override
	public void checkElementPresence(String type) {
		// TODO Auto-generated method stub

	}

	@Override
	public void checkText(String element) {
		// TODO Auto-generated method stub

	}

	@Override
	public void checkElementColour(String element, String colour) {
		// TODO Auto-generated method stub

	}

}