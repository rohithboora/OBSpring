package uk.co.nationwide.nbs.test.infrastructure.page.impl;

import static org.junit.Assert.*;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Component;

import static org.junit.Assert.assertTrue;
import uk.co.nationwide.nbs.test.infrastructure.page.Page;

@Component
public class LogoutHelper extends AbstractPageUtils implements Page {

	
	//define webdriver
	WebDriver driver;
	 private Map<String, String> propositionsUrls;
	// by class
	private String login = "logout-page-login-button";

	@Override
	public void go(String proposition) {
		// TODO Auto-generated method stub

	}

	@Override
	public void click(String element) {
		switch (element.toLowerCase()) {
		case "login":
			this.driver.findElement(By.id(login)).click();
			break;
		default:
			System.out.println("Cant find element " + element);
			assertTrue(false);
		}

	}

	@Override
	public void enterText(String text, String element) {
		// TODO Auto-generated method stub

	}

	@Override
	public void clearText(String type, String accessName) {
		// TODO Auto-generated method stub

	}

	@Override
	public String name() {

		return "logout";
	}

	@Override
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	@Override
	public void setPropositionsUrls(Map<String, String> propositionsUrls) {
	        this.propositionsUrls = propositionsUrls;
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
