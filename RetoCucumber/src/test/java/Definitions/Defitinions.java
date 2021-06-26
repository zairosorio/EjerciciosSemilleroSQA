package Definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import pageObjet.RetosPageObjet;

public class Defitinions {

    @Steps
    RetosPageObjet retosPageObjet;

    @Given("^que el usuario ingresa a la pagina$")
    public void queElUsuarioIngresaALaPagina()  {
        retosPageObjet.abrirNavegador();

    }

    @When("^cuando el usuario escribe usuario y contraña$")
    public void cuandoElUsuarioEscribeUsuarioYContraña() {
        retosPageObjet.escribirUsuario();
        retosPageObjet.escribirContraseña();

    }

    @When("^hace clic en ingresar$")
    public void haceClicEnIngresar() {

    }

    @Then("^el usuario se loguea$")
    public void elUsuarioSeLoguea()  {

    }

}
