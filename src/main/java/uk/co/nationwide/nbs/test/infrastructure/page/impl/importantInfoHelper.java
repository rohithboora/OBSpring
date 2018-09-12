package uk.co.nationwide.nbs.test.infrastructure.page.impl;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Component;

import uk.co.nationwide.nbs.test.infrastructure.page.Page;

@Component
public class importantInfoHelper extends AbstractPageUtils implements Page {

	private WebDriver driver;
	private Map<String, String> propositionsUrls;
	
	private String useinfo = "fpn";
	private String tandc = "termsAndConditions";
	private String back = "cta-info-button";
	private String consent="consent";
	
	
	@Override
	public void setDriver(WebDriver driver) {
		this.driver = driver;

	}
	@Override
	public void refresh() {

	}

	@Override
	public void setPropositionsUrls(Map<String, String> propositionsUrls) {
	}

	@Override
	public void go(String proposition) {
		// TODO Auto-generated method stub
		this.driver.get(String.format("%s/importantInfo",this.propositionsUrls.get(proposition)));

	}
	
	@Override
	public void click(String element) {
		switch (element.toLowerCase()) {
		case "useinfo":
			this.driver.findElement(By.id(useinfo)).click();
			System.out.println("buttonclicked");
			break;
		case "tandc":
			this.driver.findElement(By.id(tandc)).click();
			break;
		case "back":
			this.driver.findElement(By.id(back)).click();
			break;
		case "consent":
			this.driver.findElement(By.id(consent)).click();
			break;
		default:
			System.out.println("Cant find element " + element);
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
		// TODO Auto-generated method stub
		return "importantInfo";
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