package loopcamp;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


public class StepDefsDocuport {



    @When("user enter username for advisor")
    public void user_enter_username_for_advisor() {
        Driver.getDriver().get(ConfigurationReader.getProperty("docuport"));
        Driver.getDriver().findElement(By.xpath("//input[@id='input-14']")).sendKeys("b1g3_advisor@gmail.com"+ Keys.ENTER);


    }
    @When("user enter password for advisor")
    public void user_enter_password_for_advisor() {
        Driver.getDriver().findElement(By.xpath("//input[@id='input-15']")).sendKeys("Group3"+ Keys.ENTER);

    }
    @When("user  click login button")
    public void user_click_login_button() throws InterruptedException {
        Thread.sleep(2000);

        Driver.getDriver().findElement(By.xpath("//span[@class='v-btn__content']")).click();




    }

}
