package com.loop.page;

import com.loop.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(xpath = "//input[@id='input-14']")
    public WebElement username;


    @FindBy(xpath = "//input[@id='input-15']")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement login;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement continueBunnton;

    @FindBy(xpath = "//img[@src='/img/logo.d7557277.svg']")
    public WebElement title;

    @FindBy(xpath = "//span[@class='subtitle-2 text-none pl-2 pr-3 gray--text text--darken-3']")
    public WebElement Batch1Group3;

    @FindBy(xpath = "//span[text()='Log out']")
    public WebElement logOut;




    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
