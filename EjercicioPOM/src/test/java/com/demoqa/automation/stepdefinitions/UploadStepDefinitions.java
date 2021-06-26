package com.demoqa.automation.stepdefinitions;

import com.demoqa.steps.UploadPageSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UploadStepDefinitions {


    @Steps
    UploadPageSteps uploadPageSteps;

    @Given("^enter the page$")
    public void enter_the_page()  {
        uploadPageSteps.openBrowser();
    }

    @When("^click the button select file$")
    public void click_the_button_select_file() throws InterruptedException {
        uploadPageSteps.publicity();
        Thread.sleep(5000);
        uploadPageSteps.uploadfile();

    }

    @Then("^the file is loaded$")
    public void the_file_is_loaded() {
         uploadPageSteps.validation();
    }







}
