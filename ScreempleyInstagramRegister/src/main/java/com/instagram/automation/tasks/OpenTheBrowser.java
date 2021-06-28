package com.instagram.automation.tasks;

import com.instagram.automation.userinterfaces.InstagramHomePage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import static  net.serenitybdd.screenplay.Tasks.instrumented;




public class OpenTheBrowser implements Task {

    private PageObject page;


    @Override
    @Step("{0} open the browser on Instagram Home page")
    public <T extends Actor> void performAs(T actor) {
      actor.attemptsTo(Open.browserOn(page));
    }

    public static OpenTheBrowser on(PageObject page){
        return instrumented(OpenTheBrowser.class, page);

    }
    public OpenTheBrowser(PageObject page){
        this.page = page;
    }
}
