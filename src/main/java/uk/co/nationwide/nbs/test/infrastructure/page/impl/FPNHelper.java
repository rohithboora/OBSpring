package uk.co.nationwide.nbs.test.infrastructure.page.impl;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Component;

import uk.co.nationwide.nbs.test.infrastructure.page.Page;

@Component
public class FPNHelper extends AbstractPageUtils implements Page {

	private WebDriver driver;
	private Map<String, String> propositionsUrls;

	//private String Backbtn = "//*[@id=\"back-to-confirm-btn\"]";
	private String Backbtn = "//*[@id=\"back-to-welcome-btn\"]";
	private String Title = "//*[@id=\"header\"]/h4";

	private String Body1 = "//*[@id=\"page-layout no-overflow\"]/div/div/p[1]";
	private String Body2 = "//*[@id=\"page-layout no-overflow\"]/div/div/p[2]";
	private String Body3 = "//*[@id=\"page-layout no-overflow\"]/div/div/p[3]";
	private String Body4 = "//*[@id=\"page-layout no-overflow\"]/div/div/p[4]";
	private String Body5 = "//*[@id=\"page-layout no-overflow\"]/div/div/p[5]";
	private String CookiePolicy = "//*[@id=\"page-layout no-overflow\"]/div/div/p[5]/a";

	private String Continue = "//*[@id=\"page-layout no-overflow\"]/div/div/div/a";

	@Override
	public void go(String proposition) {
		this.driver.get(String.format("%s/FPN", this.propositionsUrls.get(proposition)));
	}

	@Override
	public String name() {
		return "FPN";
	}

	@Override
	public void setDriver(WebDriver driver) {
		this.driver = driver;

	}

	@Override
	public void click(String element) {
		switch (element.toLowerCase()) {
		case "back":
			this.driver.findElement(By.xpath(Backbtn)).click();
			break;
		case "cookie policy":
			this.driver.findElement(By.xpath(CookiePolicy)).click();
			break;
		case "continue":
			this.driver.findElement(By.xpath(Continue)).click();
			break;
		default:
			System.out.println("Cant find element " + element);
		}

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
		case "title":
			String message1 = this.driver.findElement(By.xpath(Title)).getText();
			System.out.println(message1);
			Assert.assertTrue(message1.equals(expectedMessage));
			break;
		case "body1":
			String message6 = this.driver.findElement(By.xpath(Body1)).getText();
			System.out.println(message6);
			Assert.assertTrue(message6.contains(expectedMessage));
			break;
		case "body2":
			String message2 = this.driver.findElement(By.xpath(Body2)).getText();
			System.out.println(message2);
			Assert.assertTrue(message2.equals(expectedMessage));
			break;
		case "body3":
			String message3 = this.driver.findElement(By.xpath(Body3)).getText();
			System.out.println(message3);
			Assert.assertTrue(message3.equals(expectedMessage));
			break;
		case "body4":
			String message4 = this.driver.findElement(By.xpath(Body4)).getText();
			System.out.println(message4);
			Assert.assertTrue(message4.equals(expectedMessage));
			break;
		case "body5":
			String message5 = this.driver.findElement(By.xpath(Body5)).getText();
			System.out.println(message5);
			Assert.assertTrue(message5.contains(expectedMessage));
			break;

		default:
			Assert.fail();
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
	public void setPropositionsUrls(Map<String, String> propositionsUrls) {
		// TODO Auto-generated method stub

	}

	@Override
	public void checkPageElements(List<String> list) {
		// TODO Auto-generated method stub

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
}