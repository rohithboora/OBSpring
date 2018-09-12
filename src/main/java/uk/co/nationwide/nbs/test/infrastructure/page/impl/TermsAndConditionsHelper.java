package uk.co.nationwide.nbs.test.infrastructure.page.impl;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Component;

import uk.co.nationwide.nbs.test.infrastructure.page.Page;

@Component
public class TermsAndConditionsHelper extends AbstractPageUtils implements Page {

	private WebDriver driver;
	private Map<String, String> propositionsUrls;

	// elements
	// by xpath
	private String Title = "//*[@id=\"header\"]/h4";

	private String TitleBody1 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[1]/div/p[1]";
	private String TitleBody2 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[1]/div/p[2]";
	private String TitleBody3 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[1]/div/p[3]";
	private String TitleBody4 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[1]/div/p[4]";
	// by xpath 
	private String Header1 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/ddn-sticky-wrapper/ddn-sticky/div";
	// by xpath
	private String Header1Body1 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[1]";
	private String Header1Body2 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[2]";
	private String Header1Body3 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[3]";
	private String Header1Body4 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[4]";
	private String Header1Body5 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[5]";
	private String Header1Body6 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[6]";
	private String Header1Body7 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[7]";
	private String Header1Body8 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[8]";
	private String Header1Body9 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[9]";
	private String Header1Body10 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[10]";
	private String Header1Body11 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[11]";
	private String Header1Body12 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[12]";
	private String Header1Body13 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[13]";
	private String Header1Body14 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[14]";
	private String Header1Body15 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[15]";
	private String Header1Body16 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[16]";
	private String Header1Body17 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[17]";
	private String Header1Body18 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[18]";
	private String Header1Body19 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[19]";
	private String Header1Body20 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[20]";
	private String Header1Body21 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[21]";
	private String Header1Body22 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[22]";
	private String Header1Body23 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[23]";
	private String Header1Body24 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[24]";
	private String Header1Body25 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[25]";
	private String Header1Body26 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[26]";
	private String Header1Body27 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[27]";
	private String Header1Body28 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[28]";
	private String Header1Body29 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[29]";
	private String Header1Body30 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[30]";
	private String Header1Body31 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[31]";
	private String Header1Body32 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[32]";
	private String Header1Body33 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[33]";
	private String Header1Body34 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[34]";
	private String Header1Body35 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[35]";
	private String Header1Body36 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[36]";
	private String Header1Body37 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[37]";
	private String Header1Body38 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[38]";
	private String Header1Body39 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[39]";
	private String Header1Body40 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[40]";
	private String Header1Body41 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[41]";
	private String Header1Body42 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[42]";
	private String Header1Body43 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[43]";
	private String Header1Body44 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[44]";
	private String Header1Body45 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[45]";
	private String Header1Body46 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[46]";
	private String Header1Body47 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[47]";
	private String Header1Body48 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[48]";
	private String Header1Body49 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[49]";
	private String Header1Body50 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[50]";
	private String Header1Body51 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[51]";
	private String Header1Body52 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[52]";
	private String Header1Body53 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[53]";
	private String Header1Body54 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[54]";
	private String Header1Body55 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[55]";
	private String Header1Body56 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[56]";
	private String Header1Body57 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[57]";
	private String Header1Body58 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[58]";
	private String Header1Body59 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[59]";
	private String Header1Body60 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[60]";
	private String Header1Body61 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[61]";
	private String Header1Body62 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[62]";
	private String Header1Body63 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[63]";
	private String Header1Body64 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[64]";
	private String Header1Body65 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[65]";
	private String Header1Body66 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[66]";
	private String Header1Body67 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[67]";
	private String Header1Body68 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[68]";
	private String Header1Body69 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[69]";
	private String Header1Body70 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[70]";
	private String Header1Body71 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[71]";
	private String Header1Body72 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[72]";
	private String Header1Body73 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[73]";
	private String Header1Body74 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[74]";
	private String Header1Body75 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[75]";
	private String Header1Body76 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[76]";
	private String Header1Body77 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[77]";
	private String Header1Body78 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[78]";
	private String Header1Body79 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[79]";
	private String Header1Body80 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[80]";
	private String Header1Body81 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[81]";
	private String Header1Body82 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[82]";
	private String Header1Body83 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[83]";
	private String Header1Body84 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[84]";
	private String Header1Body85 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[85]";
	private String Header1Body86 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[86]";
	private String Header1Body87 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[87]";
	private String Header1Body88 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[88]";
	private String Header1Body89 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[89]";
	private String Header1Body90 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[90]";
	private String Header1Body91 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[91]";
	private String Header1Body92 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[92]";
	private String Header1Body93 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[93]";
	private String Header1Body94 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[94]";
	private String Header1Body95 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[95]";
	private String Header1Body96 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[96]";
	private String Header1Body97 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[97]";
	private String Header1Body98 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[98]";
	private String Header1Body99 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[99]";
	private String Header1Body100 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[100]";
	private String Header1Body101 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[101]";
	private String Header1Body102 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[102]";
	private String Header1Body103 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[103]";
	private String Header1Body104 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[104]";
	private String Header1Body105 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[105]";
	private String Header1Body106 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[106]";
	private String Header1Body107 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[107]";
	private String Header1Body108 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[108]";
	private String Header1Body109 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[109]";
	private String Header1Body110 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[110]";
	private String Header1Body111 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[111]";
	private String Header1Body112 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[112]";
	private String Header1Body113 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[113]";
	private String Header1Body114 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[114]";
	private String Header1Body115 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[115]";
	private String Header1Body116 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[116]";
	private String Header1Body117 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[117]";
	private String Header1Body118 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[118]";
	private String Header1Body119 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[2]/div/p[119]";

