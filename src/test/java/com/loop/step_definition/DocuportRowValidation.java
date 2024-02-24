package com.loop.step_definition;

import com.loop.page.DocuportLogin;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.BrowserUtils;
import utilities.DocuportConstants;

public class DocuportRowValidation {

    DocuportLogin docuportLogin = new DocuportLogin();

    @Given("user login as {string}")
    public void user_login_as(String userInput) {
        BrowserUtils.justWait(5000);
        docuportLogin.login(userInput);
    }
    @When("Click leads")
    public void click_leads() {
        BrowserUtils.justWait(5000);
        BrowserUtils.waitForVisibility(docuportLogin.leads,20).click();

    }
    @When("Validate that Rows per page shows by default {int}")
    public void validate_that_rows_per_page_shows_by_default(Integer num) {
        BrowserUtils.justWait(5000);

        Integer actualNum = Integer.parseInt(docuportLogin.defaultRow.getText());
        Assert.assertEquals(num, actualNum);
    }
    @When("change rows per page to {int}")
    public void change_rows_per_page_to(Integer num) {
        BrowserUtils.justWait(5000);

        docuportLogin.chancheRowNum(num);
    }
    @When("Click Users")
    public void click_users() {
        BrowserUtils.justWait(5000);
         BrowserUtils.waitForVisibility(docuportLogin.users,20).click();



    }
    @And("validate that Rows per page shows by default {int}")
    public void validateThatRowsPerPageShowsByDefault(Integer num) {
        BrowserUtils.justWait(5000);

        Integer actualNum = Integer.parseInt(docuportLogin.defaultRow.getText());
        Assert.assertEquals(num, actualNum);
    }
    @When("Validate that after changing it is showing {int}")
    public void validate_that_after_changing_it_is_showing(Integer num) {
        BrowserUtils.justWait(5000);

        docuportLogin.chancheRowNum(num);
        Integer actualNum = Integer.parseInt(docuportLogin.afterChange.getText());
        Assert.assertEquals(num, actualNum);
    }



}
