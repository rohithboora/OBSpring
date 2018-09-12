package uk.co.nationwide.nbs.test.infrastructure.page.impl;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Component;
import uk.co.nationwide.nbs.test.infrastructure.page.Page;
import uk.co.nationwide.nbs.test.infrastructure.utils.TestHelper;

import java.util.List;
import java.util.Map;

@Component
public class WelcomeHelper extends AbstractPageUtils implements Page {

    /**
     * This page will hold all elements from the welcome page of the application. If
     * interacting with an element on this page, you should call these methods. All
     * pages implement methods from the page interface.
     */
    
    // page text
    String welcomeHeadingText = "Welcome to Money by Nationwide";
    String welcomeTaglineText = "Your money manager";
    String loginText = "Log In";
    String registerText = "Register";

    // paths to page elements
    private String login = "logmein-btn";
    private String findoutmore = "a.find-more-btn";
    // by class
    private String registerLink = "register-btn";
    private String welcomeHeading = "welcome-heading";
    private String welcomeTagline = "welcome-tagline";
    private String welcomeImage = "welcome-image";

    private WebDriver driver;
    private Map<String, String> propositionsUrls;

    @Override
    public void go(String proposition) {
        //this.driver.get(String.format("%s/welcome", this.propositionsUrls.get(proposition)));
        this.driver.get(String.format("%s/", this.propositionsUrls.get(proposition)));
        TestHelper.waitforelement(this.driver, login, "className", 5);
    }

    @Override
    public String name() {
        return "welcome";
    }

    public void refresh() {

    }

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
            case "login":
                this.driver.findElement(By.className(login)).click();
                break;
            case "find out more":
                this.driver.findElement(By.className(findoutmore)).click();
                break;
            case "register":
                this.driver.findElement(By.className(registerLink)).click();
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
                case "welcome header":
                    Assert.assertTrue("testing first name label",
                            this.driver.findElement(By.className(welcomeHeading)).isDisplayed());
                    break;
                case "welcome tagline":
                    Assert.assertTrue("testing first name field",
                            this.driver.findElement(By.className(welcomeTagline)).isDisplayed());
                    break;
                case "welcome image":
                    Assert.assertTrue(this.driver.findElement(By.className(welcomeImage)).isDisplayed());
                    break;
                case "login":
                    Assert.assertTrue(this.driver.findElement(By.className(login)).isDisplayed());
                    break;
                case "register":
                    Assert.assertTrue(this.driver.findElement(By.className(registerLink)).isDisplayed());
                    break;

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
	
    // when hitting this page this method should be called to check UI is as expected
    public void validatePageUI() {

	Assert.assertTrue(
		this.driver.findElement(By.className(welcomeHeading)).getText().equalsIgnoreCase(welcomeHeadingText));
	Assert.assertTrue(
		this.driver.findElement(By.className(welcomeTagline)).getText().equalsIgnoreCase(welcomeTaglineText));
	Assert.assertTrue(this.driver.findElement(By.className(welcomeImage)).isDisplayed());
	Assert.assertTrue(this.driver.findElement(By.className(login)).getText().equalsIgnoreCase(loginText));
	Assert.assertTrue(this.driver.findElement(By.className(registerLink)).getText().equalsIgnoreCase(registerText));

    }

}
