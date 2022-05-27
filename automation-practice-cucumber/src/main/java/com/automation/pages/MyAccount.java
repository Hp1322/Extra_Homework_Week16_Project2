package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.util.List;

public class MyAccount extends Utility {
    private static final Logger log = LogManager.getLogger(MyAccount.class.getName());

    public MyAccount() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'My account')]")
    WebElement myAccountText;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'My addresses')]")
    WebElement myAddressButton;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='last_item item box']//li")//9
    List<WebElement> addressText;

    @CacheLookup
    @FindBy(xpath = "//div[@id='contact-link']")
    WebElement contactUsButton;

    public void clickOnContactUs(){
        mouseHoverToElementAndClick(contactUsButton);
    }

    public String getMyAccountText() {
        log.info("getting my Account text " + myAccountText.toString());
        return getTextFromElement(myAccountText);
    }

    public void clickOnMyAddressButton() {
        clickOnElement(myAddressButton);
    }

    public String[] getAddressText() {
        String[] a = new String[8];
        for (int i = 1; i < addressText.size() - 1; i++) {
            String b = addressText.get(i).getText();
            a[i - 1] = b;
        }
        return a;
    }

}
