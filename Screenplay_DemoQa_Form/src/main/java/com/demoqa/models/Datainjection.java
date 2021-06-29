package com.demoqa.models;

import com.github.javafaker.Faker;

import java.util.Locale;

public class Datainjection {



    String firstname;
    String lastname;
    String email;
    String numberphone;
    String dateofbirth;
    String subjets;
    String currenaddress;
    String statecity;
    String selectcity;


    public String getPath() {
        return path;
    }

    String path;


    Faker faker = new Faker(new Locale("en-us"));

    public Datainjection(){

        this.path = "C:\\Users\\Zair.Osorio\\Downloads\\sampleFile.jpeg";
        this.firstname = faker.name().name();
        this.lastname = faker.name().firstName();
        this.email = faker.internet().emailAddress();
        this.numberphone = faker.phoneNumber().cellPhone();
       this.dateofbirth = faker.date().birthday().toString();
       this.currenaddress = faker.address().fullAddress();
       this.subjets = "English";
       this.statecity = "Haryana";
       this.selectcity = "Karnal";

    }



    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getNumberphone() {
        return numberphone;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public String getSubjets() {
        return subjets;
    }

    public String getCurrenaddress() {
        return currenaddress;
    }

    public String getStatecity() {
        return statecity;
    }

    public String getSelectcity() {
        return selectcity;
    }











}