	private String Header2 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[3]/ddn-sticky-wrapper/ddn-sticky/div";
	private String Header2Body1 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[3]/div/p[1]";
	private String Header2Body2 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[3]/div/p[2]";
	private String Header2Body3 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[3]/div/p[3]";
	private String Header2Body4 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[3]/div/p[4]";
	private String Header2Body5 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[3]/div/p[5]";
	private String Header2Body6 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[3]/div/p[6]";
	private String Header2Body7 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[3]/div/p[7]";
	private String Header2Body8 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[3]/div/p[8]";
	private String Header2Body9 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[3]/div/p[9]";
	private String Header2Body10 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[3]/div/p[10]";
	private String Header2Body11 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[3]/div/p[11]";
	private String Header2Body12 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[3]/div/p[12]";

	private String Header3 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[4]/ddn-sticky-wrapper/ddn-sticky/div";
	private String Header3Body1 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[4]/div/p[1]";
	private String Header3Body2 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[4]/div/p[2]";
	private String Header3Body3 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[4]/div/p[3]";
	private String Header3Body4 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[4]/div/p[4]";
	private String Header3Body5 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[4]/div/p[5]";
	private String Header3Body6 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[4]/div/p[6]";
	private String Header3Body7 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[4]/div/p[7]";
	private String Header3Body8 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[4]/div/p[8]";
	private String Header3Body9 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[4]/div/p[9]";
	private String Header3Body10 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[4]/div/p[10]";
	private String Header3Body11 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[4]/div/p[11]";
	private String Header3Body12 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[4]/div/p[12]";
	private String Header3Body13 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[4]/div/p[13]";
	private String Header3Body14 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[4]/div/p[14]";
	private String Header3Body15 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[4]/div/p[15]";
	private String Header3Body16 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[4]/div/p[16]";
	private String Header3Body17 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[4]/div/p[17]";
	private String Header3Body18 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[4]/div/p[18]";
	private String Header3Body19 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[4]/div/p[19]";
	private String Header3Body20 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[4]/div/p[20]";
	private String Header3Body21 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[4]/div/p[21]";
	private String Header3Body22 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[4]/div/p[22]";
	private String Header3Body23 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[4]/div/p[23]";
	private String Header3Body24 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[4]/div/p[24]";
	private String Header3Body25 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[4]/div/p[25]";
	private String Header3Body26 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[4]/div/p[26]";
	private String Header3Body27 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[4]/div/p[27]";
	private String Header3Body28 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[4]/div/p[28]";
	private String Header3Body29 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[4]/div/p[29]";
	private String Header3Body30 = "//*[@id=\"page-layout no-overflow\"]/div/div/div[4]/div/p[30]";

	private String AcceptTandCBtn = "checkmark";
	// by classname
	private String NoThanksTandCBtn = "dismiss-btn";
	// by id
	private String backButton = "back-to-confirm-btn";
	
	private String fpnLink = "//*[@id='page-layout no-overflow']/div/div/div[1]/div/p[2]/a";

	@Override
	public void go(String proposition) {
		this.driver.get(String.format("%s/tandc", this.propositionsUrls.get(proposition)));

	}

