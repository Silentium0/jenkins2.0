package com.loop.page;

import com.loop.utilities.BrowserUtils;
import com.loop.utilities.DocuportConstants;
import com.loop.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DocuportBasePage {


    @FindBy(xpath = "//div[@class='v-list-item__title']//span")
    public List<WebElement> listOfElements;

    @FindBy(xpath = "//span[text()='Clients']")
    public WebElement client;
    @FindBy(xpath = "//span[text()='Create new client']")
    public WebElement createClient;

    @FindBy(xpath = "//span[text()='Personal']/preceding-sibling::i")
    public WebElement personal;
    @FindBy(xpath = "//label[.='Create new user']")
    public WebElement createNewUser;

    @FindBy(xpath = "//label[.='First name']/following-sibling::input")
    public WebElement firstName;
    @FindBy(xpath = "//*[text()='Last name']/following-sibling::input")
    public WebElement lastName;
    @FindBy(xpath = "//*[text()='Email address']/following-sibling::input")
    public WebElement email;

    @FindBy(xpath = "//*[text()='Phone number']/following-sibling::input")
    public WebElement phone;
    @FindBy(xpath = "//*[text()='Password']/following-sibling::input")
    public WebElement password;
    @FindBy(xpath = "//*[text()='Confirm password']/following-sibling::input")
    public WebElement confirmPassword;
    @FindBy(xpath = "//label[text()='Advisor']/following-sibling::input[1]")
    public WebElement advisorClick;
    @FindBy(xpath = "//div[text()='advisor advisor']")
    public WebElement advisorChoose;
    @FindBy(xpath = "//*[text()=' Save ']")
    public WebElement save;


    @FindBy(xpath = "//div[@class='v-list-item__title']/span[text()='Received docs']")
    public WebElement receivDocs;

    @FindBy(xpath = "//div[@class='v-list-item__title']/span[text()='My uploads']")
    public WebElement myUpload;


    @FindBy(xpath ="//span[text()='Search']" )
    public WebElement search;

    @FindBy(xpath = "//span[text()='Download']")
    public WebElement download;

    @FindBy(xpath = "//div[text()='10']")
    public WebElement defaultRow;
    @FindBy(xpath = "//div[text()='5']")
    public WebElement afterChange;

    @FindBy(xpath = "//div[@class='v-input__icon v-input__icon--append']")
    public WebElement dropDown;

    @FindBy(xpath = "//div[@class='v-list-item__title']/span[text()='Users'] ")
    public WebElement users;
    @FindBy(xpath = "//span[text()='Leads']")
    public WebElement leads;

    public void setCreateNewUser(Map<String,String> input){
        firstName.sendKeys(input.get("First name"), Keys.ENTER);
        lastName.sendKeys(input.get("Last Name"),Keys.ENTER);
        email.sendKeys(input.get("Email address"),Keys.ENTER);
        advisorClick.click();
        advisorChoose.click();
        phone.sendKeys(input.get("Phone Number"),Keys.ENTER);
        password.sendKeys(input.get("Password"),Keys.ENTER);
        confirmPassword.sendKeys(input.get("Password"),Keys.ENTER);
        save.click();



    }
    public void chancheRowNum(Integer num){
        dropDown.click();
        Driver.getDriver().findElement(By.xpath("//div[@class='v-list-item__content']/div[text()='"+num+"']")).click();

    }








    public List<String> listElements(){
        List<String> actual = new ArrayList<>();
        for (WebElement each : listOfElements){
            actual.add(each.getText());
        }
        return actual;
    }


    public void displayed(String button){

        switch (button){
            case "My uploads":
              myUpload.isDisplayed();
                break;
            case "Received docs":
                receivDocs.isDisplayed();
                break;
        }
    }

    public void clickButton(String button){

        switch (button){
            case "My uploads":
                BrowserUtils.waitForClickable(myUpload,DocuportConstants.LARGE).click();
                break;
            case "Received docs":
                BrowserUtils.waitForClickable(receivDocs,DocuportConstants.LARGE).click();
                break;
        }
    }




    public void navigateToClient(){
        client.click();
        createClient.click();
        personal.click();
        BrowserUtils.waitForVisibility(createNewUser, DocuportConstants.LARGE);
        createNewUser.click();

    }












    public DocuportBasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
