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

@Component
public class SelectProviderHelper extends AbstractPageUtils implements Page {

    private WebDriver driver;
    private Map<String, String> propositionsUrls;

    // page elements
    // by xpath
    private String closeButton = "//*[@id=\'bankSelectionModal\']/div/div/div[1]/button";
    // by xpath
    private String nationwideButton = "//*[@id='page-layout']/section/section/div";
    // by className
    private String backButton = "header--button__back";
    private String lockIcon = "header--icon__lock";
    private String pageTitle = "Add your accounts";
    private String pageHeader1 = "Choose provider";
    private String pageMessage = "Money App will connect to your bank account in 'read only' mode. That means Money App won't be able to make any changes to your bank account.";

    @Override
    public void go(String proposition) {
	this.driver.get(String.format("%s/select-provider", this.propositionsUrls.get(proposition)));

    }

    @Override
    public void refresh() {

    }

    @Override
    public String name() {
	return "select-provider";
    }

    @Override
    public void setDriver(WebDriver driver) {
	this.driver = driver;

    }

    @Override
    public void click(String element) {
	switch (element.toLowerCase()) {
	case "nationwide":
	    try {
		Thread.sleep(2000);
	    } catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
	    this.driver.findElement(By.xpath(nationwideButton)).click();
	    try {
		Thread.sleep(2000);
	    } catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
	    break;
	case "next":
	    this.driver.findElement(By.className(nationwideButton)).click();
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
    public void setPropositionsUrls(Map<String, String> propositionsUrls) {
	// TODO Auto-generated method stub

    }

    @Override
    public void checkPageElements(List<String> list) {
	// TODO Auto-generated method stub
	System.out.println("I am in the select provide page and will be checking the page elements");

	List<String> elements = list;
	int size = elements.size();

	for (int i = 0; i < size; i++) {

	    String element = elements.get(i).toString();

	    switch (element.toLowerCase()) {
	    case "nationwide":
		Assert.assertTrue(this.driver.findElement(By.xpath(nationwideButton)).isDisplayed());
		break;

	    default:
		System.out.println("Cant find  link ");
	    }
	}

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

    // when hitting this page this method should be called to check UI is as
    // expected
    @SuppressWarnings("null")
    public void validatePageUI() {
	// grab a list of h4 tags and get the text from them
	List<String> header4Text = null;
	List<String> header1Text = null;
	List<String> paraText = null;

	List<WebElement> header4Tags = this.driver.findElements(By.tagName("h4"));
	header4Tags.forEach((temp) -> {
	    String t = temp.getText();
	    header4Text.add(t);
	});

	List<WebElement> header1Tags = this.driver.findElements(By.tagName("h1"));
	header1Tags.forEach((temp) -> {
	    String t = temp.getText();
	    header1Text.add(t);
	});

	List<WebElement> paraTags = this.driver.findElements(By.tagName("p"));
	paraTags.forEach((temp) -> {
	    String t = temp.getText();
	    paraText.add(t);
	});

	Assert.assertTrue(header4Text.contains(pageTitle));
	Assert.assertTrue(header1Text.contains(pageHeader1));
	Assert.assertTrue(paraText.contains(pageMessage));

	assertTrue(this.driver.findElement(By.className(backButton)).isDisplayed());
	assertTrue(this.driver.findElement(By.className(lockIcon)).isDisplayed());

    }

}
