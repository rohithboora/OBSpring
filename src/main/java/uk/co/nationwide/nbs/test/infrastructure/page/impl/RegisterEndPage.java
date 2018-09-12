package uk.co.nationwide.nbs.test.infrastructure.page.impl;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Component;

import uk.co.nationwide.nbs.test.infrastructure.page.Page;

@Component
public class RegisterEndPage extends AbstractPageUtils implements Page {

	private String WelcomeHeader = "";
	private String MeetVABtn = "";

	private WebDriver driver;
	private Map<String, String> propositionsUrls;

	@Override
	public void go(String proposition) {
		this.driver.get(String.format("%s/RegisterEnd", this.propositionsUrls.get(proposition)));
	}

	public void actSelectElement(String action, String element) {
		// this.driver.manage().window().maximize();
		String act = action;
		if (action.equalsIgnoreCase("click")) {
			if (element.equalsIgnoreCase("Meet VA button")) {
				System.out.println("Meet VA button");
				this.driver.findElement(By.xpath(MeetVABtn)).click();
			}
		} else {
			System.out.println("the requested " + act + " action was not recognised");
		}
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDriver(WebDriver driver) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setPropositionsUrls(Map<String, String> propositionsUrls) {
		// TODO Auto-generated method stub

	}

	@Override
	public void click(String element) {
		// TODO Auto-generated method stub

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
	public void refresh() {
		// TODO Auto-generated method stub

	}

	@Override
	public void scrollPage(String to) {
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
	public void getFirstMessage(String element) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getLastMessage(String element) {
		// TODO Auto-generated method stub

	}

	@Override
	public void checkElementColour(String element, String colour) {
		// TODO Auto-generated method stub
		
	}
}