package uk.co.nationwide.nbs.test.infrastructure.page.impl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Component;
import uk.co.nationwide.nbs.test.infrastructure.page.Page;

import java.util.List;
import java.util.Map;

@Component
public class AccountShareHelper extends AbstractPageUtils implements Page {

    private WebDriver driver;
    private Map<String, String> propositionsUrls;

    // elements
    // by id
    private String jointAccountRadioButton = "accountID";
    // by id
    private String authButton = "lgnbtn";

    @Override
    public void go(String proposition) {
        this.driver.get(String.format("%s/account-share-auth", this.propositionsUrls.get(proposition)));

    }

    @Override
    public void click(String element) {
        switch (element.toLowerCase()) {
            case "joint account":
                this.driver.findElement(By.id(jointAccountRadioButton)).click();
                break;
            case "authorise":
                this.driver.findElement(By.id(authButton)).click();
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
        return "account-share-auth";
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
