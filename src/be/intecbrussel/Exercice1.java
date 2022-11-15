package be.intecbrussel;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Exercice1 {
    public static void main(String[] args) {
        //Doe de voorbeeldjes na van de Consumer, Supplier, Function en Runnable.

        Consumer consumer = (c)->
        System.out.println("The number is  " + c);

        consumer.accept (10);

        Supplier<Double> randomValue = () -> Math.random();

        System.out.println(randomValue.get());

        Function <String,Integer> nameDeType = (String a) -> a.length();
        System.out.println(nameDeType.apply("Le nombre de lettre"));

        Runnable r1 = new Runnable() {
            @Override
            public void run() { //anonymous class
                System.out.println(" Runnable Anonymous Class ");
            }
        };
        Runnable r2 = () -> {   // lambda expression
            System.out.println("Runnable with Lambda Expression");
        };
        new Thread(r1).start();
        new Thread(r2).start();
    }
}





