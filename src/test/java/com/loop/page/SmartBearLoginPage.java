package com.loop.page;

import com.loop.utilities.ConfigurationReader;
import com.loop.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBearLoginPage  {

    @FindBy(xpath = "//input[@name='ctl00$MainContent$username']")
    public WebElement usernameInput;

    @FindBy(xpath = "//input[@name='ctl00$MainContent$password']")
    public WebElement passwordInput;
    @FindBy(xpath = "//input[@name='ctl00$MainContent$login_button']")
    public WebElement loginButton;
    @FindBy(xpath = "//a[text()='Order']")
    public WebElement Order;
    public void loginSmartBear(){
        Driver.getDriver().get(ConfigurationReader.getProperty("smart.bear"));
        String username = ConfigurationReader.getProperty("smart.username");
        String password = ConfigurationReader.getProperty("smart.password");
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
        Order.click();
    }
    public SmartBearLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }











}
