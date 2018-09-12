package uk.co.nationwide.nbs.test.infrastructure.page.impl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Component;
import uk.co.nationwide.nbs.test.infrastructure.page.Page;
import uk.co.nationwide.nbs.test.infrastructure.utils.TestHelper;

import java.util.List;
import java.util.Map;

@Component
public class ObacNBSHelper extends AbstractPageUtils implements Page {


    private WebDriver driver;

    private String allowButton = "allowBtn";
    private String denyButton = "denyBtn";

    @Override
    public void go(String proposition) {

    }

    @Override
    public void click(String element) {
        switch (element.toLowerCase()) {
            case "success":
                driver.navigate().refresh();
                TestHelper.waitforelement(this.driver, allowButton, "id", 5);
                this.driver.findElement(By.id(allowButton)).click();
                break;
            case "error":
                TestHelper.waitforelement(this.driver, denyButton, "id", 5);
                this.driver.findElement(By.id(denyButton)).click();
                break;
            default:
                System.out.println("Cant find element " + element);
        }
    }

    @Override
    public void enterText(String text, String element) {

    }

    @Override
    public void clearText(String type, String accessName) {

    }

    @Override
    public String name() {
        return "obac-nbs";
    }

    @Override
    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public void setPropositionsUrls(Map<String, String> propositionsUrls) {

    }

    @Override
    public void checkPageElements(List<String> list) {

    }

    @Override
    public void checkElementPresence(String type) {

    }

    @Override
    public void checkText(String element) {

    }

    @Override
    public void checkElementColour(String element, String colour) {

    }
}
