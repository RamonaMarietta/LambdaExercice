package be.intecbrussel;

import java.util.function.Function;
import java.util.function.Supplier;
import java.util.Random;

public class Exercice3 {
    public static void main(String[] args) {
        //Maak Een Supplier die een randomNumber tussen 1en 4 genereert.
        // Die randomNumber wordt gebruikt in een Function.
        // Deze functie geeft je dan de correcte percentage waarde terug in een Sysout.
        // Bvb.: 1 -> 25%. 4-> 100%

        Supplier<Integer> randomSupplier = () -> new Random().nextInt(4) + 1;
        float rand = (float)randomSupplier.get();
        System.out.println("random: " + rand);
        Function<Float,Integer> percentageFunction = (Float r) -> Math.round((r/4) * 100);
        System.out.println("le pourcentage est: " + percentageFunction.apply(rand)+ "%");
    }
}



