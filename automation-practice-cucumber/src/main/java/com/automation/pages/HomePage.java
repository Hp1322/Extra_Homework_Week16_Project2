package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/a[1]")
    WebElement womanLink;

    @CacheLookup
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]")
    WebElement dressesLink;

    @CacheLookup
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[3]/a[1]")
    WebElement tShirtLink;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    WebElement signInLink;

    @CacheLookup
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[1]/a[1]/img[1]")
    WebElement logoLink;


    public void clickOnWomanLink(){
        clickOnElement(womanLink);
        log.info("Clicking on woman "+ womanLink.toString());
    }
    public void clickOnDressesLink(){
        clickOnElement(dressesLink);
        log.info("Clicking on dresses "+ dressesLink.toString());
    }
    public void clickOnTShirtLink(){
        clickOnElement(tShirtLink);
        log.info("Clicking on tShirt "+ tShirtLink.toString());
    }
    public void clickOnSignInLink(){
        clickOnElement(signInLink);
        log.info("Clicking on signIn "+ signInLink.toString());
    }
    public void clickOnLogoLink(){
        clickOnElement(logoLink);
        log.info("Clicking on logo "+ logoLink.toString());
    }
    public String verifySignInButton(){
        log.info("verifySignInButton text "+logoLink.toString());
        return getTextFromElement(signInLink);
    }

}
