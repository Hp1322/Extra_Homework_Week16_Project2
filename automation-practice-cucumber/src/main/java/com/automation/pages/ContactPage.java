package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage extends Utility {
    private static final Logger log = LogManager.getLogger(ContactPage.class.getName());

    public ContactPage() {
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@id='id_contact']")
    WebElement subjectHeading;

    @CacheLookup
    @FindBy(xpath = "//select[@name='id_order']")
    WebElement orderReference;

    @CacheLookup
    @FindBy(xpath = "//textarea[@id='message']")
    WebElement messageBox;

    @CacheLookup
    @FindBy(xpath = "//button[@name='submitMessage']")
    WebElement sendButton;

    public void selectSubjectHeading(String subject){
        selectByValueFromDropDown(subjectHeading,subject);
    }
    public void selectOrderReference(String order){
        selectByValueFromDropDown(orderReference,order);
    }
    public void enterMessage(String message){
        sendTextToElement(messageBox, message);
    }

    public void clickOnSendButton(){
        clickOnElement(sendButton);
        log.info("Clicking on send button "+ sendButton.toString());
    }
}
