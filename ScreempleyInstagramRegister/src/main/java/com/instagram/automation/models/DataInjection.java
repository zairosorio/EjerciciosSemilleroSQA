package com.instagram.automation.models;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataInjection {

    String fullname;
    String email;
    String username;
    String password;

    Faker faker = new Faker(new Locale("en-us"));


    public DataInjection(){
        this.fullname = faker.name().name();
        this.email = faker.internet().emailAddress();
        this.username = faker.name().username();
        this.password = faker.internet().password();

    }

    public String getPassword() {
        return password;
    }
    public String getFullname() {
        return fullname;
    }
    public String getEmail() {
        return email;
    }
    public String getUsername() {
        return username;
    }





}
