package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class WomenCategoryPage extends Utility {
    private static final Logger log = LogManager.getLogger(WomenCategoryPage.class.getName());

    public WomenCategoryPage() {
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Women')]")
    WebElement womenText;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")
    WebElement topsLink;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
    WebElement dressLink;

    @CacheLookup
    @FindBy(xpath = "//select[@id='selectProductSort']")
    WebElement sortByDropDown;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/div[3]/div[1]/ul[1]/li[3]/a[1]/i[1]")
    WebElement productList;


    @CacheLookup
    @FindBy(xpath = "//h5//a[@title='Blouse']")
    WebElement blouse;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[3]/div[1]/div[2]/h5[1]/a[1]")
    WebElement printedDress;

    @CacheLookup
    @FindBy(xpath = "//h5//a[@title='Printed Chiffon Dress']")
    WebElement printedChiffonDress;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[5]/div[1]/div[2]/h5[1]/a[1]")
    WebElement printedSummerDress;


    public String getWomenText() {
        log.info("getting women Text "+womenText.toString());
        return getTextFromElement(womenText);
    }

    public void clickOnTopsLink() {
        clickOnElement(topsLink);
        log.info("Clicking on topsLink "+ topsLink.toString());
    }

    public void clickOnDressLink() {
        clickOnElement(dressLink);
        log.info("Clicking on dressLink "+ dressLink.toString());
    }

    public void selectSortByDropDown(String menu) {
        selectByVisibleTextFromDropDown(sortByDropDown, menu);
        log.info("Selecting menu "+menu+" from dropdown "+sortByDropDown.toString());
    }

    public void clickOnProductList() {
        clickOnElement(productList);
        log.info("Clicking on productList "+ productList.toString());
    }

    public void selectProduct(String text) {

        if (text.equalsIgnoreCase("Blouse")) {
            clickOnElement(blouse);
            log.info("Selecting Product "+text+" from dropdown "+blouse.toString());
        } else if (text.equalsIgnoreCase("Printed Dress"))
        {
            clickOnElement(printedDress);
            log.info("Selecting Product "+text+" from dropdown "+printedDress.toString());
        } else if (text.equalsIgnoreCase("Printed Chiffon Dress"))
        {
            clickOnElement(printedChiffonDress);
            log.info("Selecting Product "+text+" from dropdown "+printedChiffonDress.toString());
        } else if (text.equalsIgnoreCase("Printed Summer Dress with Price $28.98"))
        {
            clickOnElement(printedSummerDress);
            log.info("Selecting Product "+text+" from dropdown "+printedSummerDress.toString());
        }
    }
}
