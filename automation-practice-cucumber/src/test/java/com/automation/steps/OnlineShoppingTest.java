package com.automation.steps;

import com.automation.pages.*;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.List;

public class OnlineShoppingTest {
    @Given("^I am on home page$")
    public void iAmOnHomePage() {

    }

    @Then("^Navigate to SignUp page$")
    public void navigateToSignUpPage() {
        new HomePage().clickOnSignInLink();
    }

    @And("^create an account with random username$")
    public void createAnAccountWithRandomUsername() {
        new SignInPage().enterEmailField1("Jay");
        new SignInPage().clickOnCreateAnAccountButton();
        new AuthPage().clickOnTitleButton();
        new AuthPage().clickOnTitleButton();
        new AuthPage().enterFirstName("Raja");
        new AuthPage().enterLastName("Baja");
        new AuthPage().enterPassWord("12345678");
        new AuthPage().selectDay("5");
        new AuthPage().selectMonth("3");
        new AuthPage().selectYear("1995");
        new AuthPage().clickOnNewsLetterBox();
        new AuthPage().clickOnReceiveOfferBox();
        new AuthPage().enterCompanyName("Moon");
        new AuthPage().enterAddress1("10, Jk street");
        new AuthPage().enterAddress2("Number 10");
        new AuthPage().enterCityName("Androp");
        new AuthPage().selectState("4");
        new AuthPage().enterZipCode("100-200");
        new AuthPage().selectCountry("United States");
        new AuthPage().enterHomePhone("999990000");
        new AuthPage().enterMobilePhone("9898989898");
        new AuthPage().enterAssignAddress(" zoo St, 502");
        new AuthPage().clickOnRegisterButton();
    }

    @Given("^I am on the Sign In Page$")
    public void iAmOnTheSignInPage() {
        new HomePage().clickOnSignInLink();
    }

    @When("^Login using newly create credentials$")
    public void loginUsingNewlyCreateCredentials() {
        new SignInPage().enterEmailField("ram1123@gmail.com");
        new SignInPage().enterPasswordField("123456");
        new SignInPage().clickOnSignInButton();
    }

    @Then("^I shall verify the address information in my address section$")
    public void iShallVerifyTheAddressInformationInMyAddressSection() {
        new MyAccount().clickOnMyAddressButton();
        String[] expected = {"10, Beats", "Rom, Arkansas 12345", "United States"};
        for (int i = 3; i < expected.length; i++) {
            System.out.println(new MyAccount().getAddressText()[i]);
            Assert.assertEquals("", expected[i], new MyAccount().getAddressText()[i]);
        }
    }

    @And("^I am on the contact page$")
    public void iAmOnTheContactPage() {
        new MyAccount().clickOnContactUs();
    }

    @Then("^I send refund request to customer care for previous order$")
    public void iSendRefundRequestToCustomerCareForPreviousOrder() {
        new ContactPage().selectSubjectHeading("2");
        new ContactPage().selectOrderReference("439867");
        new ContactPage().enterMessage("I want refund for this order");
        new ContactPage().clickOnSendButton();
    }

    @And("^I add below product to cart$")
    public void iAddBelowProductToCart(DataTable dataTable) {
        List<List<String>> productList = dataTable.asLists(String.class);
        for (List<String> data : productList) {
            new ProductPage().selectCategory(data.get(0));
            new ProductPage().selectSubCategory(data.get(1));
            new ProductPage().selectName(data.get(2));
            Assert.assertEquals(data.get(3), new CommonPage().getDemoText());
            new CommonPage().clearQuantity();
            new CommonPage().addQuantity(data.get(4));
            new CommonPage().clickOnAddToCart();
            new CommonPage().clickOnCrossSign();
        }
        new CommonPage().clickOnProceedToCheckout();
    }

    @Then("^I shall validate shopping cart as below$")
    public void iShallValidateShoppingCartAsBelow(DataTable dataTable) {
        List<List<String>> validate = dataTable.asLists(String.class);
        for (List<String> data : validate) {
            Assert.assertEquals(data.get(0), new CommonPage().getNameText(data.get(0)));
            Assert.assertEquals(data.get(1), new CommonPage().getSkuDemoText(data.get(1)));
            Assert.assertEquals(data.get(2), new CommonPage().getQuantityText(data.get(2)));
            new CommonPage().clickOnProceedCheckoutButton1();
            new CommonPage().clickOnProceedCheckoutButton2();
            new CommonPage().clickOnCheckBox();
            new CommonPage().clickOnProceedCheckoutButton3();
            new CommonPage().clickOnPayByCheck();
            new CommonPage().clickOnConfirmOrderButton();



        }
    }

    @Then("^I shall be able to Buy the product$")
    public void iShallBeAbleToBuyTheProduct() {
    }

    @And("^I shall be able to Buy using cheque payment$")
    public void iShallBeAbleToBuyUsingChequePayment() {
    }
}
