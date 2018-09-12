package uk.co.nationwide.nbs.test.infrastructure.steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import uk.co.nationwide.nbs.test.infrastructure.utils.SauceUtils;

public class TestHooks {

    @Autowired
    private TestExecutionContext testExecutionContext;

    @Value("${test.webdriver.default.browser}")
    protected String defaultBrowser;
    @Value("${sauce.browser}")
    protected String sauceBrowser;
    @Value("${sauce.browser.version}")
    protected String saueBrowserVersion;
    @Value("${sauce.os.platform}")
    protected String sauceOSPlatform;
    public static final String USERNAME = "Azhar.Islam";
    public static final String ACCESS_KEY = "33c3df83-8b50-4877-ad0a-01e0a45b7b1f";

    /**
     * this hook will execute before every scenario.
     */
    @Before
    public void beforeScenario(Scenario scenario) {
        if (defaultBrowser.equals("sauce")) {
            testExecutionContext.setCapabilities(scenario.getName(), sauceBrowser, 1, sauceOSPlatform, saueBrowserVersion);
            System.out.println("Starting Scenario.....SauceLabs");
        } else {
            System.out.println("Starting Scenario.....Locally");
        }
    }

    /**
     * Even if test fail the after hook will still execute. this hook will
     * execute after every scenario.
     */
    @After
    public void afterScenario(Scenario scenario) {
        try {
            System.out.println("Finished Scenario and closing the driver.....");
            WebDriver driver = this.testExecutionContext.getDriver();
            if (driver != null) {
                //driver.close();
                if (defaultBrowser.equals("sauce")) {
                    String SessionID = testExecutionContext.getSessionID();
                    System.out.println("Session ID = " + SessionID);
                    System.out.println("Scenario Status = " + !scenario.isFailed());
                    driver.quit();
                    SauceUtils.UpdateResults(USERNAME, ACCESS_KEY, !scenario.isFailed(), SessionID);
                } else {
                    driver.close();
                    driver.quit();
                    System.out.println("Session Ended Locally");
                }
            }
        } catch (Exception e) {
            // nothing to do
        }
    }

}
