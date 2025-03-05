package com.loop.page;

import com.loop.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DocWebElem {

    @FindBy(xpath = "//label[contains(text(),'Username or email')]/following-sibling::input")
    public WebElement username;

    @FindBy(xpath = "//label[contains(text(),'Password')]/following-sibling::input")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//span[contains(text(),' Continue ')]/..")
    public WebElement continueButton;

    @FindBy(xpath = "//span[contains(text(),'Home')]")
    public WebElement Home;

    @FindBy(xpath = "//label[contains(text(),'Create new user')]/../div/div")
    public WebElement checkbox;

    @FindBy(xpath = "//label[contains(text(),'First name')]/../input")
    public WebElement firstName;

    @FindBy(xpath = "//label[contains(text(),'Last name')]/../input")
    public WebElement lastName;

    @FindBy(xpath = "//label[contains(text(),'Email address')]/../input")
    public WebElement email;

    @FindBy(xpath = "//label[contains(text(),'Phone number')]/../input")
    public WebElement  phoneNumber;

    @FindBy(xpath = "//label[contains(text(),'Password')]/../input")
    public WebElement passwords;

    @FindBy(xpath = "//label[contains(text(),'Confirm password')]/../input")
    public WebElement conformPassword;

    @FindBy(xpath = "//label[contains(text(),'Advisor')]/../div")
    public WebElement drop;

    @FindBy(xpath = "//div[contains(text(),'Batch1 Group3')]")
    public WebElement batch1Group3;










    public DocWebElem() {
        PageFactory.initElements(Driver.getDriver(),this);


    }

}
