package com.demoqa.pageobjets;


import com.demoqa.models.DataInjection;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;


@DefaultUrl("https://www.demoqa.com/upload-download")

public class UploadPage extends PageObject {


       DataInjection dataInjection = new DataInjection();

       public By btnUpload = By.xpath("//input[@class='form-control-file']");
       public By filename = By.xpath("//p[@id='uploadedFilePath']");
       public By publicity = By.xpath("//img[@src='https://ad.plus/adplus-advertising.svg']");

    public void sendFile(String String){
       getDriver().findElement(btnUpload).sendKeys(String);
       dataInjection.getfake();
    }

    public void closePublicity(){
        getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        if (getDriver().findElement(publicity).isEnabled()){
            getDriver().findElement(publicity).click();
        }
    }
    public void verify(){
        Assert.assertEquals("C:\\fakepath12\\"+dataInjection.getFilename(),
                getDriver().findElement(filename).getText());
    }


    }





