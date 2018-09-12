package uk.co.nationwide.nbs.test.infrastructure.page.impl;

import com.google.common.collect.Iterables;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import uk.co.nationwide.nbs.test.infrastructure.page.Page;
import uk.co.nationwide.nbs.test.infrastructure.steps.ARTIChatDo;
import uk.co.nationwide.nbs.test.infrastructure.utils.TestHelper;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertTrue;

@Component
public class ChatbotHelper extends AbstractPageUtils implements Page {

    private WebDriver driver;
    private Map<String, String> propositionsUrls;
    private String beforeAccountRemove = "";
    private String afterAccountRemove = "";
    private String progressDiscussionCurrentUserMessage = "";
    private String userStatus = "";
    int failCounter = 0;

    // Page Elements
    private String artiLogo = "top-avatar";

    // by id
    private String chatInputBox = "chatInput";
    // by id
    private String chatSendButton = "sendChat";
    // by css selector
    private String connectAccountsButton = "//*[@id=\"chat-bubble-wrapper\"]/quick-res-buttons/div/div/button";
    // by xpath
    private String accountOverview = "//*[@id=\"chat-bubble-wrapper\"]/quick-res-buttons/div/div[2]/button";
    // by xpath
    private String spending = "//*[@id='chat-bubble-wrapper']/home-carousel/ul/li[2]/div/a";
    // by xpath
    private String moveMoney = "//*[@id='chat-bubble-wrapper']/home-carousel/ul/li[3]/div/a";
    // by xpath
    private String budgeting = "//*[@id='chat-bubble-wrapper']/home-carousel/ul/li[4]/div/a";
    // by xpath
    private String tellMeMore = "//*[@id='chat-bubble-wrapper']/home-carousel/ul/li[5]/div/a";
    // by class name
    private String homeButton = "cta-btn ng-binding";
    // by class name
    private String backArrow = "back-arrow";
    // by id
    private String yesButton = "logout-modal-yes";
    // by id
    private String cancelButton = "logout-modal-cancel";
    // byxpath
    private String welcomeMessage = "//*[@id=\'chat-bubble-wrapper\']/div[2]";
    // id
    private String settingsButton = "settings";
    // class
    private String addYourAccount = "cta-btn";

    @Override
    public void go(String proposition) {
        // this.driver.get(String.format("%s/chatbot",
        // this.propositionsUrls.get(proposition)));
    }

    @Override
    public String name() {
        return "chatbot";
    }

    public void checkLinks(List<String> list) {

        List<String> expected = new ArrayList<String>();
        expected.add(list.get(0));
        expected.add(list.get(1));
        expected.add(list.get(2));
        expected.add(list.get(3));
        expected.add(list.get(4));

        List<String> actual = new ArrayList<String>();
        actual.add(this.driver.findElement(By.xpath(accountOverview)).getText());
        actual.add(this.driver.findElement(By.xpath(spending)).getText());
        actual.add(this.driver.findElement(By.xpath(moveMoney)).getText());
        actual.add(this.driver.findElement(By.xpath(budgeting)).getText());
        actual.add(this.driver.findElement(By.xpath(tellMeMore)).getText());
        actual.add(this.driver.findElement(By.xpath(welcomeMessage)).getAttribute("innerText"));
        System.out
                .println("hjgvyhgvyugty" + this.driver.findElement(By.xpath(welcomeMessage)).getAttribute("innerText"));

        Collections.sort(expected);
        Collections.sort(actual);
        boolean result = expected.equals(actual);
        System.out.println("Testing links are as expected on Account Ovierview = " + result);
    }

    public void validateNLPconversation(List<String> input, List<String> response) {
        List<String> inputelements = input;
        int inputSize = inputelements.size();
        // System.out.println("Input list size is " + inputSize);

        List<String> responseelements = response;
        int responseSize = responseelements.size();
        // System.out.println("Output list size is " + responseSize);

        for (int i = 0; i < inputSize; i++) {
            String element = inputelements.get(i).toString();
            String responseElement = responseelements.get(i).toString();
            this.driver.findElement(By.id(chatInputBox)).sendKeys(element);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            this.driver.findElement(By.id(chatSendButton)).click();
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            getLastMessage(responseElement);

        }

    }

