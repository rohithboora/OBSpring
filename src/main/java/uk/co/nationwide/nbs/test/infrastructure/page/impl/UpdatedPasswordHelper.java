package uk.co.nationwide.nbs.test.infrastructure.page.impl;

import org.openqa.selenium.WebDriver;
import uk.co.nationwide.nbs.test.infrastructure.page.Page;

import java.util.List;
import java.util.Map;

public class UpdatedPasswordHelper extends AbstractPageUtils implements Page {

    private WebDriver driver;
    private Map<String, String> propositionsUrls;

    // page elements
    private String newPasswordBox = "newPassword";
    private String confirmNewPasswordBox = "confirmNewPassword";
    private String updatePasswordButton = "//*[@id=\'login-input-field-bottom-section\']/a";
    private String setPasswordHeader = "//*[@id=\'loginInputFieldTopSection\']/div[1]/h4";
    private String confirmPasswordHeader = "//*[@id=\'loginInputFieldTopSection\']/div[2]/h4";

    @Override
    public void go(String proposition) {
        this.driver.get(String.format("%s/update-password", this.propositionsUrls.get(proposition)));
    }

    @Override
    public String name() {

        return "update-password";
    }

    public void refresh() {

    }

    @Override
    public void setDriver(WebDriver driver) {
        // TODO Auto-generated method stub

    }

    @Override
    public void setPropositionsUrls(Map<String, String> propositionsUrls) {
        this.propositionsUrls = propositionsUrls;

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
