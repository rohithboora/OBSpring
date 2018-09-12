package uk.co.nationwide.nbs.test.infrastructure.page.impl;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.stereotype.Component;

import uk.co.nationwide.nbs.test.infrastructure.page.Page;
import uk.co.nationwide.nbs.test.infrastructure.utils.TestHelper;

@Component
public class ConsentHelper extends AbstractPageUtils implements Page {

    WebDriver driver;
    private Map<String, String> propositionsUrls;

    // class//*[@id="view-consent"]/a
    private String viewconsent = "view-consent";
    private String removebutton="acc-remove";
    private String removeWithConsentButton="remove-acc-popup";
    private String accountRemovedContinue = "//*[@id=\'accountRemovedPopUp\']/div/div/section[3]/button";
    List<WebElement> elementsRemoveButton;
    List<WebElement> elementsAccountNum;
    private String previousButton = "back-arrow";
    private String removeButtons = "acc-remove";
    private String cancelConsent = "cancel-remove-acc-popup";

    @Override
    public void go(String proposition) {
	// TODO Auto-generated method stub
	this.driver.get(String.format("%s/consent", this.propositionsUrls.get(proposition)));
    }

    @Override
    public void click(String element) {
	switch (element.toLowerCase()) {
	case "remove":
		 this.removeAccount("any");
		    break;
	
	case "viewconsent":
	    this.driver.findElement(By.id(viewconsent)).click();
	    System.out.println("here");
	    break;

	case "remove with consent":
	    TestHelper.waitforelement(this.driver, removeWithConsentButton, "id", 10);
	    this.driver.findElement(By.id(removeWithConsentButton)).click();
	    try {
		Thread.sleep(5000);
	    } catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	    }
	    break;
	case "cancel":
	    this.driver.findElement(By.id(cancelConsent)).click();
	    break;

	case "account removed continue":
	    this.driver.findElement(By.xpath(accountRemovedContinue)).click();
	    try {
		Thread.sleep(1000);
	    } catch (InterruptedException e) {
		
		e.printStackTrace();
	    }
	    break;
	default:
	    System.out.println("Cant find element " + element);
	
	
	}

    }
    

    public void removeAccount(String account) {
	switch (account.toLowerCase()) {
	case "any":
	    elementsRemoveButton = this.driver.findElements(By.className(removebutton));
	    System.out.println(elementsRemoveButton.toString());
	    this.driver.switchTo().activeElement();
	    new WebDriverWait(this.driver, 10).until(ExpectedConditions.elementToBeClickable(By.linkText("REMOVE")));
	    this.driver.findElements(By.linkText("REMOVE")).get(0).click();
	    try {
		Thread.sleep(5000);
	    } catch (InterruptedException e) {
		System.out.println(e.getMessage());
	    }
	    break;
	default:
	    System.out.println("Cant find remove link for " + account);
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

	return "consent";
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
	    case "view your consented data":
	    	 TestHelper.waitforelement(this.driver, viewconsent, "xpath", 20);
	    	 Assert.assertTrue("testing first name label",
             //this.driver.findElement(By.linkText("View your consented data")).isDisplayed());
	    	 	 this.driver.findElement(By.xpath(viewconsent)).isDisplayed());
	    	
             break;
			   
	    default:
		System.out.println("Cant find element  " + element);
	    }
	}

    }

    @Override
    public void checkElementPresence(String min) {
	
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
