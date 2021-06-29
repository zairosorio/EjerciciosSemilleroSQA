package com.demoqa.task;

import com.demoqa.userinterface.PublicityClosePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Visibility;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PublicityClose implements Task {

    PublicityClosePage publicityClose;

    public static PublicityClose close() {

        return instrumented(PublicityClose.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (Visibility.of(PublicityClosePage.PUBLICITY_ClOSE_BUTTON).viewedBy(actor).asBoolean()) ;
             actor.attemptsTo(Click.on(PublicityClosePage.PUBLICITY_ClOSE_BUTTON));
    }
}
