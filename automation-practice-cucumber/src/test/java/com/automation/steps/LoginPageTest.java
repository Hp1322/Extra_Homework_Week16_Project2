package com.automation.steps;

import com.automation.pages.Account;
import com.automation.pages.HomePage;
import com.automation.pages.MyAccount;
import com.automation.pages.SignInPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginPageTest {
    @Then("^I should see the authentication page$")
    public void iShouldSeeTheAuthenticationPage() {
        Assert.assertEquals("not navigate on AUTHENTICATION page", "AUTHENTICATION", new SignInPage().getAuthenticationText());
    }

    @And("^I enter \"([^\"]*)\" in user name field$")
    public void iEnterInUserNameField(String userName) {
        new SignInPage().enterEmailField(userName);
    }

    @And("^I enter \"([^\"]*)\" in password field$")
    public void iEnterInPasswordField(String password) {
        new SignInPage().enterPasswordField(password);
    }

    @Then("^I should see the \"([^\"]*)\" on page$")
    public void iShouldSeeTheOnPage(String error) {
        Assert.assertEquals("Login page not displayed", error, new SignInPage().getErrorMessage());
    }

    @And("^I click on sign in button$")
    public void iClickOnSignInButton() {
        new SignInPage().clickOnSignInButton();
    }

    @And("^I enter email \"([^\"]*)\" to email field$")
    public void iEnterEmailToEmailField(String email) {
        new SignInPage().enterEmailField(email);
    }

    @And("^I enter password \"([^\"]*)\" to password field$")
    public void iEnterPasswordToPasswordField(String password) {
        new SignInPage().enterPasswordField(password);
    }

    @And("^I click on sign out link$")
    public void iClickOnSignOutLink() {
        new Account().clickOnSignOutLink();
    }

    @Then("^I should see sign out page$")
    public void iShouldSeeSignOutPage() {
        Assert.assertEquals("User is not navigate to sign out page", "Sign out", new Account().getSignOutLink());
    }


    @Then("^I should see sign in page$")
    public void iShouldSeeSignInPage() {
        Assert.assertEquals("User is not navigate to sign in page", "Sign in", new HomePage().verifySignInButton());
    }
}
