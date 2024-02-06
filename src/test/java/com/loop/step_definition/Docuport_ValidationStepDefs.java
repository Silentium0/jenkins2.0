package com.loop.step_definition;

import com.loop.page.DocuportLogin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Docuport_ValidationStepDefs {
    DocuportLogin docuportLogin = new DocuportLogin();

    @Given("login as {string}")
    public void login_as(String User) {
        docuportLogin.login(User);
    }
    @When("click {string}")
    public void click(String receiveDocs) {
        docuportLogin.clickOn(receiveDocs);
    }
    @Then("Validate Received docs ,search button, download button  is displayed")
    public void validate_received_docs_search_button_download_button_is_displayed() {
        docuportLogin.receivDocs.isDisplayed();
        docuportLogin.search.isDisplayed();
        docuportLogin.download.isDisplayed();
    }
    @When("click on {string}")
    public void click_on(String myuploads) {
        docuportLogin.clickon(myuploads);

    }
    @Then("Validate My uploads, download button, search button is displayed")
    public void validate_my_uploads_download_button_search_button_is_displayed() {
        docuportLogin.myUpload.isDisplayed();
        docuportLogin.search.isDisplayed();
        docuportLogin.download.isDisplayed();
    }
    @Then("LogOut")
    public void log_out() {
        docuportLogin.logOut();

    }

}
