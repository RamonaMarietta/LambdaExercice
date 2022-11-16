package be.intecbrussel;

import java.util.stream.Stream;

public class Exercice7 {
    public static void main(String[] args) {


        ShoePair nike = new ShoePair("Nike",false,"white", 41, 69.99);
        ShoePair timberLand = new ShoePair("TimberLand",true,"brown", 41, 219.99);
        ShoePair balenciaga = new ShoePair("Balenciaga",true,"black", 45, 429.99);

        ShoePair nike2 = new ShoePair("Nike",true,"white", 42,29.99);
        ShoePair timberLand2 = new ShoePair("TimberLand",true,"black", 39, 170);
        ShoePair balenciaga2 = new ShoePair("Balenciaga",false,"black", 45, 50);
        ShoePair nike3 = new ShoePair("Nike",true,"white", 41, 79.99);
        ShoePair timberLand3 = new ShoePair("TimberLand",true,"yellow", 41, 80);
        ShoePair balenciaga3 = new ShoePair("Balenciaga",false,"black", 37, 349.99);



        ShoePair [] shoePairs = {nike,timberLand,balenciaga,nike2,timberLand2,
                balenciaga2,nike3,timberLand3,balenciaga3};

        Stream.of(shoePairs)
                .filter(shoePair ->shoePair.getSize()==41  )
                .filter(ShoePair::isComplete)
                .forEach(System.out::println);


    }
}
