package be.intecbrussel;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Exercice4 {
    public static void main(String[] args) {
        // Zoek een manier om 2 waarden mee te geven
        // aan een Consumer en een Function. Je gaat hiervoor moeten googlen.
        BiConsumer<String, String> multipleParamConSumer = (String a, String b) ->
        {
            System.out.println("a :" + a);
            System.out.println("b :" + b);
        };
        BiFunction<Integer, Integer, Integer> multipleParamFunction = (Integer a, Integer b) -> a+b;
        multipleParamConSumer.accept("Mourki", "Mourak");
        System.out.println(multipleParamFunction.apply(5,6));
    }
}
