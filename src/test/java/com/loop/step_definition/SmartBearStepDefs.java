package com.loop.step_definition;

import com.loop.page.SmartBearPage;
import com.loop.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class SmartBearStepDefs {
    SmartBearPage smartBearPage = new SmartBearPage();



    @Given("user is already logged in and navigated to order page")
    public void user_is_already_logged_in_and_navigated_to_order_page() {
        smartBearPage.loginSmartBear();
        BrowserUtils.takeScreenshot();
    }
    @When("user selects product type {string}")
    public void user_selects_product_type(String product) {
        Select select = new Select(smartBearPage.familyAlbum);
        select.selectByVisibleText(product);
    }

    @When("user enters quantity {int}")
    public void user_enters_quantity(Integer quantity) {
        smartBearPage.quantity.sendKeys(Keys.BACK_SPACE);
        smartBearPage.quantity.sendKeys(quantity.toString());
        smartBearPage.calculate.click();
    }

    @When("user enters customer name {string}")
    public void user_enters_customer_name(String name) {
        smartBearPage.Name.sendKeys(name);
    }

    @When("user enters street {string}")
    public void user_enters_street(String street) {
        smartBearPage.street.sendKeys(street);
    }

    @When("user enters city {string}")
    public void user_enters_city(String city) {
        smartBearPage.city.sendKeys(city);
    }

    @When("user enters state {string}")
    public void user_enters_state(String state) {
        smartBearPage.state.sendKeys(state);
    }

    @When("user enters zip {string}")
    public void user_enters_zip(String zip) {
        smartBearPage.zip.sendKeys(zip);
    }

    @When("user selects credit card type {string}")
    public void user_selects_credit_card_type(String type) {
        smartBearPage.americanExpress.sendKeys(type);
    }

    @When("user enters credit car number {string}")
    public void user_enters_credit_car_number(String credit) {
        smartBearPage.creditCard.sendKeys(credit);
    }

    @When("user enters expiration date {string}")
    public void user_enters_expiration_date(String expiration) {
        smartBearPage.expirationcard.sendKeys(expiration);
    }

    @When("user enters process order button")
    public void user_enters_process_order_button() {
        smartBearPage.process.click();


    }

    @Then("user should see {string} in the first row of the table")
    public void user_should_see_in_the_first_row_of_the_table(String customer) {
        smartBearPage.allOrder.click();
        Assert.assertEquals(smartBearPage.Chuck.getText(), customer);
        System.out.println(smartBearPage.Chuck.getText().equals(customer));


    }
}
