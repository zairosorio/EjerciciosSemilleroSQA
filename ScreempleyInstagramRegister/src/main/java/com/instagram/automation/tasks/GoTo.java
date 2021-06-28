package com.instagram.automation.tasks;

import com.instagram.automation.userinterfaces.InstagramAppsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class GoTo implements Task {

    private Target instagramApp;

    public  GoTo (Target instagramApp){
        this.instagramApp = instagramApp;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

actor.attemptsTo(Click.on(InstagramAppsPage.INSTAGRAM_APPS));


    }

    public static GoTo theApp(Target instagramApp) {

        return Tasks.instrumented(GoTo.class, instagramApp);
    }
}
