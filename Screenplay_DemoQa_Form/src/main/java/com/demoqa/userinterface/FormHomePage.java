package com.demoqa.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormHomePage {


    public static final Target INPUT_FIRST_NAME = Target.the("input first name").located(
            By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("input last name").located(
            By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("input email").located(
            By.id("userEmail"));
    public static final Target INPUT_NUMBER_PHONE = Target.the("input phone").located(
            By.id("userNumber"));
    public static final Target INPUT_BIRTH = Target.the("input birth").located(
            By.id("dateOfBirthInput"));
    public static final Target GENDER = Target.the("click gender ").located(
            By.xpath("//label[@for='gender-radio-1']"));
    public static final Target UPLOAD_FILE = Target.the("upload file").located(
            By.xpath("//input[@id='uploadPicture']"));
    public static final Target SUBJECTS = Target.the("click to subjects").located(
            By.id("subjectsInput"));
    public static final Target HOBBIES_CLICK = Target.the("click hobbies checkbox").located(
            By.xpath("//label[@for='hobbies-checkbox-1']"));
    public static Target INPUT_CURRENT_ADDRESS = Target.the("input current").located(
            By.id("currentAddress"));
    public  static final  Target STATE_AND_CITY = Target.the("select state and city").located(
            By.xpath("//input[@id='react-select-3-input' and @type='text']"));
    public  static final  Target STATE_AND_CITY_1 = Target.the("select state and city").located(
            By.xpath("//input[@id='react-select-4-input' and @type='text']"));
    public static final Target BUTTON_SUBMIT = Target.the("submit button").located(
            By.xpath("//button[@id='submit']"));









}
