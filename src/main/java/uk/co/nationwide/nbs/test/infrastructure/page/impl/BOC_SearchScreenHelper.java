package uk.co.nationwide.nbs.test.infrastructure.page.impl;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Component;

import uk.co.nationwide.nbs.test.infrastructure.page.Page;
import uk.co.nationwide.nbs.test.infrastructure.utils.TestHelper;

@Component
public class BOC_SearchScreenHelper extends AbstractPageUtils implements Page {
	
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
        this.driver.get(String.format("%s/welcome", this.propositionsUrls.get(proposition)));
        //this.driver.get(String.format("%s/", this.propositionsUrls.get(proposition)));
        TestHelper.waitforelement(this.driver, login, "className", 5);
    }

    @Override
    public String name() {
        return "bocSearchScreen";
    }

    public void refresh() {

    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;

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
	
	 @Override
	    public void setPropositionsUrls(Map<String, String> propositionsUrls) {
	        this.propositionsUrls = propositionsUrls;
	    }

}
