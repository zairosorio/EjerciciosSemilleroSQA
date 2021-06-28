package pagesObject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;
import utils.JavaScrip;


public class NewExperiencePurchasePage extends PageObject {
    JavaScrip scrip = new JavaScrip();

    @FindBy (xpath ="//a[@title='Women']")
    WebElementFacade titleMujeres;

    //code product
    @FindBy (xpath = "//a[@class='product_img_link']/child::img[@title='Blouse']")
    WebElementFacade productCode;

    @FindBy (xpath = "//iframe[@class='fancybox-iframe']")
    WebElementFacade iFrame;

    @FindBy (xpath = "//button[@name='Submit']")
    WebElementFacade addToCart;

    //box1
    @FindBy (xpath = "//a[@class='btn btn-default button button-medium']")
    WebElementFacade buttonMedium;

    //box2
    @FindBy (xpath = "//a[@class='button btn btn-default standard-checkout button-medium']")
    WebElementFacade checkOut1;

    //box3
    @FindBy (xpath = "//button[@class='button btn btn-default button-medium']")
    WebElementFacade checkOut2;

    @FindBy (name = "processCarrier")
    WebElementFacade checkOut3;

    //conditions
    @FindBy (xpath= "//div[@id='uniform-cgv']")
    WebElementFacade conditions;

    //process address
    @FindBy (xpath = "//button[@name='processCarrier']")
    WebElementFacade processAddress;

    //pago
    @FindBy (xpath = "//a[@title='Pay by bank wire']")
    WebElementFacade payment;

    @FindBy (xpath = "//button[@class='button btn btn-default button-medium']")
    WebElementFacade i_confirm;


    @FindBy (xpath = "//strong[text()='Your order on My Store is complete.']")
    WebElementFacade labelConfirmation;

    public void clickOptionWomen(){

        waitFor(titleMujeres).waitUntilClickable().and().click();
    }

    public void chooseProduct(){

        productCode.click();
    }

    public void addToCart(){
        getDriver().switchTo().frame(iFrame);
        waitFor(addToCart).waitUntilEnabled().and().click();
    }

    public void clickOnProcessCarrierButton(){
        getDriver().switchTo().parentFrame();
        buttonMedium.click();
    }

    public void doingCheckOut(){
        waitFor(checkOut1).waitUntilVisible().and().click();
        waitFor(checkOut2).waitUntilVisible().and().click();
            scrip.iagreeToTheTerms();
        waitFor(checkOut3).waitUntilVisible().and().click();
        waitFor(payment).waitUntilVisible().and().click();
        waitFor(i_confirm).waitUntilVisible().and().click();

    }

    public void verifyPurchase(){

        String textToVerify = labelConfirmation.getText();

        if (textToVerify.equals("Your order on My Store is complete.")) {
            System.out.println("TEST SUCCESS");
        } else {
            Assert.fail("TEST FAILED");
        }

    }

}
