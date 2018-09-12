package uk.co.nationwide.nbs.test.infrastructure.page.impl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Component;
import uk.co.nationwide.nbs.test.infrastructure.page.Page;

import java.util.List;
import java.util.Map;

@Component
public class OpenBankingAuthHelper extends AbstractPageUtils implements Page {

    private WebDriver driver;
    private Map<String, String> propositionsUrls;

    // locators
    // by id
    private String customerNumberInput = "uid";
    // by name
    private String customerNumCheckBox = "vehicle";
    // by id
    private String passBox1 = "3rd";
    // by id
    private String passBox2 = "5th";
    // by id
    private String passBox3 = "8th";
    // by id
    private String smsButton = "smsbutton";
    // by id
    private String mobileNumber = "mobileNum";
    // by id
    private String oneTimePasscode = "otp";
    // by id
    private String logInButton = "lgnbtn";

    @Override
    public void go(String proposition) {
        this.driver.get(String.format("%s/openbanking-auth", this.propositionsUrls.get(proposition)));
    }

    @Override
    public void click(String element) {
        switch (element.toLowerCase()) {
            case "remember customer number":
                this.driver.findElement(By.name(customerNumCheckBox)).click();
                break;
            case "sms":
                this.driver.findElement(By.id(smsButton)).click();
                break;
            case "log in":
                this.driver.findElement(By.id(logInButton)).click();
                break;
            default:
                System.out.println("Cant find element " + element);
        }
    }

    @Override
    public void enterText(String text, String element) {
        switch (element.toLowerCase()) {
            case "customer number":
                this.driver.findElement(By.id(customerNumberInput)).sendKeys(text);
                break;
            case "box1":
                this.driver.findElement(By.id(passBox1)).sendKeys(text);
                break;
            case "box2":
                this.driver.findElement(By.id(passBox2)).sendKeys(text);
                break;
            case "box3":
                this.driver.findElement(By.id(passBox3)).sendKeys(text);
                break;
            case "mobile number":
                this.driver.findElement(By.id(mobileNumber)).sendKeys(text);
                break;
            case "one-time passcode":
                this.driver.findElement(By.id(oneTimePasscode)).sendKeys(text);
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
    public String name() {
        // TODO Auto-generated method stub
        return "openbanking-auth";
    }

    @Override
    public void setDriver(WebDriver driver) {
        this.driver = driver;

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