	@Override
	public void click(String element) {
		switch (element.toLowerCase()) {
		case "back":
			this.driver.findElement(By.id(backButton)).click();
			break;
		case "no thanks":
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.driver.findElement(By.className(NoThanksTandCBtn)).click();
			break;
		case "accept":
			this.driver.findElement(By.className(AcceptTandCBtn)).click();
			break;
		case "fpnlink":
			this.driver.findElement(By.xpath(fpnLink)).click();
			break;
		default:
			System.out.println("Cant find element " + element);
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
	public String name() {
		return "tandc";
	}

	@Override
	public void setDriver(WebDriver driver) {
		this.driver = driver;

	}

	@Override
	public void setPropositionsUrls(Map<String, String> propositionsUrls) {
		// TODO Auto-generated method stub

	}

	@Override
	public void refresh() {
		// TODO Auto-generated method stub

	}

	@Override
	public void scrollPage(String to) {
		// TODO Auto-generated method stub

	}

	@Override
	public void checkPageElements(List<String> list) {
		System.out.println("I am in the t$c page and will be checking the page elements");

		List<String> elements = list;
		int size = elements.size();

		for (int i = 0; i < size; i++) {

			String element = elements.get(i).toString();

			switch (element.toLowerCase()) {
			case "back":
				Assert.assertTrue(this.driver.findElement(By.id(backButton)).isDisplayed());
				break;
			case "no thanks":
				Assert.assertTrue(this.driver.findElement(By.className(NoThanksTandCBtn)).isDisplayed());
				break;
			case "accept":
				Assert.assertTrue(this.driver.findElement(By.className(AcceptTandCBtn)).isDisplayed());
				break;
			default:
				System.out.println("Element not in list?");
				break;
			}
		}

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
	public void getFirstMessage(String element) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getLastMessage(String element) {
		// TODO Auto-generated method stub

	}

	@Override
	public void checkElementColour(String element, String colour) {
		// TODO Auto-generated method stub

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
			String message = this.driver.findElement(By.xpath(Title)).getText();
			System.out.println(message);
			Assert.assertTrue(message.equals(expectedMessage));

			break;

		case "titlebody1":
			String message2 = this.driver.findElement(By.xpath(TitleBody1)).getText();
			System.out.println(message2);
			Assert.assertTrue(message2.equals(expectedMessage));
			break;

		case "titlebody2":
			String message3 = this.driver.findElement(By.xpath(TitleBody2)).getText();
			System.out.println(message3);
			Assert.assertTrue(message3.equals(expectedMessage));

			break;

		case "titlebody3":
			String message4 = this.driver.findElement(By.xpath(TitleBody3)).getText();
			System.out.println(message4);
			Assert.assertTrue(message4.equals(expectedMessage));
			break;

		case "titlebody4":
			String message5 = this.driver.findElement(By.xpath(TitleBody4)).getText();
			System.out.println(message5);
			Assert.assertTrue(message5.equals(expectedMessage));
			break;

		case "header1":
			String message6 = this.driver.findElement(By.xpath(Header1)).getText();
			System.out.println(message6);
			Assert.assertTrue(message6.equals(expectedMessage));
			break;

		case "header1body1":
			String message7 = this.driver.findElement(By.xpath(Header1Body1)).getText();
			System.out.println(message7);
			Assert.assertTrue(message7.equals(expectedMessage));
			break;

		case "header1body2":
			String message8 = this.driver.findElement(By.xpath(Header1Body2)).getText();
			System.out.println(message8);
			Assert.assertTrue(message8.equals(expectedMessage));
			break;

		case "header1body3":
			String message9 = this.driver.findElement(By.xpath(Header1Body3)).getText();
			System.out.println(message9);
			Assert.assertTrue(message9.equals(expectedMessage));
			break;

		case "header1body4":
			String message10 = this.driver.findElement(By.xpath(Header1Body4)).getText();
			System.out.println(message10);
			Assert.assertTrue(message10.equals(expectedMessage));
			break;

		case "header1body5":
			String message11 = this.driver.findElement(By.xpath(Header1Body5)).getText();
			System.out.println(message11);
			Assert.assertTrue(message11.equals(expectedMessage));
			break;

		case "header1body6":
			String message12 = this.driver.findElement(By.xpath(Header1Body6)).getText();
			System.out.println(message12);
			Assert.assertTrue(message12.equals(expectedMessage));
			break;

		case "header1body7":
			String message13 = this.driver.findElement(By.xpath(Header1Body7)).getText();
			System.out.println(message13);
			Assert.assertTrue(message13.equals(expectedMessage));
			break;

		case "header1body8":
			String message14 = this.driver.findElement(By.xpath(Header1Body8)).getText();
			System.out.println(message14);
			Assert.assertTrue(message14.equals(expectedMessage));
			break;

		case "header1body9":
			String message15 = this.driver.findElement(By.xpath(Header1Body9)).getText();
			System.out.println(message15);
			Assert.assertTrue(message15.equals(expectedMessage));
			break;

		case "header1body10":
			String message16 = this.driver.findElement(By.xpath(Header1Body10)).getText();
			System.out.println(message16);
			Assert.assertTrue(message16.equals(expectedMessage));
			break;

		case "header1body11":
			String message17 = this.driver.findElement(By.xpath(Header1Body11)).getText();
			System.out.println(message17);
			Assert.assertTrue(message17.equals(expectedMessage));
			break;

		case "header1body12":
			String message18 = this.driver.findElement(By.xpath(Header1Body12)).getText();
			System.out.println(message18);
			Assert.assertTrue(message18.equals(expectedMessage));
			break;

		case "header1body13":
			String message19 = this.driver.findElement(By.xpath(Header1Body13)).getText();
			System.out.println(message19);
			Assert.assertTrue(message19.equals(expectedMessage));
			break;

		case "header1body14":
			String message20 = this.driver.findElement(By.xpath(Header1Body14)).getText();
			System.out.println(message20);
			Assert.assertTrue(message20.equals(expectedMessage));
			break;

		case "header1body15":
			String message21 = this.driver.findElement(By.xpath(Header1Body15)).getText();
			System.out.println(message21);
			Assert.assertTrue(message21.equals(expectedMessage));
			break;

		case "header1body16":
			String message22 = this.driver.findElement(By.xpath(Header1Body16)).getText();
			System.out.println(message22);
			Assert.assertTrue(message22.equals(expectedMessage));
			break;

		case "header1body17":
			String message23 = this.driver.findElement(By.xpath(Header1Body17)).getText();
			System.out.println(message23);
			Assert.assertTrue(message23.equals(expectedMessage));
			break;

		case "header1body18":
			String message24 = this.driver.findElement(By.xpath(Header1Body18)).getText();
			System.out.println(message24);
			Assert.assertTrue(message24.equals(expectedMessage));
			break;

		case "header1body19":
			String message25 = this.driver.findElement(By.xpath(Header1Body19)).getText();
			System.out.println(message25);
			Assert.assertTrue(message25.equals(expectedMessage));
			break;

		case "header1body20":
			String message26 = this.driver.findElement(By.xpath(Header1Body20)).getText();
			System.out.println(message26);
			Assert.assertTrue(message26.equals(expectedMessage));
			break;

		case "header1body21":
			String message27 = this.driver.findElement(By.xpath(Header1Body21)).getText();
			System.out.println(message27);
			Assert.assertTrue(message27.equals(expectedMessage));
			break;

		case "header1body22":
			String message28 = this.driver.findElement(By.xpath(Header1Body22)).getText();
			System.out.println(message28);
			Assert.assertTrue(message28.equals(expectedMessage));
			break;

		case "header1body23":
			String message29 = this.driver.findElement(By.xpath(Header1Body23)).getText();
			System.out.println(message29);
			Assert.assertTrue(message29.equals(expectedMessage));
			break;

		case "header1body24":
			String message30 = this.driver.findElement(By.xpath(Header1Body24)).getText();
			System.out.println(message30);
			Assert.assertTrue(message30.equals(expectedMessage));
			break;

		case "header1body25":
			String message31 = this.driver.findElement(By.xpath(Header1Body25)).getText();
			System.out.println(message31);
			Assert.assertTrue(message31.equals(expectedMessage));
			break;

		case "header1body26":
			String message32 = this.driver.findElement(By.xpath(Header1Body26)).getText();
			System.out.println(message32);
			Assert.assertTrue(message32.equals(expectedMessage));
			break;

		case "header1body27":
			String message33 = this.driver.findElement(By.xpath(Header1Body27)).getText();
			System.out.println(message33);
			Assert.assertTrue(message33.equals(expectedMessage));
			break;

		case "header1body28":
			String message34 = this.driver.findElement(By.xpath(Header1Body28)).getText();
			System.out.println(message34);
			Assert.assertTrue(message34.equals(expectedMessage));
			break;

		case "header1body29":
			String message35 = this.driver.findElement(By.xpath(Header1Body29)).getText();
			System.out.println(message35);
			Assert.assertTrue(message35.equals(expectedMessage));
			break;

		case "header1body30":
			String message36 = this.driver.findElement(By.xpath(Header1Body30)).getText();
			System.out.println(message36);
			Assert.assertTrue(message36.equals(expectedMessage));
			break;

		case "header1body31":
			String message37 = this.driver.findElement(By.xpath(Header1Body31)).getText();
			System.out.println(message37);
			Assert.assertTrue(message37.equals(expectedMessage));
			break;

		case "header1body32":
			String message38 = this.driver.findElement(By.xpath(Header1Body32)).getText();
			System.out.println(message38);
			Assert.assertTrue(message38.equals(expectedMessage));
			break;

		case "header1body33":
			String message39 = this.driver.findElement(By.xpath(Header1Body33)).getText();
			System.out.println(message39);
			Assert.assertTrue(message39.equals(expectedMessage));
			break;

		case "header1body34":
			String message40 = this.driver.findElement(By.xpath(Header1Body34)).getText();
			System.out.println(message40);
			Assert.assertTrue(message40.equals(expectedMessage));
			break;

		case "header1body35":
			String message41 = this.driver.findElement(By.xpath(Header1Body35)).getText();
			System.out.println(message41);
			Assert.assertTrue(message41.equals(expectedMessage));
			break;

		case "header1body36":
			String message42 = this.driver.findElement(By.xpath(Header1Body36)).getText();
			System.out.println(message42);
			Assert.assertTrue(message42.equals(expectedMessage));
			break;

		case "header1body37":
			String message43 = this.driver.findElement(By.xpath(Header1Body37)).getText();
			System.out.println(message43);
			Assert.assertTrue(message43.equals(expectedMessage));
			break;

		case "header1body38":
			String message44 = this.driver.findElement(By.xpath(Header1Body38)).getText();
			System.out.println(message44);
			Assert.assertTrue(message44.equals(expectedMessage));
			break;

		case "header1body39":
			String message45 = this.driver.findElement(By.xpath(Header1Body39)).getText();
			System.out.println(message45);
			Assert.assertTrue(message45.equals(expectedMessage));
			break;

		case "header1body40":
			String message46 = this.driver.findElement(By.xpath(Header1Body40)).getText();
			System.out.println(message46);
			Assert.assertTrue(message46.equals(expectedMessage));
			break;

		case "header1body41":
			String message47 = this.driver.findElement(By.xpath(Header1Body41)).getText();
			System.out.println(message47);
			Assert.assertTrue(message47.equals(expectedMessage));
			break;

		case "header1body42":
			String message48 = this.driver.findElement(By.xpath(Header1Body42)).getText();
			System.out.println(message48);
			Assert.assertTrue(message48.equals(expectedMessage));
			break;

		case "header1body43":
			String message49 = this.driver.findElement(By.xpath(Header1Body43)).getText();
			System.out.println(message49);
			Assert.assertTrue(message49.equals(expectedMessage));
			break;

		case "header1body44":
			String message50 = this.driver.findElement(By.xpath(Header1Body44)).getText();
			System.out.println(message50);
			Assert.assertTrue(message50.equals(expectedMessage));
			break;

		case "header1body45":
			String message51 = this.driver.findElement(By.xpath(Header1Body45)).getText();
			System.out.println(message51);
			Assert.assertTrue(message51.equals(expectedMessage));
			break;

		case "header1body46":
			String message52 = this.driver.findElement(By.xpath(Header1Body46)).getText();
			System.out.println(message52);
			Assert.assertTrue(message52.equals(expectedMessage));
			break;

		case "header1body47":
			String message53 = this.driver.findElement(By.xpath(Header1Body47)).getText();
			System.out.println(message53);
			Assert.assertTrue(message53.equals(expectedMessage));
			break;

		case "header1body48":
			String message54 = this.driver.findElement(By.xpath(Header1Body48)).getText();
			System.out.println(message54);
			Assert.assertTrue(message54.equals(expectedMessage));
			break;

		case "header1body49":
			String message55 = this.driver.findElement(By.xpath(Header1Body49)).getText();
			System.out.println(message55);
			Assert.assertTrue(message55.equals(expectedMessage));
			break;

		case "header1body50":
			String message56 = this.driver.findElement(By.xpath(Header1Body50)).getText();
			System.out.println(message56);
			Assert.assertTrue(message56.equals(expectedMessage));
			break;

		case "header1body51":
			String message57 = this.driver.findElement(By.xpath(Header1Body51)).getText();
			System.out.println(message57);
			Assert.assertTrue(message57.equals(expectedMessage));
			break;

		case "header1body52":
			String message58 = this.driver.findElement(By.xpath(Header1Body52)).getText();
			System.out.println(message58);
			Assert.assertTrue(message58.equals(expectedMessage));
			break;

		case "header1body53":
			String message59 = this.driver.findElement(By.xpath(Header1Body53)).getText();
			System.out.println(message59);
			Assert.assertTrue(message59.equals(expectedMessage));
			break;

		case "header1body54":
			String message60 = this.driver.findElement(By.xpath(Header1Body54)).getText();
			System.out.println(message60);
			Assert.assertTrue(message60.equals(expectedMessage));
			break;

		case "header1body55":
			String message61 = this.driver.findElement(By.xpath(Header1Body55)).getText();
			System.out.println(message61);
			Assert.assertTrue(message61.equals(expectedMessage));
			break;

		case "header1body56":
			String message62 = this.driver.findElement(By.xpath(Header1Body56)).getText();
			System.out.println(message62);
			Assert.assertTrue(message62.equals(expectedMessage));
			break;

		case "header1body57":
			String message63 = this.driver.findElement(By.xpath(Header1Body57)).getText();
			System.out.println(message63);
			Assert.assertTrue(message63.equals(expectedMessage));
			break;

		case "header1body58":
			String message64 = this.driver.findElement(By.xpath(Header1Body58)).getText();
			System.out.println(message64);
			Assert.assertTrue(message64.equals(expectedMessage));
			break;

		case "header1body59":
			String message65 = this.driver.findElement(By.xpath(Header1Body59)).getText();
			System.out.println(message65);
			Assert.assertTrue(message65.equals(expectedMessage));
			break;

		case "header1body60":
			String message66 = this.driver.findElement(By.xpath(Header1Body60)).getText();
			System.out.println(message66);
			Assert.assertTrue(message66.equals(expectedMessage));
			break;

		case "header1body61":
			String message67 = this.driver.findElement(By.xpath(Header1Body61)).getText();
			System.out.println(message67);
			Assert.assertTrue(message67.equals(expectedMessage));
			break;

		case "header1body62":
			String message68 = this.driver.findElement(By.xpath(Header1Body62)).getText();
			System.out.println(message68);
			Assert.assertTrue(message68.equals(expectedMessage));
			break;

		case "header1body63":
			String message69 = this.driver.findElement(By.xpath(Header1Body63)).getText();
			System.out.println(message69);
			Assert.assertTrue(message69.equals(expectedMessage));
			break;

		case "header1body64":
			String message70 = this.driver.findElement(By.xpath(Header1Body64)).getText();
			System.out.println(message70);
			Assert.assertTrue(message70.equals(expectedMessage));
			break;

		case "header1body65":
			String message71 = this.driver.findElement(By.xpath(Header1Body65)).getText();
			System.out.println(message71);
			Assert.assertTrue(message71.equals(expectedMessage));
			break;

		case "header1body66":
			String message72 = this.driver.findElement(By.xpath(Header1Body66)).getText();
			System.out.println(message72);
			Assert.assertTrue(message72.equals(expectedMessage));
			break;

		case "header1body67":
			String message73 = this.driver.findElement(By.xpath(Header1Body67)).getText();
			System.out.println(message73);
			Assert.assertTrue(message73.equals(expectedMessage));
			break;

		case "header1body68":
			String message74 = this.driver.findElement(By.xpath(Header1Body68)).getText();
			System.out.println(message74);
			Assert.assertTrue(message74.equals(expectedMessage));
			break;

		case "header1body69":
			String message75 = this.driver.findElement(By.xpath(Header1Body69)).getText();
			System.out.println(message75);
			Assert.assertTrue(message75.equals(expectedMessage));
			break;

		case "header1body70":
			String message76 = this.driver.findElement(By.xpath(Header1Body70)).getText();
			System.out.println(message76);
			Assert.assertTrue(message76.equals(expectedMessage));
			break;

		case "header1body71":
			String message77 = this.driver.findElement(By.xpath(Header1Body71)).getText();
			System.out.println(message77);
			Assert.assertTrue(message77.equals(expectedMessage));
			break;

		case "header1body72":
			String message78 = this.driver.findElement(By.xpath(Header1Body72)).getText();
			System.out.println(message78);
			Assert.assertTrue(message78.equals(expectedMessage));
			break;

		case "header1body73":
			String message79 = this.driver.findElement(By.xpath(Header1Body73)).getText();
			System.out.println(message79);
			Assert.assertTrue(message79.equals(expectedMessage));
			break;

		case "header1body74":
			String message80 = this.driver.findElement(By.xpath(Header1Body74)).getText();
			System.out.println(message80);
			Assert.assertTrue(message80.equals(expectedMessage));
			break;

		case "header1body75":
			String message81 = this.driver.findElement(By.xpath(Header1Body75)).getText();
			System.out.println(message81);
			Assert.assertTrue(message81.equals(expectedMessage));
			break;

		case "header1body76":
			String message82 = this.driver.findElement(By.xpath(Header1Body76)).getText();
			System.out.println(message82);
			Assert.assertTrue(message82.equals(expectedMessage));
			break;

		case "header1body77":
			String message83 = this.driver.findElement(By.xpath(Header1Body77)).getText();
			System.out.println(message83);
			Assert.assertTrue(message83.equals(expectedMessage));
			break;

		case "header1body78":
			String message84 = this.driver.findElement(By.xpath(Header1Body78)).getText();
			System.out.println(message84);
			Assert.assertTrue(message84.equals(expectedMessage));
			break;

		case "header1body79":
			String message85 = this.driver.findElement(By.xpath(Header1Body79)).getText();
			System.out.println(message85);
			Assert.assertTrue(message85.equals(expectedMessage));
			break;

		case "header1body80":
			String message86 = this.driver.findElement(By.xpath(Header1Body80)).getText();
			System.out.println(message86);
			Assert.assertTrue(message86.equals(expectedMessage));
			break;

		case "header1body81":
			String message87 = this.driver.findElement(By.xpath(Header1Body81)).getText();
			System.out.println(message87);
			Assert.assertTrue(message87.equals(expectedMessage));
			break;

		case "header1body82":
			String message88 = this.driver.findElement(By.xpath(Header1Body82)).getText();
			System.out.println(message88);
			Assert.assertTrue(message88.equals(expectedMessage));
			break;

		case "header1body83":
			String message89 = this.driver.findElement(By.xpath(Header1Body83)).getText();
			System.out.println(message89);
			Assert.assertTrue(message89.equals(expectedMessage));
			break;

		case "header1body84":
			String message90 = this.driver.findElement(By.xpath(Header1Body84)).getText();
			System.out.println(message90);
			Assert.assertTrue(message90.equals(expectedMessage));
			break;

		case "header1body85":
			String message91 = this.driver.findElement(By.xpath(Header1Body85)).getText();
			System.out.println(message91);
			Assert.assertTrue(message91.equals(expectedMessage));
			break;

		case "header1body86":
			String message92 = this.driver.findElement(By.xpath(Header1Body86)).getText();
			System.out.println(message92);
			Assert.assertTrue(message92.equals(expectedMessage));
			break;

		case "header1body87":
			String message93 = this.driver.findElement(By.xpath(Header1Body87)).getText();
			System.out.println(message93);
			Assert.assertTrue(message93.equals(expectedMessage));
			break;

		case "header1body88":
			String message94 = this.driver.findElement(By.xpath(Header1Body88)).getText();
			System.out.println(message94);
			Assert.assertTrue(message94.equals(expectedMessage));
			break;

		case "header1body89":
			String message95 = this.driver.findElement(By.xpath(Header1Body89)).getText();
			System.out.println(message95);
			Assert.assertTrue(message95.equals(expectedMessage));
			break;

		case "header1body90":
			String message96 = this.driver.findElement(By.xpath(Header1Body90)).getText();
			System.out.println(message96);
			Assert.assertTrue(message96.equals(expectedMessage));
			break;

		case "header1body91":
			String message97 = this.driver.findElement(By.xpath(Header1Body91)).getText();
			System.out.println(message97);
			Assert.assertTrue(message97.equals(expectedMessage));
			break;

		case "header1body92":
			String message98 = this.driver.findElement(By.xpath(Header1Body92)).getText();
			System.out.println(message98);
			Assert.assertTrue(message98.equals(expectedMessage));
			break;

		case "header1body93":
			String message99 = this.driver.findElement(By.xpath(Header1Body93)).getText();
			System.out.println(message99);
			Assert.assertTrue(message99.equals(expectedMessage));
			break;

		case "header1body94":
			String message100 = this.driver.findElement(By.xpath(Header1Body94)).getText();
			System.out.println(message100);
			Assert.assertTrue(message100.equals(expectedMessage));
			break;

		case "header1body95":
			String message101 = this.driver.findElement(By.xpath(Header1Body95)).getText();
			System.out.println(message101);
			Assert.assertTrue(message101.equals(expectedMessage));
			break;

		case "header1body96":
			String message102 = this.driver.findElement(By.xpath(Header1Body96)).getText();
			System.out.println(message102);
			Assert.assertTrue(message102.equals(expectedMessage));
			break;

		case "header1body97":
			String message103 = this.driver.findElement(By.xpath(Header1Body97)).getText();
			System.out.println(message103);
			Assert.assertTrue(message103.equals(expectedMessage));
			break;

		case "header1body98":
			String message104 = this.driver.findElement(By.xpath(Header1Body98)).getText();
			System.out.println(message104);
			Assert.assertTrue(message104.equals(expectedMessage));
			break;

		case "header1body99":
			String message105 = this.driver.findElement(By.xpath(Header1Body99)).getText();
			System.out.println(message105);
			Assert.assertTrue(message105.equals(expectedMessage));
			break;

		case "header1body100":
			String message106 = this.driver.findElement(By.xpath(Header1Body100)).getText();
			System.out.println(message106);
			Assert.assertTrue(message106.equals(expectedMessage));
			break;

		case "header1body101":
			String message107 = this.driver.findElement(By.xpath(Header1Body101)).getText();
			System.out.println(message107);
			Assert.assertTrue(message107.equals(expectedMessage));
			break;

		case "header1body102":
			String message108 = this.driver.findElement(By.xpath(Header1Body102)).getText();
			System.out.println(message108);
			Assert.assertTrue(message108.equals(expectedMessage));
			break;

		case "header1body103":
			String message109 = this.driver.findElement(By.xpath(Header1Body103)).getText();
			System.out.println(message109);
			Assert.assertTrue(message109.equals(expectedMessage));
			break;

		case "header1body104":
			String message110 = this.driver.findElement(By.xpath(Header1Body104)).getText();
			System.out.println(message110);
			Assert.assertTrue(message110.equals(expectedMessage));
			break;

		case "header1body105":
			String message111 = this.driver.findElement(By.xpath(Header1Body105)).getText();
			System.out.println(message111);
			Assert.assertTrue(message111.equals(expectedMessage));
			break;

		case "header1body106":
			String message112 = this.driver.findElement(By.xpath(Header1Body106)).getText();
			System.out.println(message112);
			Assert.assertTrue(message112.equals(expectedMessage));
			break;

		case "header1body107":
			String message113 = this.driver.findElement(By.xpath(Header1Body107)).getText();
			System.out.println(message113);
			Assert.assertTrue(message113.equals(expectedMessage));
			break;

		case "header1body108":
			String message114 = this.driver.findElement(By.xpath(Header1Body108)).getText();
			System.out.println(message114);
			Assert.assertTrue(message114.equals(expectedMessage));
			break;

		case "header1body109":
			String message115 = this.driver.findElement(By.xpath(Header1Body109)).getText();
			System.out.println(message115);
			Assert.assertTrue(message115.equals(expectedMessage));
			break;

		case "header1body110":
			String message116 = this.driver.findElement(By.xpath(Header1Body110)).getText();
			System.out.println(message116);
			Assert.assertTrue(message116.equals(expectedMessage));
			break;

		case "header1body111":
			String message117 = this.driver.findElement(By.xpath(Header1Body111)).getText();
			System.out.println(message117);
			Assert.assertTrue(message117.equals(expectedMessage));
			break;

		case "header1body112":
			String message118 = this.driver.findElement(By.xpath(Header1Body112)).getText();
			System.out.println(message118);
			Assert.assertTrue(message118.equals(expectedMessage));
			break;

		case "header1body113":
			String message119 = this.driver.findElement(By.xpath(Header1Body113)).getText();
			System.out.println(message119);
			Assert.assertTrue(message119.equals(expectedMessage));
			break;

		case "header1body114":
			String message120 = this.driver.findElement(By.xpath(Header1Body114)).getText();
			System.out.println(message120);
			Assert.assertTrue(message120.equals(expectedMessage));
			break;

		case "header1body115":
			String message121 = this.driver.findElement(By.xpath(Header1Body115)).getText();
			System.out.println(message121);
			Assert.assertTrue(message121.equals(expectedMessage));
			break;

		case "header1body116":
			String message122 = this.driver.findElement(By.xpath(Header1Body116)).getText();
			System.out.println(message122);
			Assert.assertTrue(message122.equals(expectedMessage));
			break;

		case "header1body117":
			String message123 = this.driver.findElement(By.xpath(Header1Body117)).getText();
			System.out.println(message123);
			Assert.assertTrue(message123.equals(expectedMessage));
			break;

		case "header1body118":
			String message124 = this.driver.findElement(By.xpath(Header1Body118)).getText();
			System.out.println(message124);
			Assert.assertTrue(message124.equals(expectedMessage));
			break;

		case "header1body119":
			String message126 = this.driver.findElement(By.xpath(Header1Body119)).getText();
			System.out.println(message126);
			Assert.assertTrue(message126.equals(expectedMessage));
			break;

		case "header2":
			String message127 = this.driver.findElement(By.xpath(Header2)).getText();
			System.out.println(message127);
			Assert.assertTrue(message127.equals(expectedMessage));
			break;

		case "header2body1":
			String message128 = this.driver.findElement(By.xpath(Header2Body1)).getText();
			System.out.println(message128);
			Assert.assertTrue(message128.equals(expectedMessage));
			break;

		case "header2body2":
			String message129 = this.driver.findElement(By.xpath(Header2Body2)).getText();
			System.out.println(message129);
			Assert.assertTrue(message129.equals(expectedMessage));
			break;

		case "header2body3":
			String message130 = this.driver.findElement(By.xpath(Header2Body3)).getText();
			System.out.println(message130);
			Assert.assertTrue(message130.equals(expectedMessage));
			break;

		case "header2body4":
			String message131 = this.driver.findElement(By.xpath(Header2Body4)).getText();
			System.out.println(message131);
			Assert.assertTrue(message131.equals(expectedMessage));
			break;

		case "header2body5":
			String message132 = this.driver.findElement(By.xpath(Header2Body5)).getText();
			System.out.println(message132);
			Assert.assertTrue(message132.equals(expectedMessage));
			break;

		case "header2body6":
			String message133 = this.driver.findElement(By.xpath(Header2Body6)).getText();
			System.out.println(message133);
			Assert.assertTrue(message133.equals(expectedMessage));
			break;

		case "header2body7":
			String message134 = this.driver.findElement(By.xpath(Header2Body7)).getText();
			System.out.println(message134);
			Assert.assertTrue(message134.equals(expectedMessage));
			break;

		case "header2body8":
			String message135 = this.driver.findElement(By.xpath(Header2Body8)).getText();
			System.out.println(message135);
			Assert.assertTrue(message135.equals(expectedMessage));
			break;

		case "header2body9":
			String message136 = this.driver.findElement(By.xpath(Header2Body9)).getText();
			System.out.println(message136);
			Assert.assertTrue(message136.equals(expectedMessage));
			break;

		case "header2body10":
			String message137 = this.driver.findElement(By.xpath(Header2Body10)).getText();
			System.out.println(message137);
			Assert.assertTrue(message137.equals(expectedMessage));
			break;

		case "header2body11":
			String message138 = this.driver.findElement(By.xpath(Header2Body11)).getText();
			System.out.println(message138);
			Assert.assertTrue(message138.equals(expectedMessage));
			break;

		case "header2body12":
			String message139 = this.driver.findElement(By.xpath(Header2Body12)).getText();
			System.out.println(message139);
			Assert.assertTrue(message139.equals(expectedMessage));
			break;

		case "header3":
			String message140 = this.driver.findElement(By.xpath(Header3)).getText();
			System.out.println(message140);
			Assert.assertTrue(message140.equals(expectedMessage));
			break;

		case "header3body1":
			String message141 = this.driver.findElement(By.xpath(Header3Body1)).getText();
			System.out.println(message141);
			Assert.assertTrue(message141.equals(expectedMessage));
			break;

		case "header3body2":
			String message142 = this.driver.findElement(By.xpath(Header3Body2)).getText();
			System.out.println(message142);
			Assert.assertTrue(message142.equals(expectedMessage));
			break;

		case "header3body3":
			String message143 = this.driver.findElement(By.xpath(Header3Body3)).getText();
			System.out.println(message143);
			Assert.assertTrue(message143.equals(expectedMessage));
			break;

		case "header3body4":
			String message144 = this.driver.findElement(By.xpath(Header3Body4)).getText();
			System.out.println(message144);
			Assert.assertTrue(message144.equals(expectedMessage));
			break;

		case "header3body5":
			String message145 = this.driver.findElement(By.xpath(Header3Body5)).getText();
			System.out.println(message145);
			Assert.assertTrue(message145.equals(expectedMessage));
			break;

		case "header3body6":
			String message146 = this.driver.findElement(By.xpath(Header3Body6)).getText();
			System.out.println(message146);
			Assert.assertTrue(message146.equals(expectedMessage));
			break;

		case "header3body7":
			String message147 = this.driver.findElement(By.xpath(Header3Body7)).getText();
			System.out.println(message147);
			Assert.assertTrue(message147.equals(expectedMessage));
			break;

		case "header3body8":
			String message148 = this.driver.findElement(By.xpath(Header3Body8)).getText();
			System.out.println(message148);
			Assert.assertTrue(message148.equals(expectedMessage));
			break;

		case "header3body9":
			String message149 = this.driver.findElement(By.xpath(Header3Body9)).getText();
			System.out.println(message149);
			Assert.assertTrue(message149.equals(expectedMessage));
			break;

		case "header3body10":
			String message150 = this.driver.findElement(By.xpath(Header3Body10)).getText();
			System.out.println(message150);
			Assert.assertTrue(message150.equals(expectedMessage));
			break;

		case "header3body11":
			String message170 = this.driver.findElement(By.xpath(Header3Body11)).getText();
			System.out.println(message170);
			Assert.assertTrue(message170.equals(expectedMessage));
			break;

		case "header3body12":
			String message151 = this.driver.findElement(By.xpath(Header3Body12)).getText();
			System.out.println(message151);
			Assert.assertTrue(message151.equals(expectedMessage));
			break;

		case "header3body13":
			String message152 = this.driver.findElement(By.xpath(Header3Body13)).getText();
			System.out.println(message152);
			Assert.assertTrue(message152.equals(expectedMessage));
			break;

		case "header3body14":
			String message153 = this.driver.findElement(By.xpath(Header3Body14)).getText();
			System.out.println(message153);
			Assert.assertTrue(message153.equals(expectedMessage));
			break;

		case "header3body15":
			String message154 = this.driver.findElement(By.xpath(Header3Body15)).getText();
			System.out.println(message154);
			Assert.assertTrue(message154.equals(expectedMessage));
			break;

		case "header3body16":
			String message155 = this.driver.findElement(By.xpath(Header3Body16)).getText();
			System.out.println(message155);
			Assert.assertTrue(message155.equals(expectedMessage));
			break;

		case "header3body17":
			String message156 = this.driver.findElement(By.xpath(Header3Body17)).getText();
			System.out.println(message156);
			Assert.assertTrue(message156.equals(expectedMessage));
			break;

		case "header3body18":
			String message157 = this.driver.findElement(By.xpath(Header3Body18)).getText();
			System.out.println(message157);
			Assert.assertTrue(message157.equals(expectedMessage));
			break;

		case "header3body19":
			String message158 = this.driver.findElement(By.xpath(Header3Body19)).getText();
			System.out.println(message158);
			Assert.assertTrue(message158.equals(expectedMessage));
			break;

		case "header3body20":
			String message159 = this.driver.findElement(By.xpath(Header3Body20)).getText();
			System.out.println(message159);
			Assert.assertTrue(message159.equals(expectedMessage));
			break;

		case "header3body21":
			String message160 = this.driver.findElement(By.xpath(Header3Body21)).getText();
			System.out.println(message160);
			Assert.assertTrue(message160.equals(expectedMessage));
			break;

		case "header3body22":
			String message161 = this.driver.findElement(By.xpath(Header3Body22)).getText();
			System.out.println(message161);
			Assert.assertTrue(message161.equals(expectedMessage));
			break;

		case "header3body23":
			String message162 = this.driver.findElement(By.xpath(Header3Body23)).getText();
			System.out.println(message162);
			Assert.assertTrue(message162.equals(expectedMessage));
			break;

		case "header3body24":
			String message163 = this.driver.findElement(By.xpath(Header3Body24)).getText();
			System.out.println(message163);
			Assert.assertTrue(message163.equals(expectedMessage));
			break;

		case "header3body25":
			String message164 = this.driver.findElement(By.xpath(Header3Body25)).getText();
			System.out.println(message164);
			Assert.assertTrue(message164.equals(expectedMessage));
			break;

		case "header3body26":
			String message165 = this.driver.findElement(By.xpath(Header3Body26)).getText();
			System.out.println(message165);
			Assert.assertTrue(message165.equals(expectedMessage));
			break;

		case "header3body27":
			String message166 = this.driver.findElement(By.xpath(Header3Body27)).getText();
			System.out.println(message166);
			Assert.assertTrue(message166.equals(expectedMessage));
			break;

		case "header3body28":
			String message167 = this.driver.findElement(By.xpath(Header3Body28)).getText();
			System.out.println(message167);
			Assert.assertTrue(message167.equals(expectedMessage));
			break;

		case "header3body29":
			String message168 = this.driver.findElement(By.xpath(Header3Body29)).getText();
			System.out.println(message168);
			Assert.assertTrue(message168.equals(expectedMessage));
			break;

		case "header3body30":
			String message169 = this.driver.findElement(By.xpath(Header3Body30)).getText();
			System.out.println(message169);
			Assert.assertTrue(message169.equals(expectedMessage));
			break;

		default:
			Assert.fail();
		}

	}

}
