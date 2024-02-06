package com.loop.step_definition;


import com.loop.page.Wikipedia_Locators;
import com.loop.utilities.BrowserUtils;
import com.loop.utilities.ConfigurationReader;
import com.loop.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class WikipediaStepDefs {

    Wikipedia_Locators  wikipediaLocators = new Wikipedia_Locators();
    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("wiki"));
        BrowserUtils.takeScreenshot();
    }
    @Then("User types {string} in the wiki search box")
    public void user_types_in_the_wiki_search_box(String input) {
       wikipediaLocators.inputBox.sendKeys(input);
    }
    @Then("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        wikipediaLocators.searchButton.click();
        BrowserUtils.takeScreenshot();
    }
    @Then("User sees Steve Jobs is in the wiki title")
    public void user_sees_steve_jobs_is_in_the_wiki_title() {
        Assert.assertEquals(Driver.getDriver().getTitle(),"Steve Jobs - Wikipedia");
    }
    @Then("User sees {string} is in the wiki header")
    public void user_sees_is_in_the_wiki_header(String header) {
       Assert.assertEquals(header,wikipediaLocators.header.getText());
    }
    @Then("User sees {string} is in the image header")
    public void user_sees_is_in_the_image_header(String image) {
        Assert.assertEquals(image,wikipediaLocators.SteveImage.getText());
        BrowserUtils.takeScreenshot();


    }









}
