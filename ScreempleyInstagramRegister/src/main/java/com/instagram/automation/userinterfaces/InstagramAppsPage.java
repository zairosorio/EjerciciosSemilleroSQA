package com.instagram.automation.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InstagramAppsPage {

    public static   Target INSTAGRAM_APPS = Target.the("INSTAGRAM REGISTER").
                                        located(By.xpath("//a[@href='/accounts/emailsignup/']"));




}
