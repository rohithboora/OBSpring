/**
 *
 */
package uk.co.nationwide.nbs.test.infrastructure.utils;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author simoniptatkuen added wait for element rti
 */
public abstract class TestHelper {

	public static void sleepIfrequested(long timeout, boolean requested) {
		if (requested) {
			try {
				TimeUnit.SECONDS.sleep(timeout);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void waitforelement(WebDriver driver, String element, String path, int time) {
		WebDriverWait wait = new WebDriverWait(driver, time);

		switch (path.toLowerCase()) {
		case "name":
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(element)));
			break;
		case "id":
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(element)));
			break;
		case "classname":
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(element)));
			break;
		default:
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element)));
			break;

		}

	}

	// method to take a screenshot
	public static void takeScreenShot(WebDriver driver) {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File("screenshot.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// method for testing the current URL
	public static void testCurrentURL(String section, WebDriver driver) throws InterruptedException {
		switch (section.toLowerCase()) {
		case "welcome":
			String expectedWelcomeURL = "h";
			String actualWelcomeURL = driver.getCurrentUrl();
			System.out.println("expected url = " + expectedWelcomeURL + " actual url = " + actualWelcomeURL);
			assertTrue(actualWelcomeURL.contains(expectedWelcomeURL));
			break;
		case "login":
			Thread.sleep(4000);
			String expectedLoginURL = "login";
			String actualLoginURL = driver.getCurrentUrl();
			System.out.println("expected url = " + expectedLoginURL + " actual url = " + actualLoginURL);
			assertTrue(actualLoginURL.contains(expectedLoginURL));
			break;
		case "register":
			Thread.sleep(2000);
			String expectedRegisterURL = "register";
			String actualRegisterURL = driver.getCurrentUrl();
			System.out.println("expected url = " + expectedRegisterURL + " actual url = " + actualRegisterURL);
			assertTrue(actualRegisterURL.contains(expectedRegisterURL));
			break;
		case "chatbot":
			Thread.sleep(4000);
			String expectedChatbotURL = "chat";
			String actualChatbotURL = driver.getCurrentUrl();
			System.out.println("expected url = " + expectedChatbotURL + " actual url = " + actualChatbotURL);
			assertTrue(actualChatbotURL.contains(expectedChatbotURL));
			break;
		case "select-provider":
			Thread.sleep(4000);
			String expectedConnectURL = "connect-accounts";
			String actualConnectURL = driver.getCurrentUrl();
			System.out.println("expected url = " + expectedConnectURL + " actual url = " + actualConnectURL);
			assertTrue(actualConnectURL.contains(expectedConnectURL));
			break;
		case "data-request":
			Thread.sleep(4000);
			String expectedDrPageURL = "data-request";
			String actualDrPageURL = driver.getCurrentUrl();
			System.out.println("expected url = " + expectedDrPageURL + " actual url = " + actualDrPageURL);
			assertTrue(actualDrPageURL.contains(expectedDrPageURL));
			break;
		case "account-overview":
			Thread.sleep(4000);
			String expectedAoURL = "chat";
			String actualAoURL = driver.getCurrentUrl();
			System.out.println("expected url = " + expectedAoURL + " actual url = " + actualAoURL);
			assertTrue(actualAoURL.contains(expectedAoURL));
			break;
		case "obac-nbs":
			Thread.sleep(4000);
			String expectedobacNbsPageURL = "h";
			String actualobacNbsPageURL = driver.getCurrentUrl();
			System.out.println("expected url = " + expectedobacNbsPageURL + " actual url = " + actualobacNbsPageURL);
			assertTrue(actualobacNbsPageURL.contains(expectedobacNbsPageURL));
			break;
		case "reset-password":
			Thread.sleep(4000);
			String expectedresetPasswordPageURL = "reset-password";
			String actualresetPasswordPageURL = driver.getCurrentUrl();
			System.out.println(
					"expected url = " + expectedresetPasswordPageURL + " actual url = " + actualresetPasswordPageURL);
			assertTrue(actualresetPasswordPageURL.contains(expectedresetPasswordPageURL));
			break;
		case "register-complete":
			Thread.sleep(4000);
			String expectedregisterCompPageURL = "tandc-accept";
			String actualregisterCompPageURL = driver.getCurrentUrl();
			System.out.println(
					"expected url = " + expectedregisterCompPageURL + " actual url = " + actualregisterCompPageURL);
			assertTrue(actualregisterCompPageURL.contains(expectedregisterCompPageURL));
			break;
		case "fpn":
			Thread.sleep(4000);
			String expectedFPNPageURL = "fpn";
			String actualFPNPageURL = driver.getCurrentUrl();
			System.out.println("expected url = " + expectedFPNPageURL + " actual url = " + actualFPNPageURL);
			assertTrue(actualFPNPageURL.contains(expectedFPNPageURL));
			break;
		case "settings":
			Thread.sleep(4000);
			String expectedsettingsPageURL = "settings";
			String actualsettingsPageURL = driver.getCurrentUrl();
			System.out.println("expected url = " + expectedsettingsPageURL + " actual url = " + actualsettingsPageURL);
			assertTrue(actualsettingsPageURL.contains(expectedsettingsPageURL));
			break;
		case "profile":
			Thread.sleep(4000);
			String expectedprofilePageURL = "profile";
			String actualprofilePageURL = driver.getCurrentUrl();
			System.out.println("expected url = " + expectedprofilePageURL + " actual url = " + actualprofilePageURL);
			assertTrue(actualprofilePageURL.contains(expectedprofilePageURL));
			break;
		case "importantInfo":
			Thread.sleep(4000);
			String expectedimportantInfoPageURL = "legal";
			String actualimportantInfoPageURL = driver.getCurrentUrl();
			System.out.println("expected url = " + expectedimportantInfoPageURL + " actual url = " + actualimportantInfoPageURL);
			assertTrue(actualimportantInfoPageURL.contains(expectedimportantInfoPageURL));
			break;
		case "terms":
			Thread.sleep(4000);
			String expectedtermsPageURL = "terms";
			String actualtermsPageURL = driver.getCurrentUrl();
			System.out.println("expected url = " + expectedtermsPageURL + " actual url = " + actualtermsPageURL);
			assertTrue(actualtermsPageURL.contains(expectedtermsPageURL));
			break;
		case "delete":
			Thread.sleep(4000);
			String expecteddeletePageURL = "delete";
			String actualdeletePageURL = driver.getCurrentUrl();
			System.out.println("expected url = " + expecteddeletePageURL + " actual url = " + actualdeletePageURL);
			assertTrue(actualdeletePageURL.contains(expecteddeletePageURL));
			break;
		case "editprofile":
			Thread.sleep(4000);
			String expectededitPageURL = "profile";
			String actualeditPageURL = driver.getCurrentUrl();
			System.out.println("expected url = " + expectededitPageURL + " actual url = " + actualeditPageURL);
			assertTrue(actualeditPageURL.contains(expectededitPageURL));
			break;
		case "transactions":
			Thread.sleep(4000);
			String expectedTraURL = "chat";
			String actualTraURL = driver.getCurrentUrl();
			System.out.println("expected url = " + expectedTraURL + " actual url = " + actualTraURL);
			assertTrue(actualTraURL.contains(expectedTraURL));
			break;
		case "consent":
			Thread.sleep(8000);
			String expectedconsentPageURL = "consent";
			String actualconsentPageURL = driver.getCurrentUrl();
			System.out.println("expected url = " + expectedconsentPageURL + " actual url = " + actualconsentPageURL);
			System.out.println(expectedconsentPageURL);
			System.out.println(actualconsentPageURL);
			assertTrue(actualconsentPageURL.contains(expectedconsentPageURL));
			break;
		case "view-consented-data":
			Thread.sleep(4000);
			String expectedvconsentPageURL = "view-consented-data";
			String actualvconsentPageURL = driver.getCurrentUrl();
			System.out.println("expected url = " + expectedvconsentPageURL + " actual url = " + actualvconsentPageURL);
			System.out.println(expectedvconsentPageURL);
			System.out.println(actualvconsentPageURL);
			assertTrue(actualvconsentPageURL.contains(expectedvconsentPageURL));
			break;

		default:
			System.out.println("Cant find URL on this list for  " + section);
		}
	}

	// methos for returing a colour based on browser
	public static String getColour(WebDriver driver, String colour) {

		String browserColour = "";
		String browser = "";

		if (driver instanceof FirefoxDriver) {
			browser = "firefox";
		} else if (driver instanceof ChromeDriver) {
			browser = "chrome";
		} else if (driver instanceof SafariDriver) {
			browser = "safari";
		}

		switch (browser.toLowerCase()) {
		case "chrome":
			if (colour.equalsIgnoreCase("red")) {

			} else if (colour.equalsIgnoreCase("blue")) {
				browserColour = "rgba(16, 112, 212, 1)";

			} else {
				System.out.println("this colour has not been implemented, please implement logic for colour " + colour);
			}
			break;
		case "firefox":
			if (colour.equalsIgnoreCase("red")) {
				browserColour = "rgba(208, 79, 54, 1)";
			} else if (colour.equalsIgnoreCase("blue")) {
				browserColour = "rgba(16, 112, 212, 1)";
			} else if (colour.equalsIgnoreCase("grey")) {
				browserColour = "rgba(207, 209, 210, 1)";
			} else {
				System.out.println("this colour has not been implemented, please implement logic for colour " + colour);
			}
			break;
		case "safari":
			if (colour.equalsIgnoreCase("red")) {

			} else if (colour.equalsIgnoreCase("blue")) {

			} else {
				System.out.println("this colour has not been implemented, please implement logic for colour " + colour);
			}
			break;
		default:
			System.out.println("Cant find browser on this list for  " + browser);
		}

		return browserColour;
	}

	public static void getURL(WebDriver driver, String url) {
		driver.navigate().to(url);
	}

	public static String getTodaysDate() {

		Date curDate = new Date();
		System.out.println(curDate);
		String[] newDate = curDate.toString().split("\\s+");
		String formattedDateNew = newDate[0] + " " + newDate[1] + " " + newDate[2];

		return formattedDateNew;

	}

}
