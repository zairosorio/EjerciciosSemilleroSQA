package com.demoqa.models;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataInjection {

    Faker faker = new Faker(new Locale("en-US"));

    private  String path,filename,directory,fake;


    public String getfake(){
        return fake;
    }

    public String getPath() {
        return path;
    }
    public String getFilename() {
        return filename;
    }
    public  String getDirectory(){
        return directory;
    }
    public DataInjection(){
        this.directory = "C:\\Users\\Zair.Osorio\\Downloads\\";
        this.filename = "rad.png";
        this.path = (directory+filename);
        System.out.println("ruta archivos"+ path);



    }

}
