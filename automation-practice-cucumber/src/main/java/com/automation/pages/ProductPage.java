package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ProductPage extends Utility {
    private static final Logger log = LogManager.getLogger(ProductPage.class.getName());

    public ProductPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='quantity_wanted']")
    WebElement quantity;

    @CacheLookup
    @FindBy(xpath = "//select[@id='group_1']")
    WebElement sizeDropDown;

    @CacheLookup
    @FindBy(xpath = "//ul[@id='color_to_pick_list']/li")
    WebElement colour;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Add to cart')]")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//div[@class='layer_cart_product col-xs-12 col-md-6']")
    WebElement productSuccessText;

    @CacheLookup
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[4]/div[1]/div[1]/span[1]")
    WebElement crossSign;

    @CacheLookup
    @FindBy(xpath = "//a[@id='color_8']")
    WebElement white;

    @CacheLookup
    @FindBy(xpath = "//a[@id='color_13']")
    WebElement orange;

    @CacheLookup
    @FindBy(xpath = "//a[@id='color_15']")
    WebElement green;

    @CacheLookup
    @FindBy(xpath = "//a[@id='color_14']")
    WebElement blue;
    //--------------------------------------------------------------------------------//
    @CacheLookup
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]")
    WebElement dressesLink;

    @CacheLookup
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/a[1]")
    WebElement womenLink;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")
    WebElement casualDressLink;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")
    WebElement topsLink;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Printed Dress')]")
    WebElement printedDressLink;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Faded Short Sleeve T-shirts')]")
    WebElement fadedShortSleeveLink;

    public void selectCategory(String text){
        if (text.equalsIgnoreCase("Dresses")){
            clickOnElement(dressesLink);
        }
        if (text.equalsIgnoreCase("Women")){
            clickOnElement(womenLink);
        }
    }
    public void selectSubCategory(String text){
        if (text.equalsIgnoreCase("CASUAL DRESSES")){
            clickOnElement(casualDressLink);
        }
        if (text.equalsIgnoreCase("TOPS")){
            clickOnElement(topsLink);
        }
    }
    public void selectName(String text){
        if (text.equalsIgnoreCase("Printed Dress")){
            clickOnElement(printedDressLink);
        }
        if (text.equalsIgnoreCase("Faded Short Sleeve T-shirts")){
            clickOnElement(fadedShortSleeveLink);
        }
    }

    public void selectSizeDropDown(String size) {
        log.info("Selecting colour " + size + " from dropdown " + sizeDropDown.toString());
        selectByVisibleTextFromDropDown(sizeDropDown, size);
    }

    public void clickOnColour() {
        clickOnElement(colour);
        log.info("Clicking on colour " + colour.toString());
    }

    public void clickOnAddToCart() {
        clickOnElement(addToCart);
        log.info("Clicking on addToCart " + addToCart.toString());
    }

    public String getProductSuccessText() {
        log.info("getting product Success text " + productSuccessText.toString());
        return getTextFromElement(productSuccessText);
    }

    public void clickOnCrossSign() {
        clickOnElement(crossSign);
        log.info("Clicking on crossSign " + crossSign.toString());
    }

    public void clearQuantity() {
        clearElementFromField(quantity);
        log.info("Clearing quantity " + quantity.toString());
    }

    public void addQuantity(String quan) {
        sendTextToElement(quantity, quan);
        log.info("Enter quantity " + quantity + " to quantity field " + quantity.toString());
    }

    public void selectColour(String text) {

        if (text == "White") {
            clickOnElement(white);
            log.info("Selecting colour " + text + " from dropdown " + white.toString());
        } else if (text == "Orange") {
            clickOnElement(orange);
            log.info("Selecting colour " + text + " from dropdown " + orange.toString());
        } else if (text == "Green") {
            clickOnElement(green);
            log.info("Selecting colour " + text + " from dropdown " + green.toString());
        } else if (text == "Blue") {
            clickOnElement(blue);
            log.info("Selecting colour " + text + " from dropdown " + blue.toString());
        }
    }
}
