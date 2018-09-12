package uk.co.nationwide.nbs.test.infrastructure.page;

import org.openqa.selenium.WebDriver;
import uk.co.nationwide.nbs.test.infrastructure.steps.ARTIChatDo;

import java.util.List;
import java.util.Map;

public interface Page {

	/**
	 * will be changed to adopt abstract classes in the future when time to
	 * refactor!!!
	 */

	void go(String proposition);

	void click(String element);

	void enterText(String text, String element);

	void clearText(String type, String accessName);

	String name();

	void setDriver(WebDriver driver);

	void setPropositionsUrls(Map<String, String> propositionsUrls);

	void refresh();

	void scrollPage(String to);

	void checkPageElements(List<String> list);

	void checkElementPresence(String type);

	void checkText(String element);

	void getFirstMessage(String element);

	void getLastMessage(String element);

	void checkElementColour(String element, String colour);

	void testAgentRemovalOfAccountResponses();

	void checkTextInsideElement(String element, String expectedText);

	void testTimeStamp(String element);

	void checkText(String type, String message);

	void validateNLPconversation(List<String> input, List<String> response);

	public void testAgentMessages(List<String> messages, int size);
	
	//chatbot method
	public void progressDiscussion(ARTIChatDo dataSet,String accountStatus,int messageNum);
	
	//chatbot method
	public void testAgentButtons(List<String> buttons, int size);
	
	//method to validate that page UI is as expected
	public void validatePageUI();
}
