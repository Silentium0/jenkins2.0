package com.loop.page;

import com.loop.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBearPage extends SmartBearLoginPage    {


    @FindBy(xpath = "//select[contains(@id,'Product')]")
    public WebElement familyAlbum;

    @FindBy(xpath = "//input[contains(@name,'Quantity')]")
    public WebElement quantity;

    @FindBy(xpath = "//input[@value='Calculate']")
    public WebElement calculate;
    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$txtName']")
    public WebElement Name;
    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$TextBox2']")
    public WebElement street;
    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$TextBox3']")
    public WebElement city;
    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$TextBox4']")
    public WebElement state;
    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$TextBox5']")
    public WebElement zip;

    @FindBy(xpath = "//input[@value='American Express']")
    public WebElement americanExpress;

    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$TextBox6']")
    public WebElement creditCard;
    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$TextBox1']")
    public WebElement expirationcard;
    @FindBy(xpath = "//div[@class='buttons_process']/a")
    public WebElement process;
    @FindBy(xpath = "//a[text()='View all orders']")
    public WebElement allOrder;

    @FindBy(xpath = "//td[text()='Chuck Norris']")
    public WebElement Chuck;



    public SmartBearPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
