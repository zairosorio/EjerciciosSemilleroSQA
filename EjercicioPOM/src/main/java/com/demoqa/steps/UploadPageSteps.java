package com.demoqa.steps;

import com.demoqa.models.DataInjection;
import com.demoqa.pageobjets.UploadPage;
import net.thucydides.core.annotations.Step;

import java.util.concurrent.TimeUnit;

public class UploadPageSteps {

  UploadPage uploadPage = new UploadPage();


@Step
    public void openBrowser(){
    uploadPage.open();
    }

    @Step
    public void uploadfile(){
    uploadPage.getDriver().manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
     uploadPage.sendFile(new DataInjection().getPath());
    }

    public void validation(){
    uploadPage.verify();

    }
    public void publicity(){
    uploadPage.closePublicity();
    }


}
