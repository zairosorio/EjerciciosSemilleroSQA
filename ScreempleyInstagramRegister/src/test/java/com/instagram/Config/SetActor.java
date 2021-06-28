package com.instagram.Config;

import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class SetActor {

    public void setActor(){
        OnStage.setTheStage(new OnlineCast());

    }

}
