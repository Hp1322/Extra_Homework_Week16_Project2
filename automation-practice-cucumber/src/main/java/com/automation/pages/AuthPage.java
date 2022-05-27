package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.Timestamp;

public class AuthPage extends Utility {
    private static final Logger log = LogManager.getLogger(AuthPage.class.getName());

    public AuthPage() {
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='id_gender1']")
    WebElement titleButton;

    @CacheLookup
    @FindBy(xpath = "//input[@id='customer_firstname']")
    WebElement firstName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='customer_lastname']")
    WebElement lastName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='email']")
    WebElement emailField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='passwd']")
    WebElement passField;

    @CacheLookup
    @FindBy(xpath = "//select[@id='days']")
    WebElement daysBox;

    @CacheLookup
    @FindBy(xpath = "//select[@id='months']")
    WebElement monthBox;

    @CacheLookup
    @FindBy(xpath = "//select[@id='years']")
    WebElement yearBox;

    @CacheLookup
    @FindBy(xpath = "//input[@id='newsletter']")
    WebElement newsletterBox;

    @CacheLookup
    @FindBy(xpath = "//input[@id='optin']")
    WebElement receiveOfferBox;

    @CacheLookup
    @FindBy(xpath = "//input[@id='firstname']")
    WebElement firstNameAddress;

    @CacheLookup
    @FindBy(xpath = "//input[@id='lastname']")
    WebElement lastNameAddress;

    @CacheLookup
    @FindBy(xpath = "//input[@id='company']")
    WebElement companyField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='address1']")
    WebElement addressField1;

    @CacheLookup
    @FindBy(xpath = "//input[@id='address2']")
    WebElement addressField2;

    @CacheLookup
    @FindBy(xpath = "//input[@id='city']")
    WebElement cityField;

    @CacheLookup
    @FindBy(xpath = "//select[@id='id_state']")
    WebElement stateBox;

    @CacheLookup
    @FindBy(xpath = "//input[@id='postcode']")
    WebElement zipCode;

    @CacheLookup
    @FindBy(xpath = "//select[@id='id_country']")
    WebElement countryBox;

    @CacheLookup
    @FindBy(xpath = "//input[@id='phone']")
    WebElement homePhone;

    @CacheLookup
    @FindBy(xpath = "//input[@id='phone_mobile']")
    WebElement mobilePhone;

    @CacheLookup
    @FindBy(xpath = "//input[@id='alias']")
    WebElement assignAddress;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[4]/button[1]/span[1]")
    WebElement registerButton;

    @CacheLookup
    @FindBy(xpath = "//input[@id='email_create']")
    WebElement emailField1;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]/span[1]")
    WebElement createAnAccountButton;

    public void clickOnCreateAnAccountButton() {
        clickOnElement(createAnAccountButton);
        log.info("Clicking on createAnAccountButton "+ createAnAccountButton.toString());
    }

    public void enterEmailField1(String createMail) {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String emailAddress = createMail+timestamp.getTime()/10000+"@domain.com";
        sendTextToElement(emailField1, emailAddress);
        log.info("Enter email "+createMail+ " to email field "+emailField1.toString());
    }

    public void clickOnTitleButton() {
        clickOnElement(titleButton);
        log.info("Clicking on title button " + titleButton.toString());
    }

    public void enterFirstName(String fName) {
        sendTextToElement(firstName, fName);
        log.info("Enter firstname " + fName + "to firstName field " + firstName.toString());
    }

    public void enterLastName(String lName) {
        sendTextToElement(lastName, lName);
        log.info("Enter lastName " + lName + "to lastName field " + lastName.toString());
    }

    public void enterEmail(String mail) {
        sendTextToElement(emailField, mail);
        log.info("Enter email " + mail + " to email field " + emailField.toString());
    }

    public void enterPassWord(String pass) {
        sendTextToElement(passField, pass);
        log.info("Enter passField " + pass + " to password field " + passField.toString());
    }

    public void selectDay(String day) {
        selectByValueFromDropDown(daysBox, day);
        log.info("Selecting day " + day + " from dropdown " + daysBox.toString());
    }

    public void selectMonth(String month) {
        selectByValueFromDropDown(monthBox, month);
        log.info("Selecting month " + month + " from dropdown " + monthBox.toString());
    }

    public void selectYear(String year) {
        selectByValueFromDropDown(yearBox, year);
        log.info("Selecting year "+year+" from dropdown "+yearBox.toString());
    }

    public void clickOnNewsLetterBox() {
        clickOnElement(newsletterBox);
        log.info("Clicking on newsletterbox " + newsletterBox.toString());
    }

    public void clickOnReceiveOfferBox() {
        clickOnElement(receiveOfferBox);
        log.info("Clicking on receiveOfferBox "+ receiveOfferBox.toString());
    }

    public void enterFirstNameOfAddress(String fNameAddress) {
        sendTextToElement(firstNameAddress, fNameAddress);
        log.info("Enter first name " + fNameAddress + " to first Name field " + firstNameAddress.toString());
    }

    public void enterLastNameOfAddress(String lNameAddress) {
        sendTextToElement(lastNameAddress, lNameAddress);
        log.info("Enter lastName " + lNameAddress + " to last Name field " + lastNameAddress.toString());
    }

    public void enterCompanyName(String company) {
        sendTextToElement(companyField, company);
        log.info("Enter company " + company + " to company field " + companyField.toString());
    }

    public void enterAddress1(String add1) {
        sendTextToElement(addressField1, add1);
        log.info("Enter address " + add1 + " to email field " + addressField1.toString());
    }

    public void enterAddress2(String add2) {
        sendTextToElement(addressField2, add2);
        log.info("Enter address " + add2 + " to email field " + addressField2.toString());
    }

    public void enterCityName(String city) {
        sendTextToElement(cityField, city);
        log.info("Enter city " + city + " to city field " + cityField.toString());
    }

    public void selectState(String state) {
        selectByValueFromDropDown(stateBox, state);
        log.info("Selecting state "+state+" from dropdown "+stateBox.toString());
    }

    public void enterZipCode(String zip) {
        sendTextToElement(zipCode, zip);
        log.info("Enter zip " + zip + " to email field " + zipCode.toString());
    }

    public void selectCountry(String country) {
        selectByVisibleTextFromDropDown(countryBox, country);
        log.info("Selecting country "+country+" from dropdown "+countryBox.toString());
    }

    public void enterHomePhone(String hPhone) {
        sendTextToElement(homePhone, hPhone);
        log.info("Enter home phone "+hPhone+ " to home phone field "+homePhone.toString());
    }

    public void enterMobilePhone(String mPhone) {
        sendTextToElement(mobilePhone, mPhone);
        log.info("Enter mobile phone "+mPhone+ " to mobile phone field "+mobilePhone.toString());
    }

    public void enterAssignAddress(String assign) {
        sendTextToElement(assignAddress, assign);
        log.info("Enter assign address "+assign+ " to assignAddress field "+assignAddress.toString());
    }

    public void clickOnRegisterButton() {
        clickOnElement(registerButton);
        log.info("Clicking on registerButton "+ registerButton.toString());
    }
}
