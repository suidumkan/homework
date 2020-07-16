package com.company;

public class DomRabbit extends Rabbit {
   private double weight;
   private String name;

    public DomRabbit(double health, Country country, Colors color,String name, double weight) {
        super(health, country, color);
        this.weight = weight;
        this.name = name;
    }

    public DomRabbit(double weight) {
        this.weight = weight;
    }

    public DomRabbit(double health, Country country, Colors color, String name) {
    }

    public double getWeight() {
        return weight;
    }

    public void makeVoice(String voice, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(voice);
        }
    }
    public final void makeVoice(int num, String voice) {
        for (int i = 0; i < num ; i++) {
            System.out.println(voice);
        }
    }
    public String printInfo(){
        return super.printInfo() +
                "\nВес кролика - " + getWeight();

    }

}
