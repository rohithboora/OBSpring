package uk.co.nationwide.nbs.test.infrastructure.page.impl;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.stereotype.Component;
import uk.co.nationwide.nbs.test.infrastructure.page.Page;
import uk.co.nationwide.nbs.test.infrastructure.utils.TestHelper;

import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertTrue;

@Component
public class AccountOverviewHelper extends AbstractPageUtils implements Page {

    private static int removeLinksfound = 0;
    private static int newRemoveLinksfound = 0;
    public static String beforeRemoveAccount = "";

    // page elements
    private String removeWithConsentButton = "remove-acc-popup";
    private String accountRemovedContinue = "//*[@id=\'accountRemovedPopUp\']/div/div/section[3]/button";
    List<WebElement> elementsRemoveButton;
    List<WebElement> elementsAccountNum;
    private WebDriver driver;
    private Map<String, String> propositionsUrls;
    // page elements
    private String previousButton = "back-arrow";
    private String removeButtons = "acc-remove";
    private String accountNumbers = "acc-information";
    private String accountNumber = "acc-num";
    private String lastBalanceRefresh = "acc-last-balance-refresh";
    private String addAccount = "+ ADD ACCOUNTS";
    private String cancelConsent = "cancel-remove-acc-popup";
    // by classname
    private String accountOverviewLogo = "modal-title-icon";
    private String totalBalance = "total-bal-nums";
    private String totalBalanceText = "total-bal-text";
    private String addAccountDiv = "add-acc-btn";
    private String yourAccountsText = "your-acc-heading";

    // link text
    private String addAccountButton = "+ADD ACCOUNTS";

    @Override
    public void go(String proposition) {
	this.driver.get(String.format("%s/account-overview", this.propositionsUrls.get(proposition)));
    }

    @Override
    public void refresh() {

    }

    @Override
    public void checkElementPresence(String type) {

	if (type.equalsIgnoreCase("remove account")) {
	    elementsRemoveButton = this.driver.findElements(By.className(removeButtons));
	    elementsAccountNum = this.driver.findElements(By.className(accountNumbers));
	    int removeButton = elementsRemoveButton.size();
	    int accountNum = elementsAccountNum.size();
	    if (removeButton == 0) {
		System.out.println("No Remove Buttons exist");
	    } else {
		boolean matches = removeButton == accountNum;
		System.out.println("Testing remove buttons number matches number of accounts = " + matches);
	    }
	}
    }

    @Override
    public String name() {
	return "account-overview";
    }

    @Override
    public void setDriver(WebDriver driver) {
	this.driver = driver;

    }

    @Override
    public void testTimeStamp(String element) {
	int removeButton = elementsRemoveButton.size();
	if (removeButton > 0) {
	    String timeStamp = this.driver.findElement(By.className(lastBalanceRefresh)).getText();
	    Pattern dateFrmtPtrn = Pattern.compile(
		    "([A-Z][a-z][a-z][\\s](3[01]|[12][0-9]|[1-9])[\\s][A-Z][a-z][a-z][\\s][0-9][0-9][:][0-9][0-9])");
	    Matcher mtch = dateFrmtPtrn.matcher(timeStamp);
	    boolean success = false;
	    if (mtch.matches()) {
		success = true;
		Assert.assertTrue(success);
	    } else {
		Assert.assertTrue(success);
	    }
	} else {
	    System.out.println("No Remove Buttons exist");
	}

    }

    @Override
    public void setPropositionsUrls(Map<String, String> propositionsUrls) {
	// TODO Auto-generated method stub

    }

    @Override
    public void click(String element) {
	switch (element.toLowerCase()) {
	case "back":
	    this.driver.findElement(By.className(previousButton)).click();
	    break;
	case "add":
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(addAccount)));
	    this.driver.findElement(By.partialLinkText(addAccount)).click();
	    break;

	case "remove":
	    this.removeAccount("any");
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
		// TODO Auto-generated catch block
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
	    elementsRemoveButton = this.driver.findElements(By.className(removeButtons));
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

    public void testNumberOfRemoveLinks() {
	AccountOverviewHelper.setNewRemoveLinksfound(this.driver.findElements(By.className(removeButtons)).size());
	System.out.println(
		"Number of removal links after account removal = " + AccountOverviewHelper.getNewRemoveLinksfound());
	Assert.assertTrue(
		AccountOverviewHelper.getRemoveLinksfound() == (AccountOverviewHelper.getNewRemoveLinksfound() + 1));
    }

    public static int getRemoveLinksfound() {
	return removeLinksfound;
    }

    public static void setRemoveLinksfound(int removeLinksfound) {
	AccountOverviewHelper.removeLinksfound = removeLinksfound;
    }

    public static int getNewRemoveLinksfound() {
	return newRemoveLinksfound;
    }

    public static void setNewRemoveLinksfound(int newRemoveLinksfound) {
	AccountOverviewHelper.newRemoveLinksfound = newRemoveLinksfound;
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
    public void checkText(String element) {
	// TODO Auto-generated method stub

    }

    @Override
    public void checkElementColour(String element, String colour) {
	// TODO Auto-generated method stub

    }

    // when hitting this page this method should be called to check UI is as
    // expected
    public void validatePageUI() {
	String actualAccountOverviewTitle = this.driver.findElement(By.className(accountOverviewLogo)).getText();
	String expectedAccountOverviewTitle = "Account overview";
	String actualYourAccountsText = this.driver.findElement(By.className(yourAccountsText)).getText();
	String expectedYourAccountsText = "YOUR ACCOUNTS";

	// assert page elements
	assertTrue(this.driver.findElement(By.className(previousButton)).isDisplayed());
	assertTrue(this.driver.findElement(By.className(accountOverviewLogo)).isDisplayed());
	assertTrue(actualAccountOverviewTitle.equalsIgnoreCase(expectedAccountOverviewTitle));
	assertTrue(this.driver.findElement(By.className(totalBalance)).isDisplayed());
	assertTrue(this.driver.findElement(By.className(totalBalanceText)).isDisplayed());
	assertTrue(this.driver.findElement(By.className(addAccountDiv)).isDisplayed());
	assertTrue(actualYourAccountsText.equalsIgnoreCase(expectedYourAccountsText));

    }

}
