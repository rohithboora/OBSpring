package uk.co.nationwide.nbs.test.infrastructure.steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import uk.co.nationwide.nbs.test.infrastructure.page.impl.AuthenticationHelper;
import uk.co.nationwide.nbs.test.infrastructure.utils.TestHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CommonSteps extends AbstractStep {

    /**
     * This is the Common Steps Class, we should try and reuse current steps, we
     * need to keep these steps to a minimum
     */

    @Autowired
    private Map<String, String> propositionsUrls;

    private AuthenticationHelper authenticationHelper = new AuthenticationHelper();

    @Given("^A user access \"([^\"]*)\" section of \"([^\"]*)\" application$")
    public void aa_user_access_section_of_application(String section, String application) throws Throwable {
        this.declareApplicationAndSectionUnderTest(application, section);
        ((JavascriptExecutor) driver).executeScript("window.open();");
        ArrayList<String> listOfActivateTabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(listOfActivateTabs.get(1));
        this.getPage().go(application);
        Dimension d = new Dimension(375, 667);
        this.getDriver().manage().window().setSize(d);
    }


    @Given("^authenticate with email \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void authenticateWithLoginAndPassword(String mailAddress, String password) throws Throwable {
        this.configureWebDriver();
        driver.get(getOauthUrl());
        authenticationHelper.clickOnLocalLoginButton(driver);
        authenticationHelper.enterEmailAddress(driver, mailAddress);
        authenticationHelper.enterPassword(driver, password);
        authenticationHelper.loginOnAuthPage(driver);
        driver.navigate().refresh();
        Thread.sleep(2000);
    }

    // check the following links are displayed on screen
    @Then("^The screen should display the the following elements:$")
    public void the_screen_should_display_the_the_following_links(List<String> list) throws Throwable {
        this.getPage().checkPageElements(list);
    }

    // click on web element
    @When("^A user clicks the \"([^\"]*)\" button on the \"([^\"]*)\" page$")
    public void click(String element, String section) throws Throwable {
        if (element.equalsIgnoreCase("back") & !section.equalsIgnoreCase("settings")) {
            driver.findElement(By.className("header--button__back")).click();
        } else if (element.equalsIgnoreCase("back") & section.equalsIgnoreCase("settings")) {
            this.declareSectionUnderTest(section);
            this.getPage().click(element);
        } else {
            this.declareSectionUnderTest(section);
            this.getPage().click(element);
        }
    }

    // enter text into input field
    @Then("^A user enters \"([^\"]*)\" in \"([^\"]*)\" field on the \"([^\"]*)\" page$")
    public void enter_text(String text, String element, String section) {
        this.declareSectionUnderTest(section);
        this.getPage().enterText(text, element);
    }

    @When("^A user enters \"([^\"]*)\" and validates \"([^\"]*)\" for the following inputs:$")
    public void a_user_enters_something_and_validates_something_for_the_following_inputs(List<String> input,
                                                                                         List<String> response) throws Throwable {
        this.getPage().validateNLPconversation(input, response);
    }

    // check that we are redirected to the correct url
    @Then("^A user is redirected to the \"([^\"]*)\" page$")
    public void a_user_is_redirected_to_the_something_section_of_something_application(String section)
            throws InterruptedException {
        this.declareSectionUnderTest(section);
        TestHelper.testCurrentURL(section, this.getDriver());
        if (section.equalsIgnoreCase("chatbot")) {
            driver.navigate().refresh();
        }
    }

    @Then("^a screenshot is taken \"([^\"]*)\"$")
    public void a_screenshot_is_taken_something(String option) throws Throwable {
        if (option.equalsIgnoreCase("yes")) {
            TestHelper.takeScreenShot(this.getDriver());
        }

    }

    @Then("^A user should see the \"([^\"]*)\" field highlighted in \"([^\"]*)\" on the \"([^\"]*)\" page$")
    public void a_user_must_see_the_field_highlighted_in_on_the_page(String fieldname, String colour, String section)
            throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        this.declareSectionUnderTest(section);
        String browserColour = TestHelper.getColour(this.getDriver(), colour);
        this.getPage().checkElementColour(fieldname, browserColour);
    }

    // step to check element is present
    @Then("^A user should see a \"([^\"]*)\" button on \"([^\"]*)\" page$")
    public void check_element_presence(String type, String section) throws Exception {
        this.declareSectionUnderTest(section);
        this.getPage().checkElementPresence(type);
    }

    @When("^A user clicks the \"([^\"]*)\" button for \"([^\"]*)\" account on the \"([^\"]*)\" page$")
    public void a_user_clicks_the_something_button_for_something_account_on_the_something_page(String link,
                                                                                               String account, String section) throws Throwable {
        this.declareSectionUnderTest(section);
        this.getPage().click(link);
    }

    @When("^A user enters credentials on page$")
    public void A_user_enters_login_credentials(DataTable userCredentials) throws Throwable {

        List<List<String>> data = userCredentials.raw();
        for (List<String> list : data) {
            this.getPage().enterText(list.get(0), "email");
            this.getPage().enterText(list.get(1), "password");
            this.getPage().click("log me in");
        }

    }

    @Then("^A user should see account has been \"([^\"]*)\" on the \"([^\"]*)\" page$")
    public void a_user_should_see_something_has_been_removed_on_the_something_page(String type, String section)
            throws Throwable {
        this.declareSectionUnderTest(section);
        this.getPage().checkElementPresence(type);
    }

    // check the following links are displayed on screen
    @Then("^The screen should display the following text: \"([^\"]*)\"$")
    public void the_screen_should_display_the_following_texts(String element) throws Throwable {
        this.getPage().checkText(element);
    }

    @Then("^The screen should display the first message as text: \"([^\"]*)\"$")
    public void the_screen_should_display_the_first_message_as_text_something(String element) throws Throwable {
        this.getPage().getFirstMessage(element);
    }

    @Then("^The screen should display the last message as text: \"([^\"]*)\"$")
    public void the_screen_should_display_the_last_message_as_text_something(String element) throws Throwable {
        this.getPage().getLastMessage(element);
    }


    @Then("^The user navigates to \"([^\"]*)\"$")
    public void the_user_navs_to(String url) throws Throwable {
        System.out.println("navigating to " + url);
        TestHelper.getURL(this.getDriver(), url);

    }

    @Then("^The chatbot response should not contain deleted account$")
    public void the_chatbot_response_should_not_contain_deleted_account() throws Throwable {
        this.getPage().testAgentRemovalOfAccountResponses();
    }

    @Then("^A user should see \"([^\"]*)\" with text \"([^\"]*)\"$")
    public void A_user_should_see_object_with_text_something(String element, String expectedText) throws Throwable {
        this.getPage().checkTextInsideElement(element, expectedText);
    }

    @Then("^A user should see \"([^\"]*)\" with text$")
    public void A_user_should_see_object_with_text(String element, String expectedText) throws Throwable {
        this.getPage().checkTextInsideElement(element, expectedText);
    }

    @And("^A user should see the Timestamp format on \"([^\"]*)\" page$")
    public void a_user_should_see_the_timestamp_format_on_something_page(String element) throws Throwable {
        this.getPage().testTimeStamp(element);
    }

    // generic method used for checking messages displayed on the page
    @Then("^A user should see the \"([^\"]*)\" message \"([^\"]*)\" on the page$")
    public void a_user_should_see_the_something_message_something_on_the_page(String type, String message)
            throws Throwable {
        this.getPage().checkText(type, message);
    }

    @Then("^A user should see \"([^\"]*)\"$")
    public void check_element_exists(String type) throws Exception {
        this.getPage().checkElementPresence(type);
    }

    @And("^A user checks last \"([^\"]*)\" agent messages$")
    public void a_user_checks_last_something_agent_messages(int number, List<String> messages) throws Throwable {
        this.getPage().testAgentMessages(messages, number);
    }

    // step to test outputs from arti given various user inputs supplied in selected JSON file
    @And("^the correct conversation for \"([^\"]*)\" in arti is progressed checking \"([^\"]*)\" agent messages \\[data=\"(.*)\"\\]$")
    public void the_correct_conversation_in_arti_is_progressed_datasomething(String accountStatus, int messages, String dataSet) throws Throwable {
        this.setDataSetFromTestExecution(dataSet);
        this.getPage()
                .progressDiscussion(DataManager.getData(super.getTestDataPath(), dataSet.trim(), ARTIChatDo.class), accountStatus, messages);
    }

    // step to check chatbot buttons
    @And("^A user checks last \"([^\"]*)\" agent button$")
    public void a_user_checks_last_something_agent_buttons(int number, List<String> buttons) throws Throwable {
        this.getPage().testAgentButtons(buttons, number);
    }

    @When("^A user remains idle for \"([^\"]*)\" minutes on \"([^\"]*)\" page$")
    public void a_user_remains_idle_for_minutes_on_page(String arg1, String section) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        this.declareSectionUnderTest(section);
        this.getPage().checkElementPresence(arg1);
    }
}