    @Override
    public void click(String element) {
        switch (element.toLowerCase()) {
            case "sendchat":
                this.driver.findElement(By.id(chatSendButton)).click();
                try {
                    Thread.sleep(6000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                break;
            case "add your account":
                this.driver.findElement(By.className(addYourAccount)).click();
                break;
            case "home":
                this.driver.findElement(By.className(homeButton)).click();
                break;
            case "settings":
                this.driver.findElement(By.id(settingsButton)).click();
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            case "yes":
                TestHelper.waitforelement(this.driver, cancelButton, "id", 5);
                this.driver.findElement(By.id(yesButton)).click();
                break;
            case "cancel":
                TestHelper.waitforelement(this.driver, cancelButton, "id", 5);
                this.driver.findElement(By.id(cancelButton)).click();
                break;
            case "add your accounts":
                List<WebElement> webElementsB1 = this.driver.findElements(By.className("cta-btn"));
                for (WebElement m : webElementsB1) {
                    System.out.println(m.getText());
                    if (m.getText().equalsIgnoreCase("Add your accounts"))
                        m.click();
                }
                break;
            case "account overview":
                List<WebElement> webElementsB2 = this.driver.findElements(By.className("cta-btn"));
                for (WebElement m : webElementsB2) {
                    System.out.println(m.getText());
                    if (m.getText().equalsIgnoreCase("Overview of your accounts"))
                        m.click();

                }
                break;
            case "connect account":
                List<WebElement> webElementsB3 = this.driver.findElements(By.className("cta-btn"));
                for (WebElement m : webElementsB3) {
                    System.out.println(m.getText());
                    if (m.getText().equalsIgnoreCase("Add your accounts"))
                        m.click();
                }
                break;
            default:
                System.out.println("Cant find element  " + element);
        }

    }

    @Override
    public void enterText(String text, String element) {
        switch (element.toLowerCase()) {
            case "chatinput":
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                this.driver.findElement(By.id(chatInputBox)).sendKeys(text);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                break;
            default:
                System.out.println("Cant find element " + element);
        }
    }

    @Override
    public void checkText(String element) {
        switch (element.toLowerCase()) {
            case "welcome message":
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                this.driver.findElement(By.xpath(welcomeMessage)).getAttribute("innerText");
                System.out.println(this.driver.findElement(By.xpath(welcomeMessage)).getAttribute("innerText"));
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                break;
            default:
                System.out.println("Cant find element " + element);
        }
    }

    @Override
    public void getFirstMessage(String element) {
        element.toLowerCase();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        WebElement containerElement = driver.findElement(By.id("chat-container"));
        List<WebElement> webElements = containerElement.findElements(By.xpath("//*[@id=\"chat-bubble-wrapper\"]/div/p"));
        WebElement firstelement = Iterables.getFirst(webElements, driver.findElement(By.xpath("//*[@id=\"chat-bubble-wrapper\"]/div/p")));
        String firstmessage = firstelement.getText();
        System.out.println("Actual agent's first response: " + firstmessage);
        Assert.isTrue(firstmessage.equalsIgnoreCase(element), "Expected message doen't match");
        System.out.println("Actual agent's first response: " + firstmessage + " matches with " + element);
    }

    @Override
    public void getLastMessage(String element) {
        if (element.equalsIgnoreCase("all balance details")) {
            WebElement containerElement = driver.findElement(By.id("chat-container"));
            List<WebElement> webElements = containerElement.findElements(By.xpath("//*[@id=\"chat-bubble-wrapper\"]/div/p"));
            WebElement lastelement = Iterables.getLast(webElements, driver.findElement(By.xpath("//*[@id=\"chat-bubble-wrapper\"]/div/p")));
            String lastMessage = lastelement.getText();
            setAgentResponsesForRemovalOfAccount(lastMessage);
        } else {
            element.toLowerCase();
            WebElement containerElement = driver.findElement(By.id("chat-container"));
            List<WebElement> webElements = containerElement.findElements(By.xpath("//*[@id=\"chat-bubble-wrapper\"]/div/p"));
            WebElement lastelement = Iterables.getLast(webElements, driver.findElement(By.xpath("//*[@id=\"chat-bubble-wrapper\"]/div/p")));
            TestHelper.waitforelement(this.driver, "//*[@id=\"chat-bubble-wrapper\"]/div/p", "xpath", 5);
            String lastMessage = lastelement.getText();
            System.out.println("Agent's last response : " + lastMessage);
            Assert.isTrue(lastMessage.contains(element), "Expected message doen't match");
            System.out.println("Actual agent's last response: " + lastMessage + " matches with " + element);
        }

    }

    public void setAgentResponsesForRemovalOfAccount(String agentLastMessage) {
        if (beforeAccountRemove == "") {
            beforeAccountRemove = agentLastMessage;
            System.out.println("What is my balance message BEFORE account has been removed = " + beforeAccountRemove);
        } else {
            afterAccountRemove = agentLastMessage;
            System.out.println("What is my balance message AFTER account has been removed = " + afterAccountRemove);
            beforeAccountRemove = "";
        }
    }

    public void testAgentRemovalOfAccountResponses() {
        String removedAccount = AccountOverviewHelper.beforeRemoveAccount;
        System.out.println("Checking what is my balance message doesnt contain removed account = " + removedAccount);
        if (afterAccountRemove.contains(removedAccount)) {
            System.out.println("*****************************************************************************");
            System.out.println("The Agent message still contains the removed account, TEST HAS FAILED!!!!!!!!");
            System.out.println("*****************************************************************************");
            System.out.println(afterAccountRemove);
            System.out.println("*****************************************************************************");
        } else {
            System.out.println("*****************************************************************************");
            System.out.println("The Agent message does not contain the removed account, TEST HAS PASSED!!!!!!");
            System.out.println("*****************************************************************************");
            System.out.println(afterAccountRemove);
            System.out.println("*****************************************************************************");
        }
    }

    @Override
    public void clearText(String type, String accessName) {
        // TODO Auto-generated method stub

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
    public void scrollPage(String to) {
        // TODO Auto-generated method stub

    }

    @Override
    public void refresh() {
        // TODO Auto-generated method stub

    }

    @Override
    public void takeScreenShot() {
        // TODO Auto-generated method stub

    }

    @Override
    public void checkElementPresence(String type) {
        // TODO Auto-generated method stub

    }

    @Override
    public void checkPageElements(List<String> list) {
        // TODO Auto-generated method stub

    }

    @Override
    public void checkElementColour(String element, String colour) {
        // TODO Auto-generated method stub

    }

    public void testAgentMessages(List<String> messages, int size) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<String> expectedAgentMessages = messages;
        List<String> actualAgentMessages = new ArrayList<String>();
        List<WebElement> webElements = this.driver.findElements(By.xpath("//*[@id=\"chat-bubble-wrapper\"]/div/p"));
        List<WebElement> agentM = webElements.subList(Math.max(webElements.size() - size, 0), webElements.size());
        for (WebElement m : agentM) {
            System.out.println(m.getText());
            actualAgentMessages.add(m.getText());
        }
        System.out.println("Actual Messages - " + actualAgentMessages.toString());
        System.out.println("Expected Messages - " + expectedAgentMessages.toString());
        assertTrue(expectedAgentMessages.equals(actualAgentMessages));
    }

    public void testAgentButtons(List<String> buttons, int size) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        List<String> expectedAgentbuttons = buttons;
        List<String> actualAgentbuttons = new ArrayList<String>();
        List<WebElement> webElements = this.driver.findElements(By.className("cta-btn"));
        List<WebElement> agentB = webElements.subList(Math.max(webElements.size() - size, 0), webElements.size());
        for (WebElement m : agentB) {
            System.out.println(m.getText());
            actualAgentbuttons.add(m.getText());
        }
        System.out.println("Actual Buttons - " + actualAgentbuttons.toString());
        System.out.println("Expected Buttons - " + expectedAgentbuttons.toString());
        assertTrue(expectedAgentbuttons.equals(actualAgentbuttons));
    }

    /*
     * (non-Javadoc) This method takes parameters of type ARTIChatDo and String
     * ArtiChatDo is the json set that will be used String will set if chatbot
     * response is for no connected accounts or connected accounts
     *
     * The method will take an Arti response from user input and assert that with
     * expected response in the JSON conversation (ArtiChatDo)
     */
    ////////////////////////////////////////////// START - Chatbot Agent Message
    ////////////////////////////////////////////// ////////////////////////////////////////////////////////////////////////////////////////////////

    public void progressDiscussion(ARTIChatDo dataSet, String accountStatus, int messageNum) {
        this.userStatus = accountStatus;
        // loop through JSON chat file
        for (int i = 0; i < dataSet.item.size(); i++) {
            // if JSON file item NOT equals "end of script" then continue
            if (!(dataSet.item.get(Integer.toString(i + 1)).user.equalsIgnoreCase("end of script"))) {

                // get JSON user item and enter to chatbot
                progressDiscussionCurrentUserMessage = dataSet.item.get(Integer.toString(i + 1)).user;
                this.driver.findElement(By.id(chatInputBox)).click();
                this.enterText(dataSet.item.get(Integer.toString(i + 1)).user, chatInputBox);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                this.click("sendchat");


                // call method to return a list of agent buttons
                List<WebElement> agentButtons = this.progressDiscussionGetAgentButtons();

                // check chatbot buttons
                this.progressDiscussionVerifyAgentButtons(agentButtons, this.userStatus);

                // get expected agent message from JSON
                String expected = dataSet.item.get(Integer.toString(i + 1)).arti;

                // call method to get actual agent message
                String agentMessage = this.progressDiscussionGetActualAgentMessage(messageNum);

                // call method to verify agent message
                this.progressDiscussionVerifyAgentMessage(expected, agentMessage);

            }

        }
        if (failCounter > 0) {
            assertTrue("One of the inputs has failed, check error log", false);
        }
    }

    // get last specific messages if connected, get last message
    public String progressDiscussionGetActualAgentMessage(int num) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        List<WebElement> webElements = this.driver.findElements(By.xpath("//*[@id=\"chat-bubble-wrapper\"]/div/p"));
        System.out.println("Amount of elements returned with classname of agent = " + webElements.size());
        String actual = "";
        String actualFinal = "";
        List<WebElement> agentM = webElements.subList(Math.max(webElements.size() - num, 0), webElements.size());
        if (num == 1) {
            actualFinal = agentM.get(0).getText();
        } else if (num == 2) {
            actual = agentM.get(0).getText();
            String actual1 = actual + " ";
            String actual2 = agentM.get(1).getText();
            actualFinal = actual1.concat(actual2);
        } else {
            System.out.println("Over 2 messages not implemented yet!!!");
        }
        return actualFinal;
    }

