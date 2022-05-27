package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonPage extends Utility {
    private static final Logger log = LogManager.getLogger(CommonPage.class.getName());

    public CommonPage() {
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath = "//p[@id='product_reference']//span")
    WebElement demoText;

    @CacheLookup
    @FindBy(xpath = "//input[@id='quantity_wanted']")
    WebElement quantity;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Add to cart')]")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[4]/div[1]/div[1]/span[1]")
    WebElement crossSign;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/a[1]/span[1]")
    WebElement proceedToCheckout;

    @CacheLookup
    @FindBy(xpath = "//tbody/tr[2]/td[2]/p")
    WebElement fadedShortText;

    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[2]/p")
    WebElement printedDressText;

    @CacheLookup
    @FindBy(xpath = "//small[text()='SKU : demo_1']")
    WebElement skuDemoText1;

    @CacheLookup
    @FindBy(xpath = "//small[text()='SKU : demo_3']")
    WebElement skuDemoText3;

    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[5]/input[2]")
    WebElement PrintedQuantity;

    @CacheLookup
    @FindBy(xpath = "//tbody/tr[2]/td[5]/input[2]")
    WebElement FadedQuantity;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/p[2]/a[1]/span[1]")
    WebElement proceedCheckoutButton1;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]/span[1]")
    WebElement proceedCheckoutButton2;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/p[1]/button[1]/span[1]")
    WebElement proceedCheckoutButton3;

    @CacheLookup
    @FindBy(xpath = "//input[@id='cgv']")
    WebElement checkBox;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[3]/div[2]/div[1]/p[1]/a[1]")
    WebElement payByCheck;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]/span[1]")
    WebElement confirmOrderButton;

    public String getNameText(String text){
        if(text.equalsIgnoreCase("Printed Dress")){
            return getTextFromElement(printedDressText);

        }
        if (text.equalsIgnoreCase("Faded Short Sleeve T-shirts")){
           return getTextFromElement(fadedShortText);
        }
        return null;
    }

    public String getSkuDemoText(String text){
        if(text.equalsIgnoreCase("SKU : demo_3")){
            return getTextFromElement(skuDemoText3);
        }
        if (text.equalsIgnoreCase("SKU : demo_1")){
            return getTextFromElement(skuDemoText1);
        }
        return null;
    }
    public String getQuantityText(String text){
        if(text.equalsIgnoreCase("2")){
           return getTextFromElementByValue(PrintedQuantity,"value");
        }
        if (text.equalsIgnoreCase("3")){
           return getTextFromElementByValue(FadedQuantity, "value");
        }
        return null;
    }

    public String getDemoText(){
        log.info("Getting demo Text"+demoText.toString());
        return getTextFromElement(demoText);
    }
    public void clearQuantity() {
        clearElementFromField(quantity);
        log.info("Clearing quantity " + quantity.toString());
    }

    public void addQuantity(String quan) {
        sendTextToElement(quantity, quan);
        log.info("Enter quantity " + quantity + " to quantity field " + quantity.toString());
    }
    public void clickOnAddToCart() {
        clickOnElement(addToCart);
        log.info("Clicking on addToCart " + addToCart.toString());
    }
    public void clickOnCrossSign() {
        clickOnElement(crossSign);
        log.info("Clicking on crossSign " + crossSign.toString());
    }
    public void clickOnProceedToCheckout() {
        clickOnElement(proceedToCheckout);
        log.info("Clicking on addToCart " + proceedToCheckout.toString());
    }
    public void clickOnProceedCheckoutButton1() {
        clickOnElement(proceedCheckoutButton1);
        log.info("Clicking on addToCart " + proceedCheckoutButton1.toString());
    }
    public void clickOnProceedCheckoutButton2() {
        clickOnElement(proceedCheckoutButton2);
        log.info("Clicking on addToCart " + proceedCheckoutButton2.toString());
    }
    public void clickOnProceedCheckoutButton3() {
        clickOnElement(proceedCheckoutButton3);
        log.info("Clicking on addToCart " + proceedCheckoutButton3.toString());
    }

    public void clickOnCheckBox(){
        clickOnElement(checkBox);
    }
    public void clickOnPayByCheck(){
        clickOnElement(payByCheck);
    }
    public void clickOnConfirmOrderButton(){
        clickOnElement(confirmOrderButton);
    }



}
