package uk.co.nationwide.nbs.test.infrastructure.page.impl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthenticationHelper {


    private By localLoginButton = By.linkText("Local Login");
    private By emailInputField = By.name("email");
    private By passwordInputField = By.name("password");
    private By loginButton = By.xpath("/html/body/div/div/form/button");

    public void clickOnLocalLoginButton(WebDriver driver) {
        driver.findElement(localLoginButton).click();
    }

    public void enterEmailAddress(WebDriver driver, String mailAddress) {
        driver.findElement(emailInputField).sendKeys(mailAddress);
    }

    public void enterPassword(WebDriver driver, String password) {
        driver.findElement(passwordInputField).sendKeys(password);
    }

    public void loginOnAuthPage(WebDriver driver) {
        driver.findElement(loginButton).click();
    }
}