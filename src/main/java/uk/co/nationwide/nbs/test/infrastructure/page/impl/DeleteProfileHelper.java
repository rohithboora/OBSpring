package uk.co.nationwide.nbs.test.infrastructure.page.impl;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.springframework.stereotype.Component;
import uk.co.nationwide.nbs.test.infrastructure.page.Page;
import uk.co.nationwide.nbs.test.infrastructure.utils.TestHelper;

import java.util.List;
import java.util.Map;

@Component
public class DeleteProfileHelper extends AbstractPageUtils implements Page {

    private WebDriver driver;
    private Map<String, String> propositionsUrls;
    private String delete="deleteAccount";
    private String text="//*[@id=\"page-layout no-overflow\"]/div[1]/p";
    private String deleteprofile = "delete-profile-modal-yes";
    private String canceldelete = "delete-profile-modal-no";
    private String back="back-to-confirm-btn";
    	
   
    
    @Override
    public void go(String proposition) {
	this.driver.get(String.format("%s/delete", this.propositionsUrls.get(proposition)));

    }

    @Override
    public String name() {
	return "delete";
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
	case "back":
		 this.driver.findElement(By.id(back)).click();
		    break;
	case "delete":
	    this.driver.findElement(By.id(delete)).click();
	    break;
	case "deleteprofile":
		//WebElement elementbutton = 
		TestHelper.waitforelement(this.driver, deleteprofile,"id", 5);
		try {
			Thread.sleep(5000);
		    } catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		    }
		this.driver.findElement(By.id(deleteprofile)).click();
		try {
			Thread.sleep(5000);
		    } catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		    }
		System.out.println("clciked"+deleteprofile );
	    break;
	case "canceldelete":
	    this.driver.findElement(By.id(canceldelete)).click();
	  		try {
			Thread.sleep(5000);
		    } catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		    }
		System.out.println("clciked"+deleteprofile );
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
    	    case "deleteprofile":
    		Assert.assertTrue("testing Data request", this.driver.findElement(By.id(deleteprofile)).isDisplayed());
    		break;
    	  
    	    default:
    		System.out.println("Cant find element  " + element);
    	    }
    	}

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
    public void checkTextInsideElement(String element,String expectedText) {
	// TODO Auto-generated method stub
    	String expectedMessage = expectedText;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		switch (element.toLowerCase()) {
		case "text":
			String message = this.driver.findElement(By.xpath(text)).getText();
			System.out.println(message);
			Assert.assertTrue(message.equals(expectedMessage));

			break;
		default:
			Assert.fail();
		}

	    }

    /*
     * (non-Javadocs)
     * 
     * @see
     * uk.co.nationwide.nbs.test.infrastructure.page.Page#checkElementColour(java.
     * lang.String, java.lang.String)
     */
    @Override
    public void checkElementColour(String element, String colour) {
	// TODO Auto-generated method stub

    }

	@Override
	public void checkText(String element) {
		// TODO Auto-generated method stub
		
	}

}
