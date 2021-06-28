package models;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataInjections {

    Faker faker = new Faker(new Locale("en-us"));

    public String getEmail() {
        return email;
    }

    String email;

    public DataInjections(){
        this.email = faker.internet().emailAddress();

    }






}
