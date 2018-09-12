package uk.co.nationwide.nbs.test.infrastructure.page.impl;

import org.springframework.stereotype.Component;

import uk.co.nationwide.nbs.test.infrastructure.steps.ARTIChatDo;
import uk.co.nationwide.nbs.test.infrastructure.steps.AbstractStep;

import java.util.List;

@Component
public abstract class AbstractPageUtils extends AbstractStep {

    /**
     * @author thomas.graham Abstract class for pages that need to use generic
     *         actions on page
     */

    public void scrollPage(String to) {
	// TODO WHEN HAVE TIME
    }

    public void refresh() {
	// TODO WHEN HAVE TIME
    }

    public void takeScreenShot() {
	// TODO WHEN HAVE TIME
    }

    public void getFirstMessage(String element) {
	// TODO WHEN HAVE TIME
    }

    public void getLastMessage(String element) {
	// TODO WHEN HAVE TIME
    }

    public void checkTextInsideElement(String element, String expectedText) {
	// TODO Auto-generated method stub
    }

    public void testTimeStamp(String element) {
	// TODO WHEN HAVE TIME
    }

    public void testAgentRemovalOfAccountResponses() {

    }

    public void validateNLPconversation(List<String> input, List<String> response) {
	// TODO WHEN HAVE TIME
    }

    // method to check text when supplying the element
    public void checkText(String element, String expected) {

    }

    public void testAgentMessages(List<String> messages, int size) {

    }

    // chatbot method
    public void progressDiscussion(ARTIChatDo dataSet, String accountStatus,int messageNum) {

    }

    // chatbot method
    public void testAgentButtons(List<String> buttons, int size) {

    }
    
    // method to validate page UI
    public void validatePageUI() {
	// Override in helper class or implement here!!!
    }
    
    
    
    
}
