package com.loop.step_definition;

import com.loop.page.DocuportLogin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.ElementNotInteractableException;
import utilities.BrowserUtils;

public class Docuport_ValidationStepDefs {

    DocuportLogin docuportLogin = new DocuportLogin();

    @Given("login as {string}")
    public void login_as(String user) {
        BrowserUtils.justWait(5000);

        docuportLogin.login(user);
    }
    @When("click on {string}")
    public void click_on(String userClick) {
        BrowserUtils.justWait(5000);

        docuportLogin.clickButton(userClick);
    }
    @Then("Validate {string},download button, search button is displayed")
    public void validate_download_button_search_button_is_displayed(String item) {
        BrowserUtils.justWait(5000);

        docuportLogin.displayed(item);
        docuportLogin.search.isDisplayed();
        docuportLogin.download.isDisplayed();

    }
    @Then("LogOut")
    public void log_out() {
        BrowserUtils.justWait(5000);

        docuportLogin.logOut();
    }


}
