package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.DataInjections;
import net.thucydides.core.annotations.Steps;
import pagesObject.NewExperiencePurchasePage;
import steps.YourPageSteps;

import java.util.List;

public class YourPageDefinitions {

    @Steps
    YourPageSteps yourPageSteps;

    @Given("^I open the main page$")
    public void iOpenTheMainPage() {

        yourPageSteps.openPage();
    }

    @Given("^Click on sign in link$")
    public void clickOnSignInLink() {

        yourPageSteps.IclickingOnSingIn();
    }

    @When("^I type my email address in Create and account section.")
    public void iTypeMyEmailAddressInCreateAndAccountSection() {

        yourPageSteps.typeEmail(new DataInjections().getEmail());
    }

    @When("^Click on Create an Account button\\.$")
    public void clickOnCreateAnAccountButton() {
        yourPageSteps.createAccount();
    }

    @When("^Type my Personal Information (.*) , Address and Contact inf\\.$")
    public void typeMyPersonalInformationAddressAndContactInf(List<String> parameters) {
        yourPageSteps.typeMyInfo(parameters);
    }

    @When("^Click on Register button\\.$")
    public void clickOnRegisterButton() {
        yourPageSteps.clickOnRegister();
    }

    @Then("^I check that the user was registered (.*),(.*)$")
    public void iCheckThatTheUserWasRegisteredNameLastName(String name, String lastName) {
        yourPageSteps.verify(name,lastName);

    }

    @Given("^I choose a product$")
    public void iChooseAProduct() {
        yourPageSteps.chooseAProduct();

    }

    @And("^I add to the product to the cart$")
    public void iAddToTheProductToTheCart() {
        yourPageSteps.addToCart();
    }

    @When("^I do the purchase$")
    public void iDoThePurchase() throws InterruptedException {
        yourPageSteps.finishPurchase();
        yourPageSteps.checkOut();
    }

    @Then("^I got a purchase confirmation$")
    public void iGotAPurchaseConfirmation() {
        yourPageSteps.verifyPurchase();

    }



}
