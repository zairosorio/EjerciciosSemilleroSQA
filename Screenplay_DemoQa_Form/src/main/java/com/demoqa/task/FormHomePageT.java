package com.demoqa.task;

import com.demoqa.models.Datainjection;
import com.demoqa.userinterface.FormHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FormHomePageT implements Interaction {
      Datainjection datainjection = new Datainjection();

    public static FormHomePageT in(String name) {

        return instrumented(FormHomePageT.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(datainjection.getFirstname()).into(FormHomePage.INPUT_FIRST_NAME));
        actor.attemptsTo(Enter.theValue(datainjection.getLastname()).into(FormHomePage.INPUT_LAST_NAME));
        actor.attemptsTo(Enter.theValue(datainjection.getEmail()).into(FormHomePage.INPUT_EMAIL));
        actor.attemptsTo(Click.on(FormHomePage.GENDER));
        actor.attemptsTo(Enter.theValue(datainjection.getNumberphone()).into(FormHomePage.INPUT_NUMBER_PHONE));
        actor.attemptsTo(Click.on(FormHomePage.SUBJECTS));
        actor.attemptsTo(Enter.keyValues(datainjection.getSubjets()).into(FormHomePage.SUBJECTS));
        actor.attemptsTo(Enter.keyValues(Keys.ENTER).into(FormHomePage.SUBJECTS));
        actor.attemptsTo(JavaScriptClick.on(FormHomePage.HOBBIES_CLICK));
        actor.wasAbleTo(Enter.keyValues(datainjection.getPath()).into(FormHomePage.UPLOAD_FILE));
        actor.attemptsTo(Enter.theValue(datainjection.getCurrenaddress()).into(FormHomePage.INPUT_CURRENT_ADDRESS));
        actor.attemptsTo(Enter.theValue(datainjection.getStatecity()).into(FormHomePage.STATE_AND_CITY));
        actor.attemptsTo(Enter.keyValues(Keys.ENTER).into(FormHomePage.STATE_AND_CITY));
        actor.attemptsTo(Enter.theValue(datainjection.getSelectcity()).into(FormHomePage.STATE_AND_CITY_1));
        actor.attemptsTo(Click.on(FormHomePage.BUTTON_SUBMIT));


    }
}
