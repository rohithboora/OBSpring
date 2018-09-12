package uk.co.nationwide.nbs.test.infrastructure.page.impl;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;
import uk.co.nationwide.nbs.test.infrastructure.page.Page;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertTrue;

@Component
public class DataRequestHelper extends AbstractPageUtils implements Page {

    WebDriver driver;
    private Map<String, String> propositionsUrls;

    // by linktext
    String confirmButton = "CONFIRM";
    // by linktext
    String cancelButton = "CANCEL";
    // by xpath
    private String fpnLink = "//*[@id='data-request']/div[2]/div[5]/div/p/a";
    private String help1 = "//*[@id=\"data-request\"]/div[2]/div[5]/div/p[2]";
    private String help2 = "//*[@id=\"data-request\"]/div[2]/div[5]/div/p[3]";
    private String help3 = "//*[@id=\"data-request\"]/div[2]/div[5]/div/p[4]";
    // by class
    private String backButton = "header--button__back";
    private String lockIcon = "header--icon__lock";
    private String moneyLogo = "data-request--logo__pic";

    // header Text
    private String h4Text1 = "Data request";
    private String h4Text2 = "Your Account Details";
    private String h4Text3 = "Your Account Transactions for the last 13 months (where available)";
    private String h4Text4 = "Your Account Features";
    private String h4Text5 = "Your Regular Payments";

    // para text
    private String paraText1 = "To be able to offer you this service, we just need to confirm you're happy for us to access the following account information from your bank or building society:";
    private String paraText2 = "We'll be able to access your account information for 90 days. After this, we'll ask you if you're still ok for us to access it. You'll just need to approve this every 90 days";
    private String paraText3 = "By clicking confirm, you agree to Nationwide collecting the above information from your financial provider.";

    // buttons
    private String confirmButtonElement = "data-request--buttons_confirm";
    private String cancelButtonElement = "data-request--buttons_dismiss";

    @Override
    public void go(String proposition) {
        this.driver.get(String.format("%s/select-provider", this.propositionsUrls.get(proposition)));

    }

    @Override
    public void click(String element) {
        switch (element.toLowerCase()) {
            case "cancel":
                this.driver.findElement(By.partialLinkText(cancelButton)).click();
                break;
            case "fpnlink":
                this.driver.findElement(By.xpath(fpnLink)).click();
                break;
            case "confirm":
                if (driver.getCurrentUrl().contains("arti")) {
                    this.driver.findElement(By.partialLinkText(confirmButton)).click();
                    break;
                }
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
        return "data-request";
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
                case "Data request":
                    Assert.assertTrue("testing Data request",
                            this.driver.findElement(By.xpath("//*[@id='header']/h4")).isDisplayed());
                    break;
                case "Your Account Details":
                    Assert.assertTrue("testing Your Account Details",
                            this.driver.findElement(By.xpath("//*[@id='data-request']/div[2]/div[1]/h4")).isDisplayed());
                    break;
                case "Your Account Transactions for the last 12 months":
                    Assert.assertTrue(
                            this.driver.findElement(By.xpath("//*[@id='data-request']/div[2]/div[2]/h4")).isDisplayed());
                    break;
                case "Your Account Features and Benefits":
                    Assert.assertTrue(
                            this.driver.findElement(By.xpath("//*[@id='data-request']/div[2]/div[3]/h4")).isDisplayed());
                    break;
                case "Your Regular Payments":
                    Assert.assertTrue(
                            this.driver.findElement(By.xpath("//*[@id='data-request']/div[2]/div[4]/h4")).isDisplayed());
                    break;
                case "CONFIRM":
                    Assert.assertTrue(this.driver.findElement(By.partialLinkText(confirmButton)).isDisplayed());
                    break;
                case "CANCEL":
                    Assert.assertTrue(this.driver.findElement(By.partialLinkText(cancelButton)).isDisplayed());
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

    @Override
    public void checkTextInsideElement(String element, String expectedText) {
        String expectedMessage = expectedText;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        switch (element.toLowerCase()) {
            case "help1":
                String message1 = this.driver.findElement(By.xpath(help1)).getText();
                Assert.assertEquals(expectedMessage.trim(), message1.trim());
                break;
            case "help2":
                String message2 = this.driver.findElement(By.xpath(help2)).getText();
                Assert.assertEquals(expectedMessage.trim(), message2.trim());
                break;
            case "help3":
                String message3 = this.driver.findElement(By.xpath(help3)).getText();
                Assert.assertEquals(expectedMessage.trim(), message3.trim());
                break;

        }
    }

    // when hitting this page this method should be called to check UI is as
    // expected
    @SuppressWarnings("null")
    public void validatePageUI() {
        // grab a list of h4 tags and get the text from them
        List<String> header4Text = null;
        List<String> paraText = null;

        List<WebElement> header4Tags = this.driver.findElements(By.tagName("h4"));
        header4Tags.forEach((temp) -> {
            String t = temp.getText();
            header4Text.add(t);
        });

        List<WebElement> paraTags = this.driver.findElements(By.tagName("p"));
        paraTags.forEach((temp) -> {
            String t = temp.getText();
            paraText.add(t);
        });

        // verify headers
        Assert.assertTrue(header4Text.contains(h4Text1));
        Assert.assertTrue(header4Text.contains(h4Text2));
        Assert.assertTrue(header4Text.contains(h4Text3));
        Assert.assertTrue(header4Text.contains(h4Text4));
        Assert.assertTrue(header4Text.contains(h4Text5));

        // verify header bar
        assertTrue(this.driver.findElement(By.className(moneyLogo)).isDisplayed());
        assertTrue(this.driver.findElement(By.className(lockIcon)).isDisplayed());
        assertTrue(this.driver.findElement(By.className(backButton)).isDisplayed());

        // verify para
        Assert.assertTrue(paraText.contains(paraText1));
        Assert.assertTrue(paraText.contains(paraText2));
        Assert.assertTrue(paraText.contains(paraText2));

        // verify buttons
        assertTrue(this.driver.findElement(By.className(confirmButtonElement)).isDisplayed());
        assertTrue(this.driver.findElement(By.className(cancelButtonElement)).isDisplayed());

    }

}
