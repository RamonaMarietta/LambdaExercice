import java.util.Arrays;
import java.util.stream.Stream;





public class Exercice6 {
    public static void main(String[] args) {
        //Plaats deze array in een nieuwe array(Gebruik toArray). Alle dieren moeten in lowercase staan,
        // En je houdt enkel de dieren die de letter ‘a’ in hun naam hebben.
        //// Bonus: Je gaat nu ook de array moeten sorteren op basis van de lengte van het woord. (Hint: Comparator.)

        String [] animals = {"Cow","ShaRk", "DOg","PirAnha", "MouSE", "CaT","ParRoT","DOLphin"};
        String [] stream = Arrays.stream(animals)
        .map(String::toLowerCase)
                .filter(word -> word.contains(("a")))
                .toArray (String[] ::new);

                for (String a : stream){
                    System.out.println(a);
                }


        // .forEach(word -> System.out.println(word))










    }
}
