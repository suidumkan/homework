package com.company;

public final class WildRabbit extends DomRabbit {

    private int height;


    public WildRabbit(double health, Country country, Colors color, String name, double weight, int height) {
        super(health, country, color, name, weight);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }


    public void makeVoice(String voice, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(voice);
        }
    }

    @Override
    public String printInfo() {
        return super.printInfo() +
                " \nРост - " + getHeight();
    }
}