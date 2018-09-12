package uk.co.nationwide.nbs.test.infrastructure.page.impl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Component;
import uk.co.nationwide.nbs.test.infrastructure.page.Page;
import uk.co.nationwide.nbs.test.infrastructure.utils.TestHelper;

import java.util.List;
import java.util.Map;

@Component
public class ThanksHelper extends AbstractPageUtils implements Page {

    private WebDriver driver;
    private Map<String, String> propositionsUrls;

    // page elements
    private String homeButton = "//*[@id=\'login-input-field-bottom-section\']/a";
    private String mainPageHeader = "//*[@id=\'main-navbar\']/h4";
    private String thanksImage = "#login-view-wrapper > div > div > div";
    private String thanksHeader = "//*[@id=\'login-view-wrapper\']/div/div/h2";
    private String passwordResetTextHead = "//*[@id=\'login-view-wrapper\']/div/div/span[1]";
    private String passwordResetTestBody = "//*[@id=\'login-view-wrapper\']/div/div/span[2]";
    // id
    private String meetVA = "logout-page-login-button";

    @Override
    public void go(String proposition) {
	this.driver.get(String.format("%s/thanks", this.propositionsUrls.get(proposition)));

    }

    @Override
    public String name() {
	return "thanks";
    }

    public void refresh() {

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
    public void click(String element) {
	switch (element.toLowerCase()) {
	case "meet va":
	    TestHelper.waitforelement(this.driver, meetVA, "id", 5);
	    this.driver.findElement(By.id(meetVA)).click();
	    break;
	case "home":
	    TestHelper.waitforelement(this.driver, homeButton, "xpath", 5);
	    this.driver.findElement(By.xpath(homeButton)).click();
	    break;
	default:
	    System.out.println("Cant find element " + element);
	}

    }

    /*
     * (non-Javadoc)
     * 
     * @see uk.co.nationwide.nbs.test.infrastructure.page.Page#enterText(java.lang.
     * String, java.lang.String)
     */
    @Override
    public void enterText(String text, String element) {
	// TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see uk.co.nationwide.nbs.test.infrastructure.page.Page#clearText(java.lang.
     * String, java.lang.String)
     */
    @Override
    public void clearText(String type, String accessName) {
	// TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * uk.co.nationwide.nbs.test.infrastructure.page.Page#checkPageElements(java.
     * util.List)
     */
    @Override
    public void checkPageElements(List<String> list) {
	// TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * uk.co.nationwide.nbs.test.infrastructure.page.Page#checkElementPresence(java.
     * lang.String)
     */
    @Override
    public void checkElementPresence(String type) {
	// TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see uk.co.nationwide.nbs.test.infrastructure.page.Page#checkText(java.lang.
     * String)
     */
    @Override
    public void checkText(String element) {
	// TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * uk.co.nationwide.nbs.test.infrastructure.page.Page#checkElementColour(java.
     * lang.String, java.lang.String)
     */
    @Override
    public void checkElementColour(String element, String colour) {
	// TODO Auto-generated method stub

    }

}
