package com.automation.steps;

import com.automation.pages.CreateAccountPage;
import com.automation.pages.HomePage;
import com.automation.pages.MyAccount;
import com.automation.pages.SignInPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class CreateAccountPageTest {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I click on sign in link$")
    public void iClickOnSignInLink() {
        new HomePage().clickOnSignInLink();
    }

    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email) {
        new SignInPage().enterEmailField1(email);
    }

    @And("^I click on create an account button$")
    public void iClickOnCreateAnAccountButton() {
        new SignInPage().clickOnCreateAnAccountButton();
    }

    @And("^I click on title button$")
    public void iClickOnTitleButton() {
        new CreateAccountPage().clickOnTitleButton();
    }

    @And("^I enter first name \"([^\"]*)\"$")
    public void iEnterFirstName(String firstName) {
        new CreateAccountPage().enterFirstName(firstName);
    }

    @And("^I enter last name \"([^\"]*)\"$")
    public void iEnterLastName(String lastName) {
        new CreateAccountPage().enterLastName(lastName);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password) {
        new CreateAccountPage().enterPassWord(password);
    }

    @And("^I select \"([^\"]*)\" day$")
    public void iSelectDay(String day) {
        new CreateAccountPage().selectDay(day);
    }

    @And("^I select \"([^\"]*)\" month$")
    public void iSelectMonth(String month) {
        new CreateAccountPage().selectMonth(month);
    }

    @And("^I select \"([^\"]*)\" year$")
    public void iSelectYear(String year) {
        new CreateAccountPage().selectYear(year);
    }

    @And("^I click on news letter box$")
    public void iClickOnNewsLetterBox() {
        new CreateAccountPage().clickOnNewsLetterBox();
    }

    @And("^I click on receive offer box$")
    public void iClickOnReceiveOfferBox() {
        new CreateAccountPage().clickOnReceiveOfferBox();
    }

    @And("^I enter company name \"([^\"]*)\"$")
    public void iEnterCompanyName(String company) {
        new CreateAccountPage().enterCompanyName(company);
    }

    @And("^I enter address \"([^\"]*)\"$")
    public void iEnterAddress(String address) {
        new CreateAccountPage().enterAddress1(address);
    }

    @And("^I enter address line \"([^\"]*)\"$")
    public void iEnterAddressLine(String addressLine) {
        new CreateAccountPage().enterAddress2(addressLine);
    }

    @And("^I enter city name \"([^\"]*)\"$")
    public void iEnterCityName(String city) {
        new CreateAccountPage().enterCityName(city);
    }

    @And("^I select state \"([^\"]*)\"$")
    public void iSelectState(String state) {
        new CreateAccountPage().selectState(state);
    }

    @And("^I enter zip code \"([^\"]*)\"$")
    public void iEnterZipCode(String zipCode) {
        new CreateAccountPage().enterZipCode(zipCode);
    }

    @And("^I select country \"([^\"]*)\"$")
    public void iSelectCountry(String country) {
        new CreateAccountPage().selectCountry(country);
    }

    @And("^I enter home phone number \"([^\"]*)\"$")
    public void iEnterHomePhoneNumber(String homePhone) {
        new CreateAccountPage().enterHomePhone(homePhone);
    }

    @And("^I enter mobile phone number \"([^\"]*)\"$")
    public void iEnterMobilePhoneNumber(String mobilePhone) {
        new CreateAccountPage().enterMobilePhone(mobilePhone);
    }

    @And("^I enter assign address \"([^\"]*)\"$")
    public void iEnterAssignAddress(String assignAddress) {
        new CreateAccountPage().enterAssignAddress(assignAddress);
    }

    @And("^I click on register button$")
    public void iClickOnRegisterButton() {
        new CreateAccountPage().clickOnRegisterButton();
    }

    @Then("^I should see the my account page$")
    public void iShouldSeeTheMyAccountPage() {
        Assert.assertEquals("User is not navigate to my account page","MY ACCOUNT", new MyAccount().getMyAccountText());
    }
}