    // get all buttons from chatbot and return
    public List<WebElement> progressDiscussionGetAgentButtons() {
        List<WebElement> buttons = new ArrayList<WebElement>();
        buttons = this.driver.findElements(By.className("cta-btn"));
        return buttons;
    }

    // verify that displayed buttons match users account connected status
    public void progressDiscussionVerifyAgentButtons(List<WebElement> buttons, String accountStatus) {
        if (accountStatus.equalsIgnoreCase("connected-account")) {
            List<String> buttonList = new ArrayList<String>();
            buttonList.add(buttons.get(0).getText());
            buttonList.add(buttons.get(1).getText());
            assertTrue(buttonList.contains("Home"));
            assertTrue(buttonList.contains("Help"));
        } else if (accountStatus.equalsIgnoreCase("no-account")) {
            String buttonTextNoAccounts = buttons.get(0).getText();
            assertTrue(buttonTextNoAccounts.equalsIgnoreCase("Add your accounts"));
        } else {
            System.out.println("No buttons are expected");
        }
    }

    // verify that users input returns the correct agent response
    public void progressDiscussionVerifyAgentMessage(String expected, String agentMessage) {
        try {
            assertTrue("Text not matching : " + agentMessage, expected.trim().equalsIgnoreCase(agentMessage.trim()));
        } catch (AssertionError e) {
            String jsonName = this.getDataSetFromTestExecution();
            String filename = jsonName.concat("_result.txt");
            try {
                FileWriter fw = new FileWriter(filename, true);
                fw.write(" \n");
                fw.write(
                        "#######################################################CHATBOT RESPONSE FAIL DETECTED######################################################################### \n");
                fw.write("String that user has entered: " + progressDiscussionCurrentUserMessage);
                fw.write(
                        "\n ----------------------------------------------------------------------------------------------------------------------------------------------------------- \n");
                fw.write("Expected Agent Response: " + expected);
                fw.write(
                        "\n ----------------------------------------------------------------------------------------------------------------------------------------------------------- \n");
                fw.write("Actual Agent Response: " + agentMessage);
                fw.write(
                        "\n ----------------------------------------------------------------------------------------------------------------------------------------------------------- \n");
                fw.close();
                failCounter = failCounter + 1;
            } catch (IOException er) {
                System.err.println("IOException: " + er.getMessage());
            }
        }
    }
    ////////////////////////////////////////////// END - Chatbot Agent Message
    ////////////////////////////////////////////// //////////////////////////////////////////////

    // when hitting this page this method should be called to check UI is as
    // expected
    public void validatePageUI() {
        // assert page elements
        assertTrue(this.driver.findElement(By.className(artiLogo)).isDisplayed());
        assertTrue(this.driver.findElement(By.id(settingsButton)).isDisplayed());
        assertTrue(this.driver.findElement(By.id(chatInputBox)).isDisplayed());
        assertTrue(this.driver.findElement(By.id(chatSendButton)).isDisplayed());

    }

}
