package com.automation.steps;

import com.automation.pages.HomePage;
import com.automation.pages.ProductPage;
import com.automation.pages.WomenCategoryPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import jdk.internal.org.objectweb.asm.Handle;
import org.junit.Assert;

public class WomenCategoryPageTest {
    @When("^I click on women link$")
    public void iClickOnWomenLink() {
        new HomePage().clickOnWomanLink();
    }

    @Then("^I should see the women page$")
    public void iShouldSeeTheWomenPage() {
        Assert.assertEquals("User is not navigate to woman page","WOMEN", new WomenCategoryPage().getWomenText());
    }

    @And("^I select \"([^\"]*)\" product$")
    public void iSelectProduct(String product){
        new WomenCategoryPage().selectProduct(product);
    }

    @And("^I clear quantity from product box$")
    public void iClearQuantityFromProductBox() {
        new ProductPage().clearQuantity();
    }

    @And("^I add \"([^\"]*)\" quantity$")
    public void iAddQuantity(String quantity){
        new ProductPage().addQuantity(quantity);
    }

    @And("^I select \"([^\"]*)\" size from size dropdown$")
    public void iSelectSizeFromSizeDropdown(String size){
        new ProductPage().selectSizeDropDown(size);
    }

    @And("^I select \"([^\"]*)\" colour$")
    public void iSelectColour(String colour){
        new ProductPage().selectColour(colour);
    }

    @And("^I click on add to cart button$")
    public void iClickOnAddToCartButton() {
        new ProductPage().clickOnAddToCart();
    }


    @Then("^I click on cross sign$")
    public void iClickOnCrossSign() {
        new ProductPage().clickOnCrossSign();
    }

    @And("^I should see successfully message$")
    public void iShouldSeeSuccessfullyMessage() {
        try {
            Assert.assertEquals("Product is not added to cart","Product successfully added to your shopping cart", new ProductPage().getProductSuccessText().substring(0,48));
        }catch (Exception e){

        }
    }
}
