package com.company;

import java.util.Random;

public class Rabbit {
    private int age = generateDefaultAge();
    private double health;
    private Country country;
    private Colors color;

    public Rabbit( double health, Country country, Colors color) {
        this.health = health;
        this.country = country;
        this.color = color;
    }

    public Rabbit() {
    }

    public Rabbit(String name, double weight, Country country, Colors color) {
    }

    public int getAge() {
        return age;
    }

    public double getHealth() {
        return health;
    }

    public Country getCountry() {
        return country;
    }

    public Colors getColor() {
        return color;
    }
    private int generateDefaultAge(){
        Random random = new Random();
        return random.nextInt(3);
    }
    public void makeVoice(int number, String voice) {
        for (int i = 0; i < number ; i++) {
            System.out.println(voice);
        }
    }
    public String printInfo(){
        return "Возраст кролика - " + generateDefaultAge()+
                "\nЗдоровье кролика - " + getHealth() +
                "\nСтрана - " + getCountry() +
                "\nЦвет кролика - " + getColor();
    }

}
