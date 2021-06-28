package com.instagram.automation.tasks;

import com.instagram.automation.models.DataInjection;
import com.instagram.automation.userinterfaces.InstagramFormPage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class WritePersonaData implements Task {

    public DataInjection dataInjetion = new DataInjection();
    private PageObject page;


    @Override
    @Step("{0} sent info")
    public <T extends Actor> void performAs(T actor) {
         actor.attemptsTo(Enter.theValue().into(InstagramFormPage.INPUT_PHONE_OR_EMAIL));
         actor.attemptsTo(Enter.theValue().into(InstagramFormPage.INPUT_FULL_NAME));
         actor.attemptsTo(Enter.theValue().into(InstagramFormPage.INPUT_NAME_USER));
         actor.attemptsTo(Enter.theValue().into(InstagramFormPage.IMPUT_PASSWORD));
         actor.attemptsTo(Click.on(InstagramFormPage.CLICK_BUTTON_REGISTER));


    }
    public static WritePersonaData the(PageObject page) {


        return Tasks.instrumented(WritePersonaData.class);
    }
    public WritePersonaData(PageObject page){
        this.page = page;
    }

    public Performable performAs(PageObject page) {

        return instrumented(WritePersonaData.class, page);
    }
}
