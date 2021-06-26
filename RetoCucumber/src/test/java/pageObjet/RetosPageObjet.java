package pageObjet;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import javax.xml.xpath.XPath;

public class RetosPageObjet  extends PageObject {

    @FindBy(xpath = "//input[@name='userName']")
    public WebElementFacade username;

    @FindBy(xpath = "//input[@name='password']")
    public WebElementFacade password;

    @FindBy(xpath = "//input[@name='submit']")
    public WebElementFacade clicBtnsubmit;


    public void escribirUsuario(){

        username.type("ZAIR");
    }

    public void escribirContraseña(){

        password.type("1234566");
    }
    public void submit(){
        clicBtnsubmit.submit();
    }

    public void abrirNavegador(){
        getDriver().get("http://demo.guru99.com/test/newtours/");

    }

}
