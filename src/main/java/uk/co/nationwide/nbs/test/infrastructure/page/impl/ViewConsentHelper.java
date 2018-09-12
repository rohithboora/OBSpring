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
public class ViewConsentHelper extends AbstractPageUtils implements Page {

    WebDriver driver;
    private Map<String, String> propositionsUrls;

    // class
    private String backButton = "//*[@id=\"header\"]/a";
    

    // header text
    private String h4Text1 = "Settings";

    // options
    String expectedProfileText = "My Profile";
    String expectedInformationText = "Important Information";

    // chevrons
    // by class
    String chevrons = "settings-menu-chevron";

    @Override
    public void go(String proposition) {
	// TODO Auto-generated method stub
	this.driver.get(String.format("%s/view-consented-data", this.propositionsUrls.get(proposition)));
    }

    @Override
    public void click(String element) {
	switch (element.toLowerCase()) {
	
	case "back":
	    this.driver.findElement(By.xpath(backButton)).click();
	    System.out.println("buttonclickedd");
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

	return "view-consent-data";
    }

    @Override
    public void setDriver(WebDriver driver) {
	this.driver = driver;
	// TODO Auto-generated method stub
    }

    @Override
    public void setPropositionsUrls(Map<String, String> propositionsUrls) {
	this.propositionsUrls = propositionsUrls;
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
	    case "back":
		Assert.assertTrue("testing Data request", this.driver.findElement(By.id(backButton)).isDisplayed());
		break;
	   
	    default:
		System.out.println("Cant find element  " + element);
	    }
	}

    }

    @Override
    public void checkElementPresence(String min) {
    	//int seconds = Integer.parseInt(min) * 100;
    	

    }

    @Override
    public void checkText(String element) {
	// TODO Auto-generated method stub

    }

    @Override
    public void checkElementColour(String element, String colour) {
	// TODO Auto-generated method stub

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

	List<WebElement> chevronTags = this.driver.findElements(By.className("settings-menu-chevron"));
	int numberOfChevrons = chevronTags.size();

	// verify headers
	Assert.assertTrue(header4Text.contains(h4Text1));


	// verify back icon
	assertTrue(this.driver.findElement(By.id(backButton)).isDisplayed());

	// verify buttons

	// verify chevrons
	assertTrue(numberOfChevrons == 2);
    }

}
