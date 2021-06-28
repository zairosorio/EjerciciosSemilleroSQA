package com.instagram.automation.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;



public class InstagramFormPage {

    public static  final Target INPUT_PHONE_OR_EMAIL = Target.the("Input Phone or Email")
            .located(By.name("emailOrPhone"));

    public static final Target INPUT_FULL_NAME = Target.the("Input full name")
            .located(By.name("fullName"));

    public static final Target INPUT_NAME_USER = Target.the("username")
            .located(By.name("username"));

    public static final Target IMPUT_PASSWORD = Target.the("//input[@name='password']")
            .locatedBy("//input[@name='password']");

    public static final Target CLICK_BUTTON_REGISTER = Target.the("//button[@class='sqdOP  L3NKy   y3zKF     'and @type='submit']")
            .locatedBy("//button[@class='sqdOP  L3NKy   y3zKF     'and @type='submit']");
}
