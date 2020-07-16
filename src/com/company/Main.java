package com.company;

public class Main {

    public static void main(String[] args) {
        DomRabbit domRabbit = new DomRabbit( 80.0, new Country ("Spain", "Wait-3"), Colors.BROWN, "Rey", 3.0);
        domRabbit.makeVoice("Squeak", 5);
        System.out.println(domRabbit.printInfo());

        System.out.println("____________________________________________");


        WildRabbit wildRabbit = new WildRabbit(75.8, new Country("Livan", "Huala-2"), Colors.WHITE, "Bernir", 13.4, 37);
        System.out.println(wildRabbit.printInfo());
        wildRabbit.makeVoice(2, "Squeak");

        System.out.println("_____________________________________________");


    }

}
