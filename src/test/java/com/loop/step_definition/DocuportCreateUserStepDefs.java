package com.loop.step_definition;

import com.loop.page.DocuportLogin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.Map;

public class DocuportCreateUserStepDefs {
    DocuportLogin docuportLogin = new DocuportLogin();


    @Given("user is already logged in as {string}")
    public void user_is_already_logged_in_as(String input) {
        docuportLogin.login(input);
        docuportLogin.navigateToClient();
    }

    @Then("Create  new  Client")
    public void create_new_client(Map<String, String> input) {
        docuportLogin.setCreateNewUser(input);

    }

    @Then("logout")
    public void logout() {
        docuportLogin.logOut();

    }

    @Then("login as new client {string}")
    public void login_as_new_client(String input) {
        docuportLogin.login(input);
        docuportLogin.logout();


    }


}
