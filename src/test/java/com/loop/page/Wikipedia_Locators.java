package com.loop.page;

import com.loop.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wikipedia_Locators {


    @FindBy(xpath = "//input[@id='searchInput']")
    public WebElement inputBox;

    @FindBy(xpath = "//button[@class='pure-button pure-button-primary-progressive']")
    public WebElement searchButton;

    @FindBy(xpath = "//h1/span")
    public WebElement header;

    @FindBy (xpath = "//div[@class='fn']")
       public WebElement SteveImage;
    public Wikipedia_Locators(){
        PageFactory.initElements(Driver.getDriver(),this);
    }





}
