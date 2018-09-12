package uk.co.nationwide.nbs.test.infrastructure.page.impl;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import org.apache.http.annotation.Obsolete;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.stereotype.Component;

import uk.co.nationwide.nbs.test.infrastructure.page.Page;
import uk.co.nationwide.nbs.test.infrastructure.utils.TestHelper;

@Component
public class SettingsHelper extends AbstractPageUtils implements Page {

    WebDriver driver;
    private Map<String, String> propositionsUrls;

    // class
    private String backButton = "back-to-confirm-btn";
    private String logoutButton = "logout-button";
    private String yesButton = "logout-modal-yes";
    private String cancelButton = "logout-modal-cancel";
    private String idleNoButton = "idle-modal-no";
    private String idleYesButton = "idle-modal-yes";
    private String idlepopup = "idleModal";
    private String profile = "myProfile";
    private String importantInfo = "legal";

    // header text
    private String h4Text1 = "Settings";

    // options
    String expectedProfileText = "My Profile";
    String expectedInformationText = "Important Information";

    // chevrons
    // by class
    String chevrons = "settings-menu-chevron";


    @Override
    public void go(String proposition) {
        // TODO Auto-generated method stub
        this.driver.get(String.format("%s/settings", this.propositionsUrls.get(proposition)));
    }

    @Override
    public void click(String element) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        switch (element.toLowerCase()) {
            case "myprofile":
                this.driver.findElement(By.id(profile)).click();
                System.out.println("buttonclicked");
                break;
            case "back":
                this.driver.findElement(By.id(backButton)).click();
                System.out.println("buttonclickedd");
                break;
            case "logout":
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(logoutButton)));
                this.driver.findElement(By.id(logoutButton)).click();
                break;
            case "yes":
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(yesButton)));
                this.driver.findElement(By.id(yesButton)).click();
                break;
            case "cancel":
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(cancelButton)));
                this.driver.findElement(By.id(cancelButton)).click();
                break;
            case "idleyes":
                this.driver.findElement(By.id(idleYesButton)).click();
                break;
            case "idleno":
                this.driver.findElement(By.id(idleNoButton)).click();
                break;
            case "importantinfo":
                this.driver.findElement(By.id(importantInfo)).click();
                break;
            default:
                System.out.println("Cant find element " + element);
                assertTrue(false);
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

        return "settings";
    }

    @Override
    public void setDriver(WebDriver driver) {
        this.driver = driver;
        // TODO Auto-generated method stub
    }

    @Override
    public void setPropositionsUrls(Map<String, String> propositionsUrls) {
        this.propositionsUrls = propositionsUrls;
    }

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
                case "back":
                    Assert.assertTrue("testing Data request", this.driver.findElement(By.id(backButton)).isDisplayed());
                    break;
                case "logout":
                    Assert.assertTrue("testing Data request", this.driver.findElement(By.id(logoutButton)).isDisplayed());
                    break;
                default:
                    System.out.println("Cant find element  " + element);
            }
        }

    }

    @Override
    public void checkElementPresence(String min) {
        int seconds = Integer.parseInt(min) * 100;
        TestHelper.waitforelement(this.driver, idlepopup, "id", seconds);

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

        List<WebElement> header4Tags = this.driver.findElements(By.tagName("h4"));
        header4Tags.forEach((temp) -> {
            String t = temp.getText();
            header4Text.add(t);
        });

        List<WebElement> chevronTags = this.driver.findElements(By.className("settings-menu-chevron"));
        int numberOfChevrons = chevronTags.size();

        // verify headers
        Assert.assertTrue(header4Text.contains(h4Text1));

        // verify options
        assertTrue(this.driver.findElement(By.id(profile)).getText().equalsIgnoreCase(expectedProfileText));
        assertTrue(this.driver.findElement(By.id(importantInfo)).getText().equalsIgnoreCase(expectedInformationText));

        // verify back icon
        assertTrue(this.driver.findElement(By.id(backButton)).isDisplayed());

        // verify buttons
        assertTrue(this.driver.findElement(By.id(logoutButton)).isDisplayed());

        // verify chevrons
        assertTrue(numberOfChevrons == 2);
    }

}
