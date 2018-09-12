package uk.co.nationwide.nbs.test.infrastructure.steps;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import net.minidev.json.JSONObject;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import uk.co.nationwide.nbs.test.infrastructure.config.Application;
import uk.co.nationwide.nbs.test.infrastructure.page.Page;
import uk.co.nationwide.nbs.test.infrastructure.page.PageFactory;
import uk.co.nationwide.nbs.test.infrastructure.utils.WebDriverPicker;

import java.io.File;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @author quirino
 */
@ContextConfiguration(classes = Application.class)
public abstract class AbstractStep {

    private static Platform currentPlatform = Platform.getCurrent();
    public String testDataPath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test" + File.separator + "resources" + File.separator + "testdata" + File.separator;
    @Value("${test.webdriver.default.browser}")
    protected String defaultBrowser;
    WebDriver driver;
    @Value("${test.environment.endpoint}")
    private String endpoint;
    @Value("${test.webdriver.gecko.driver}")
    private String firefoxWebDriverPath;
    @Value("${test.webdriver.chrome.driver}")
    private String chromeDriverPath;
    @Value("${test.webdriver.macgecko.driver}")
    private String firefoxWebDriverMacPath;
    @Value("${test.webdriver.macchrome.driver}")
    private String chromeDriverMacPath;
    @Value("${test.webdriver.safari.driver}")
    private String safariDriverPath;
    @Value("${test.webdriver.sauce.driver}")
    private String sauceDriverPath;
    @Autowired(required = false)
    private TestExecutionContext testExecutionContext;

    public String getTestDataPath() {
        return testDataPath;
    }

    public void setTestDataPath(String testDataPath) {
        this.testDataPath = testDataPath;
    }

    //check prop file to get default browser
    void configureWebDriver() {
        switch (defaultBrowser) {
            case "firefox":
                if (currentPlatform.toString().equals("MAC")) {
                    driver = WebDriverPicker.fromAlias(defaultBrowser).getDriver(firefoxWebDriverMacPath);
                } else {
                    driver = WebDriverPicker.fromAlias(defaultBrowser).getDriver(firefoxWebDriverPath);
                }
                break;
            case "chrome":
                if (currentPlatform.toString().equals("MAC")) {
                    driver = WebDriverPicker.fromAlias(defaultBrowser).getDriver(chromeDriverMacPath);
                } else {
                    System.out.println(currentPlatform);
                    driver = WebDriverPicker.fromAlias(defaultBrowser).getDriver(chromeDriverPath);
                }
                break;
            case "safari":
                driver = WebDriverPicker.fromAlias(defaultBrowser).getDriver(chromeDriverMacPath);
                System.out.println(currentPlatform);
                break;
            case "sauce":
                System.out.println(currentPlatform);
                driver = WebDriverPicker.fromAlias(defaultBrowser).getDriver(sauceDriverPath);
                break;
            default:
                throw new IllegalArgumentException("Unsupported value for: defaultBrowser");
        }
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        testExecutionContext.setDriver(driver);
    }

    public void configureHttpClient() {
        testExecutionContext.setHttpRequestSpecification(RestAssured.given().relaxedHTTPSValidation());
    }

    public void declareApplicationUnderTest(String application) {
        this.testExecutionContext.setApplication(application);
    }

    public void declareApplicationAndSectionUnderTest(String application, String section) {
        this.testExecutionContext.setApplication(application);
        this.testExecutionContext.setSection(section);
    }

    public void declareSectionUnderTest(String section) {
        this.testExecutionContext.setSection(section);
    }

    WebDriver getDriver() {
        return this.testExecutionContext.getDriver();
    }


    Page getPage() {
        return this.testExecutionContext.getPage();
    }

    PageFactory getPageFactory() {
        return this.testExecutionContext.getPageFactory();
    }
//    Deprecated
//    public void defineHttpParameter(String name, String placement, Object value) {
//        io.restassured.specification.RequestSpecification requestSpecification = testExecutionContext.getHttpRequestSpecification();
//        if ("path".equalsIgnoreCase(placement)) {
//            requestSpecification.pathParam(name, value);
//        } else if ("header".equalsIgnoreCase(placement)) {
//            requestSpecification.header(name, value);
//        } else if ("payload".equalsIgnoreCase(placement)) {
//            testExecutionContext.addHttpRequestBodyParameter(name, value);
//        } else if ("payload-json".equalsIgnoreCase(placement)) {
//            testExecutionContext.addHttpRequestBody(value);
//        }
//    }

    public void defineHttpParameter(String name, Object value) {
        io.restassured.specification.RequestSpecification requestSpecification = testExecutionContext.getHttpRequestSpecification();
        requestSpecification.pathParam(name, value);
    }
    
    //method to add header data to request
    public void defineHttpHeader(String name, Object value) {
        io.restassured.specification.RequestSpecification requestSpecification = testExecutionContext.getHttpRequestSpecification();
        requestSpecification.headers(name,value);
    }


    public void defineHttpParameterJson(JSONObject value) {
        io.restassured.specification.RequestSpecification requestSpecification = testExecutionContext
                .getHttpRequestSpecification();
        testExecutionContext.addHttpRequestBodyParameterJson(value);
    }

    public io.restassured.specification.RequestSpecification requestSpecification() {
        return this.testExecutionContext.getHttpRequestSpecification();
    }

    public String getHttpUrl() {
        return this.testExecutionContext.getHttpUrl();
    }

    public String getOauthUrl() {
        return this.testExecutionContext.getOauthUrl();
    }

    public void setResponseSpecification(ValidatableResponse validatableResponse) {
        this.testExecutionContext.setResponseSpecification(validatableResponse);
    }

    public ValidatableResponse responseSpecification() {
        return this.testExecutionContext.getResponseSpecification();
    }

    public Map<String, Object> getHttpRequestBodyPayload() {
        return this.testExecutionContext.getHttpRequestBodyPayload();
    }

    public JSONObject getHttpRequestBodyPayloadJson() {
        return this.testExecutionContext.getRequestBodyPayloadJson();
    }

    public String getDataSetFromTestExecution() {
        return this.testExecutionContext.getArtiJsonFile();
    }

    public void setDataSetFromTestExecution(String json) {

        this.testExecutionContext.setArtiJsonFile(json);

    }
}

