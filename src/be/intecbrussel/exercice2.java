package be.intecbrussel;

import java.util.function.Consumer;

public class exercice2 {
    public static void main(String[] args) {
        //Maak een Consumer Object waarbij dat je de leeftijd van de gebruiker moet vragen.
        // Als die jonger is dan 18 jaar, dan print de functie: “You’re too young!”
        // Als die ouder is dan 17 jaar, dant print de functie: “You’re too old.

        Consumer<Integer> consumer = (c)->{
            System.out.println("The age is:  "+ c);
            if ( c <= 18)
                System.out.println( "You’re too young! : "+ c);
            else
                System.out.println("Youre too old ! :" + c);
        };

        consumer.accept(38);
        consumer.accept(14);

    }
}
