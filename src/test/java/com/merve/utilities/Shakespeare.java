package com.merve.utilities;

import com.github.javafaker.Faker;


public class Shakespeare {


    public static String quote() {

        Faker faker = new Faker();

        return faker.shakespeare().romeoAndJulietQuote();


    }

}
