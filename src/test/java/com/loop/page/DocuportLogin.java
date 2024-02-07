package com.loop.page;

import com.loop.utilities.BrowserUtils;
import com.loop.utilities.ConfigurationReader;
import com.loop.utilities.DocuportConstants;
import com.loop.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DocuportLogin extends DocuportBasePage  {


    @FindBy(xpath = "//label[text()='Username or email']/following-sibling::input")
    public WebElement emailBox;

    @FindBy(xpath = "//label[text()='Password']/following-sibling::input")
    public WebElement passwordBox;

    @FindBy(className = "v-btn__content" )
    public WebElement loginButton;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement continueBunnton;




    public void login(String userInput) {
        Driver.getDriver().get(ConfigurationReader.getProperty("docuport.ui.url"));
        //BrowserUtils.justWait(2000);

        String username;
        String password;

        switch (userInput) {
            case "advisor":
                username = ConfigurationReader.getProperty("advisor_username");
                password = ConfigurationReader.getProperty("advisor_password");
                emailBox.sendKeys(username);
                passwordBox.sendKeys(password);
                loginButton.click();

                break;

            case "client":
                username = ConfigurationReader.getProperty("client_username");
                password = ConfigurationReader.getProperty("client_password");
                emailBox.sendKeys(username);
                passwordBox.sendKeys(password);
                loginButton.click();
                BrowserUtils.justWait(2000);
                continueBunnton.click();
                BrowserUtils.justWait(1000);
                break;
            case "Escobar":
                username = ConfigurationReader.getProperty("hulio_username");
                password = ConfigurationReader.getProperty("hulio_password");
                emailBox.sendKeys(username);
                passwordBox.sendKeys(password);
                loginButton.click();

                break;
            case "supervisor":
                username = ConfigurationReader.getProperty("supervisor_username");
                password = ConfigurationReader.getProperty("supervisor_password");
                emailBox.sendKeys(username);
                passwordBox.sendKeys(password);
                loginButton.click();


                break;
            case "employee":
                username = ConfigurationReader.getProperty("employee_username");
                password = ConfigurationReader.getProperty("employee_password");
                emailBox.sendKeys(username);
                passwordBox.sendKeys(password);
                loginButton.click();


                break;
                default:
                // Handle unknown user input or provide a default behavior
                System.out.println("Invalid user role");
                return;
        }


    }

    @FindBy(xpath = "//span[contains(text(),'Batch1 Group3')]")
    public WebElement batch;
    @FindBy(xpath = "//span[contains(text(),'Log out')]")
    public WebElement logout;
    @FindBy(xpath = "//div[@class='v-avatar primary']/following-sibling::span")
    public WebElement batch2;

    public void logOut(){

       // BrowserUtils.justWait(2000);
        batch.click();
        logout.click();
    }

    public void logout(){
        //BrowserUtils.justWait(2000);
        batch2.click();
        BrowserUtils.waitForVisibility(logout, DocuportConstants.LARGE);
        logout.click();




    }



}
