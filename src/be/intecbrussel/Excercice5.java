package be.intecbrussel;

import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class Excercice5 {
    public static void main(String[] args) {
        //We gaan lambda’s nu toepassen op Streams. Copy Paste volgende lijn,
        // en vul de Stream aan met lambdas.
        // Je gaat enkel de getallen afprinten die deelbaar zijn door 8, nadat je ze gedeeld hebt door 4:

        IntStream.of(5,8,640,1111,27,16)

                .map(numbers -> numbers / 4)
                .filter(numbers -> numbers % 8 == 0)
                .forEach(numbers -> System.out.println(numbers));

    }
}
