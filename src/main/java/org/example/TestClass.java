package org.example;

import com.github.javafaker.Faker;

public class TestClass {

    public static void main(String[] args) {
        System.out.println("Hello, Team Leadich! Did you know that:");
        System.out.println(Faker.instance().chuckNorris().fact());
    }
}
