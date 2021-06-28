package com.instagram.stepsdefinitions;


import com.instagram.automation.models.DataInjection;
import com.instagram.automation.tasks.OpenTheBrowser;
import com.instagram.automation.tasks.WritePersonaData;
import com.instagram.automation.userinterfaces.InstagramAppsPage;
import com.instagram.automation.userinterfaces.InstagramFormPage;
import com.instagram.automation.userinterfaces.InstagramHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;



public class InstagramStepDefinitions {


    @Managed(driver = "chrome")

    private WebDriver Browser;

    private  Actor zair = Actor.named("zair");

    public DataInjection dataInjetion = new DataInjection();
    private InstagramHomePage instagramHomePage;
    private InstagramFormPage instagramFormPage;
    private InstagramAppsPage instagramAppsComponets;
    private WritePersonaData writePersonaData;


    @Before
    public void setUp(){
        zair.can(BrowseTheWeb.with(Browser));

    }

    @Given("^the zair wants to instagram$")
    public void theZairWantsToTranslateAWord() {
        zair.wasAbleTo(OpenTheBrowser.on(instagramHomePage));
        Browser.manage().window().maximize();
        zair.wasAbleTo(Click.on(InstagramAppsPage.INSTAGRAM_APPS));
    }

    @When("^she instagram$")
    public void sheTranslatesTheWordCheeseFromEnglishToSpanish() {


        zair.attemptsTo(Enter.theValue(dataInjetion.getFullname()).into(InstagramFormPage.INPUT_FULL_NAME));
        zair.attemptsTo(Enter.theValue(dataInjetion.getUsername()).into(InstagramFormPage.INPUT_NAME_USER));
        zair.attemptsTo(Enter.theValue(dataInjetion.getPassword()).into(InstagramFormPage.IMPUT_PASSWORD));
        zair.attemptsTo(Enter.theValue(dataInjetion.getEmail()).into(InstagramFormPage.INPUT_PHONE_OR_EMAIL));
        zair.wasAbleTo(Click.on(InstagramFormPage.CLICK_BUTTON_REGISTER));

        System.out.println(dataInjetion.getEmail()+""+ dataInjetion.getFullname()+""+dataInjetion.getPassword()+""+dataInjetion.getUsername());


    }

    @Then("^user registered$")
    public void sheShouldSeeTheWordQuesoInTheScreen() {

    }



}
