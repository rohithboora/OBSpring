package uk.co.nationwide.nbs.test.infrastructure.page.impl;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Component;

import uk.co.nationwide.nbs.test.infrastructure.page.Page;

@Component
public class TransactionsHelper extends AbstractPageUtils implements Page {

	WebDriver driver;
	private Map<String, String> propositionsUrls;
	private String lastMonth = "//*[@id=\"monthsSlick\"]/div/div/div[3]";
	private String currentMonth = "//*[@id=\"monthsSlick\"]/div/div/div[4]";
	private String twoMonthsAgo = "//*[@id=\"monthsSlick\"]/div/div/div[2]";
	private String threeMonthsAgo = "//*[@id=\"monthsSlick\"]/div/div/div[1]";
	private String eatingOut = "//*[@id=\"categoriesSlick\"]/div/div/div[1]/div/span";
	private String mortgageRent = "//*[@id=\"categoriesSlick\"]/div/div/div[2]/div/span";
	private String householdBills = "//*[@id=\"categoriesSlick\"]/div/div/div[3]/div/span";
	private String shopping = "//*[@id=\"categoriesSlick\"]/div/div/div[4]/div/span";
	private String travel = "//*[@id=\"categoriesSlick\"]/div/div/div[5]/div/span";
	private String groceries = "//*[@id=\"categoriesSlick\"]/div/div/div[6]/div/span";
	private String creditLoans = "//*[@id=\"categoriesSlick\"]/div/div/div[7]/div/span";
	private String income = "//*[@id=\"categoriesSlick\"]/div/div/div[8]/div/span";
	private String other = "//*[@id=\"categoriesSlick\"]/div/div/div[9]/div/span";
	//private String mortgageRent = "//*[@id=\"categoriesSlick\"]/div/div/div[2]/div/span";

	@Override
	public void go(String proposition) {
		this.driver.get(String.format("%s/transactions", this.propositionsUrls.get(proposition)));

	}

	@Override
	public void checkElementPresence(String element) {

		switch (element.toLowerCase()) {
		case "last month":
			Assert.assertTrue(this.driver.findElement(By.xpath(lastMonth)).isDisplayed());
			break;

		case "current month":
			Assert.assertTrue(this.driver.findElement(By.xpath(currentMonth)).isDisplayed());
			break;

		case "two months ago":
			Assert.assertTrue(this.driver.findElement(By.xpath(twoMonthsAgo)).isDisplayed());
			break;

		case "three months ago":
			Assert.assertTrue(this.driver.findElement(By.xpath(threeMonthsAgo)).isDisplayed());
			break;

		case "eating out":
			Assert.assertTrue(this.driver.findElement(By.xpath(eatingOut)).isDisplayed());
			break;

		case "mortgage/rent":
			Assert.assertTrue(this.driver.findElement(By.xpath(mortgageRent)).isDisplayed());
			break;

		case "household bills":
			Assert.assertTrue(this.driver.findElement(By.xpath(householdBills)).isDisplayed());
			break;

		case "shopping":
			Assert.assertTrue(this.driver.findElement(By.xpath(shopping)).isDisplayed());
			break;

		case "travel":
			Assert.assertTrue(this.driver.findElement(By.xpath(travel)).isDisplayed());
			break;

		case "groceries":
			Assert.assertTrue(this.driver.findElement(By.xpath(groceries)).isDisplayed());
			break;

		case "credit loans":
			Assert.assertTrue(this.driver.findElement(By.xpath(creditLoans)).isDisplayed());
			break;

		case "income":
			Assert.assertTrue(this.driver.findElement(By.xpath(income)).isDisplayed());
			break;

		case "other":
			Assert.assertTrue(this.driver.findElement(By.xpath(other)).isDisplayed());
			break;

		default:
			System.out.println("element not displayed");
			Assert.fail();
			break;
		}
	}

	@Override
	public void click(String element) {
		// TODO Auto-generated method stub

		switch (element.toLowerCase()) {
			case "currentmonth":
				this.driver.findElement(By.xpath(currentMonth)).click();
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				break;
		case "eatingout":
				this.driver.findElement(By.xpath(eatingOut)).click();
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				break;

		case "mortgagerent":
				this.driver.findElement(By.xpath(mortgageRent)).click();
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				break;
		case "household":
				this.driver.findElement(By.xpath(householdBills)).click();
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				break;
		case "shopping":
				this.driver.findElement(By.xpath(shopping)).click();
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				break;
		case "travel":
				this.driver.findElement(By.xpath(travel)).click();
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				break;
		case "groceries":
				this.driver.findElement(By.xpath(groceries)).click();
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				break;
		case "creditloans":
				this.driver.findElement(By.xpath(creditLoans)).click();
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				break;
		case "income":
				this.driver.findElement(By.xpath(income)).click();
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				break;
		case "others":
				this.driver.findElement(By.xpath(other)).click();
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				break;
			default:
				System.out.println("element not displayed");
				Assert.fail();
				break;
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
	public void checkPageElements(List<String> list) {
		// TODO Auto-generated method stub

	}

	@Override
	public void checkText(String element) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setPropositionsUrls(Map<String, String> propositionsUrls) {
		// TODO Auto-generated method stub

	}

	@Override
	public void checkElementColour(String element, String colour) {
		// TODO Auto-generated method stub

	}

	@Override

	public void setDriver(WebDriver driver) {

		this.driver = driver;

	}

	@Override

	public String name() {

		return "transactions";

	}
}