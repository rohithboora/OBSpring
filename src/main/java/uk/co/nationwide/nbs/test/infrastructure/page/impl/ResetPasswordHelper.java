package uk.co.nationwide.nbs.test.infrastructure.page.impl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Component;
import uk.co.nationwide.nbs.test.infrastructure.page.Page;
import uk.co.nationwide.nbs.test.infrastructure.utils.TestHelper;

import java.util.List;
import java.util.Map;

@Component
public class ResetPasswordHelper extends AbstractPageUtils implements Page {

    private WebDriver driver;
    private Map<String, String> propositionsUrls;

    // page elements
    private String mainPageHeader = "//*[@id=\'main-navbar\']/h4";
    private String inputFieldTextHeader = "//*[@id=\"loginInputFieldTopSection\"]/div[1]/h4";
    private String pageTopSectionText = "//*[@id=\'loginInputFieldTopSection\']/h5";
    private String oneTimePasswordTextbox = "//*[@id=\'loginInputFieldTopSection\']/div[1]/input";
    //by class
    private String resetPasswordButton = "logmein-btn";
    private String invalidEmailMessage = "//*[@id=\'loginInputFieldTopSection\']/div[2]";
    //by name
    private String emailField = "//*[@id=\"input-field-top-section\"]/div[1]/input";
    //by class
    private String homeButton = "logmein-btn";

    @Override
    public void go(String proposition) {
        this.driver.get(String.format("%s/reset-password", this.propositionsUrls.get(proposition)));
    }

    @Override
    public String name() {
        return "reset-password";
    }

    @Override
    public void setDriver(WebDriver driver) {
        this.driver = driver;

    }

    public void refresh() {

    }

    @Override
    public void setPropositionsUrls(Map<String, String> propositionsUrls) {
        this.propositionsUrls = propositionsUrls;
    }

    @Override
    public void click(String element) {
    	switch (element.toLowerCase()) {
		case "reset password":
			this.driver.findElement(By.className(resetPasswordButton)).click();
			break;
		case "home":
            TestHelper.waitforelement(this.driver, homeButton, "classname", 5);
			this.driver.findElement(By.className(homeButton)).click();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		default:
			System.out.println("Cant find element " + element);
		}


    }

    @Override
    public void enterText(String text, String element) {
    	switch (element.toLowerCase()) {
		case "email":
			this.driver.findElement(By.xpath(emailField)).clear();
			this.driver.findElement(By.xpath(emailField)).sendKeys(text);
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
