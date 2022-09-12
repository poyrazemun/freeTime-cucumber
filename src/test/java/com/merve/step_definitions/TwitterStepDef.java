package com.merve.step_definitions;

import com.merve.pages.TwitterAllPages;
import com.merve.utilities.ConfigurationReader;
import com.merve.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TwitterStepDef {

    TwitterAllPages twitterAllPages = new TwitterAllPages();

    @Given("user is already on the dashboard of Twitter")
    public void user_is_already_on_the_dashboard_of_twitter() {

        Driver.getDriver().get("https://twitter.com/i/flow/login");
        twitterAllPages.username.sendKeys(ConfigurationReader.getProperty("username") + Keys.ENTER);
        twitterAllPages.password.sendKeys(ConfigurationReader.getProperty("password") + Keys.ENTER);

    }

    @When("user types {string} to the searchbox and clicks the result")
    public void userTypesToTheSearchboxAndClicksTheResult(String userNameOfTheReceiver) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.visibilityOf(twitterAllPages.searchBox));
        twitterAllPages.searchBox.sendKeys(userNameOfTheReceiver + Keys.ENTER);
        twitterAllPages.clickableSearchResult.click();

    }


    @And("user clicks message box")
    public void user_clicks_message_box() {

        twitterAllPages.messageBox.click();
    }

    @And("user clicks message input box")
    public void user_clicks_message_input_box() {

        twitterAllPages.startAMessage.click();

    }

    @Then("user writes {string} and send the message")
    public void user_writes_and_send_the_message(String myMessage) {

        twitterAllPages.startAMessage.sendKeys(myMessage + Keys.ENTER);
    }


}
