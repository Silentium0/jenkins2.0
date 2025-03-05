package com.loop.step_definition;

import com.loop.page.DocWebElem;
import com.loop.utilities.BrowserUtils;
import com.loop.utilities.ConfigurationReader;
import com.loop.utilities.DocuportUtils;
import com.loop.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;

public class Validation_StepDef {
    DocWebElem home = new DocWebElem();


    @Given("User login as {string}")
    public void user_login_as(String role) {
        Driver.getDriver().get(ConfigurationReader.getProperty("docuport.ui.url"));
        switch (role) {
            case "Advisor":
                home.username.sendKeys(ConfigurationReader.getProperty("advisor_username"));
                home.password.sendKeys(ConfigurationReader.getProperty("advisor_password"));
                home.loginButton.click();
                break;
            case "Supervisor":
                home.username.sendKeys(ConfigurationReader.getProperty("supervisor_username"));
                home.password.sendKeys(ConfigurationReader.getProperty("supervisor_password"));
                home.loginButton.click();
                break;
            case "Employee":
                home.username.sendKeys(ConfigurationReader.getProperty("employee_username"));
                home.password.sendKeys(ConfigurationReader.getProperty("employee_password"));
                home.loginButton.click();
                break;
            case "Client":
                home.username.sendKeys(ConfigurationReader.getProperty("client_username"));
                home.password.sendKeys(ConfigurationReader.getProperty("client_password"));
                home.loginButton.click();
                try {
                    BrowserUtils.waitForClickable(home.continueButton, 10);
                    home.continueButton.click();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
        }
    }

    @Then("validate {string}")
    public void validate(String items) {
        try {
            List<String> expectedItems = Arrays.asList(items.split(","));
            for (int i = 0; i < expectedItems.size(); i++) {
                String expectedSubItems = expectedItems.get(i).trim();
                WebElement menuItem = Driver.getDriver().findElement(By.xpath("//*[text()='" + expectedSubItems + "']"));
                Assert.assertEquals(expectedSubItems, menuItem.getText());
            }
        } catch (StaleElementReferenceException e) {
            List<String> expectedItems = Arrays.asList(items.split(","));
            for (int i = 0; i < expectedItems.size(); i++) {
                String expectedSubItems = expectedItems.get(i).trim();
                WebElement menuItem = Driver.getDriver().findElement(By.xpath("//*[text()='" + expectedSubItems + "']"));
                Assert.assertEquals(expectedSubItems, menuItem.getText());
            }
        }
    }

    @Then("user click {string}")
    public void userClick(String data) throws InterruptedException {
        DocuportUtils.justClick(data);
    }

    @Then("user click checkbox")
    public void userClickCheckbox() {
        try {
            BrowserUtils.waitForVisibility(home.checkbox, 10).click();
        }catch (ElementClickInterceptedException e){
            BrowserUtils.waitForVisibility(home.checkbox, 10).click();

        }
    }

    @Then("create new client")
    public void createNewClient(Map<String, String> input) {
        for (Map.Entry<String, String> entry : input.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            switch (key) {
                case "First Name":
                    home.firstName.sendKeys(value);
                    break;
                case "Last Name":
                    home.lastName.sendKeys(value);
                    break;
                case "Phone":
                    home.phoneNumber.sendKeys(value);
                case "Email":
                    home.email.sendKeys(value);
                    break;
                case "Password":
                    home.password.sendKeys(value);
                    break;
                case "Confirm password":
                    home.conformPassword.sendKeys(value);
                    break;
                    case "Advisor":
                        home.drop.click();
                        home.batch1Group3.click();
                        break;
                default:
                    throw new InputMismatchException("Invalid input: " + key);
            }

        }

    }


}