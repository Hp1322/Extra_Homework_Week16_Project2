package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.sql.Timestamp;

public class SignInPage extends Utility {
    private static final Logger log = LogManager.getLogger(SignInPage.class.getName());

    public SignInPage() {
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='email']")
    WebElement emailField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='passwd']")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/p[2]/button[1]/span[1]")
    WebElement signInButton;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]/span[1]")
    WebElement createAnAccountButton;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Authentication')]")
    WebElement authenticationText;

    @CacheLookup
    @FindBy(xpath = "//form[@id='create-account_form']")
    WebElement createAnAccountText;

    @CacheLookup
    @FindBy(xpath = "//input[@id='email_create']")
    WebElement emailField1;

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-danger']//li")
    WebElement errorMessage;


    public void enterEmailField(String mail) {
        sendTextToElement(emailField, mail);
        log.info("Enter email "+mail+ " to email field "+emailField.toString());
    }

    public void enterPasswordField(String pass) {
        sendTextToElement(passwordField, pass);
        log.info("Enter password "+pass+ " to password field "+passwordField.toString());
    }

    public void clickOnSignInButton() {
        clickOnElement(signInButton);
        log.info("Clicking on signInButton "+ signInButton.toString());
    }

    public void clickOnCreateAnAccountButton() {
        clickOnElement(createAnAccountButton);
        log.info("Clicking on createAnAccountButton "+ createAnAccountButton.toString());
    }

    public String getAuthenticationText() {
        log.info("getting authentication text "+authenticationText.toString());
        return getTextFromElement(authenticationText);
    }

    public String getCreateAnAccountText() {
        log.info("getting createAnAccount text "+createAnAccountText.toString());
        return getTextFromElement(createAnAccountText);
    }

    public void enterEmailField1(String createMail) {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String emailAddress = createMail+timestamp.getTime()/10000+"@domain.com";
        sendTextToElement(emailField1, emailAddress);
        log.info("Enter email "+createMail+ " to email field "+emailField1.toString());
    }

    public void signToApplication(String username, String password) {
        enterEmailField(username);
        enterPasswordField(password);
        clickOnSignInButton();
        log.info("Enter username and password "+username+" "+password+" to username and password field "+signInButton.toString());
    }

    public String getErrorMessage() {
        log.info("getting errorMessage text "+errorMessage.toString());
        return getTextFromElement(errorMessage);
    }
}
