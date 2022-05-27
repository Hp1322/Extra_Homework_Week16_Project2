package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Account extends Utility {
    private static final Logger log = LogManager.getLogger(Account.class.getName());

    public Account() {
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath = "//header/div[2]/div[1]/div[1]/nav[1]/div[2]/a[1]")
    WebElement signOutLink;

    public String getSignOutLink(){
        log.info("getting signout text "+signOutLink.toString());
        return getTextFromElement(signOutLink);
    }
    public void clickOnSignOutLink(){
        clickOnElement(signOutLink);
        log.info("Clicking on signOutLink "+ signOutLink.toString());
    }
}
