package com.demoqa.stepdefinitions;

import com.demoqa.task.FormHomePageT;
import com.demoqa.interations.OpenTheBrowser;
import com.demoqa.task.PublicityClose;
import com.demoqa.userinterface.HomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowsingTheWeb;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;


public class DemoqaStepdefinitions {

    @Managed
    private WebDriver driver;



     @Before
    public void setUp(){

         OnStage.setTheStage(new OnlineCast());
         OnStage.theActorCalled("zair").can(BrowsingTheWeb.with(driver));

    }


    @Given("^we are on the page$")
    public void weAreOnThePage() {
      theActorInTheSpotlight().attemptsTo(OpenTheBrowser.on(HomePage.URL));

      driver.manage().window().maximize();
      theActorInTheSpotlight().attemptsTo(PublicityClose.close());
    }


    @When("^the form is filled out$")
    public void theFormIsFilledOut()  {
     theActorInTheSpotlight().attemptsTo(FormHomePageT.in(""));

    }

    @Then("^the form was sent$")
    public void theFormWasSent() {

    }

    @Then("^check if the data is correct$")
    public void checkIfTheDataIsCorrect() {

    }


}
