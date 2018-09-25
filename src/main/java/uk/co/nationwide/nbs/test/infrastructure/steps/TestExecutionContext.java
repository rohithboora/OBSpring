package uk.co.nationwide.nbs.test.infrastructure.steps;

import com.google.gson.Gson;

import io.restassured.http.Header;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import net.minidev.json.JSONObject;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import uk.co.nationwide.nbs.test.infrastructure.page.Page;
import uk.co.nationwide.nbs.test.infrastructure.page.PageFactory;
import uk.co.nationwide.nbs.test.infrastructure.utils.SauceUtils;

import java.util.HashMap;
import java.util.Map;


/**
 * @author simoniptatkuen
 */

/**
 * Defining a bean with singleton scope means the container creates a single
 * instance of that bean, and all requests for that bean name will return the
 * same object. This in essence will hold the state of our test while under
 * execution
 */
@Scope(scopeName = "SCOPE_SINGLETON", proxyMode = ScopedProxyMode.DEFAULT)
public class TestExecutionContext {

    final static Logger logger = Logger.getLogger(TestExecutionContext.class);
    // a var to hold our webdriver instance
    WebDriver driver;
    // a var to hold our application under test
    String application;
    // a var to hold our section (page) under test
    String section;
    // This annotation allows Spring to resolve and inject collaborating beans into
    // your bean.
    @Autowired
    private Map<String, String> propositionsUrls;
    // This annotation allows Spring to resolve and inject collaborating beans into
    // your bean.

    @Autowired
    private PageFactory pageFactory;
    @Autowired
    private Map<String, String> apisBaseUrl;
    @Autowired
    private Map<String, String> apiPaths;
    private RequestSpecification requestSpecification;
    private ValidatableResponse setResponseSpecification;
    private Map<String, Object> requestBodyPayload = new HashMap<>();
    private JSONObject requestBodyPayloadJson;
    
    //Header values
    private Header channelHeader = null;
    private Header authHeader = null;
    
    private String artiJsonFile = "";
    private static DesiredCapabilities Caps;
    private DesiredCapabilities capabilities = new DesiredCapabilities();
    private String sessionId = null;

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        //commented out if statement in order for TestHooks to close driver after each scenario, will revert if issues.
        //if (null == this.driver) {
        this.driver = driver;
        //}
    }

    public void setApplication(String application) {
        this.application = application;
    }


    public void setCapabilities(String scenarioName, String Browser, int Instances, String Platform, String Version) {

        capabilities.setCapability("name", scenarioName);
        capabilities.setCapability(CapabilityType.BROWSER_NAME, Browser);
        capabilities.setCapability("maxInstances", Instances);
        capabilities.setCapability("platform", Platform);
        capabilities.setCapability(CapabilityType.VERSION, Version);
        capabilities.setCapability("build", SauceUtils.getBuildName());
        this.Caps = capabilities;
    }

    public static DesiredCapabilities getCapabilities() {

        return Caps;
    }

    public String getSessionID() {
        return sessionId = (((RemoteWebDriver) driver).getSessionId()).toString();
    }

    public Page getPage() {
        Page answer = this.pageFactory.get(this.section);
        answer.setDriver(this.driver);
        answer.setPropositionsUrls(propositionsUrls);
        return answer;
    }

    /**
     * If we wish to use the methods from one of our pages(sections) we have to pass
     * it to this method, you will see this as declareSectionUnderTest(); in our
     * step files.
     *
     * @param section
     */
    public void setSection(String section) {
        this.section = section;
    }

    public PageFactory getPageFactory() {
        return pageFactory;

    }

    public io.restassured.specification.RequestSpecification getHttpRequestSpecification() {
        Assert.assertNotNull("Request specification must be defined as a first", this.requestSpecification);
        return this.requestSpecification;
    }

    public void setHttpRequestSpecification(io.restassured.specification.RequestSpecification requestSpecification) {
        this.requestSpecification = requestSpecification;
    }

    public String getHttpUrl() {
        System.out.println("Application: " + this.application);
        String url = String.format("%s%s", this.apisBaseUrl.get(this.application), this.apiPaths.get(this.section));
        System.out.println("generated URL " + url);
        return url;
    }

    public String getOauthUrl() {
        logger.info("Authorization URL is:" + this.propositionsUrls.get("authUrl"));
        return this.propositionsUrls.get("authUrl");
    }

    public void setResponseSpecification(ValidatableResponse validatableResponse) {
        this.setResponseSpecification = validatableResponse;
    }

    public ValidatableResponse getResponseSpecification() {
        return setResponseSpecification;
    }

    public void addHttpRequestBodyParameter(String name, Object value) {
        this.requestBodyPayload.put(name, value);
    }

    @SuppressWarnings("unchecked")
    public void addHttpRequestBody(Object value) {
        this.requestBodyPayload = new Gson().fromJson((String) value, Map.class);
    }
  
    
    public void addHttpRequestBodyParameterJson(JSONObject value) {
        this.requestBodyPayloadJson = value;
    }

    public Map<String, Object> getHttpRequestBodyPayload() {
        return requestBodyPayload;
    }

    /**
     * @return the artiJsonFile
     */
    public String getArtiJsonFile() {
        return artiJsonFile;
    }

    /**
     * @param artiJsonFile the artiJsonFile to set
     */
    public void setArtiJsonFile(String artiJsonFile) {
        this.artiJsonFile = artiJsonFile;
    }

    public JSONObject getRequestBodyPayloadJson() {
        return requestBodyPayloadJson;
    }

    
    //////////////////////////////////////////////////////SET HEADERS/////////////////////////////////////////////////
    
    //method to get header value
	public Header getChannelHeader() {
		return channelHeader;
	}

	//method to set header value
	public void setChannelHeader(Header channelHeader) {
		this.channelHeader = channelHeader;
	}

	//method to return the basic auth code
	public Header getAuthHeader() {
		return authHeader;
	}

	//method to set the basic auth code
	public void setAuthHeader(Header authHeader) {
		this.authHeader = authHeader;
	}
	
	
}
