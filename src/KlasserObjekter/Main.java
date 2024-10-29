package KlasserObjekter;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> List = new ArrayList<>();

        Animal animal1 = new Animal("Giraf", 500, "Gul");
        List.add(animal1);

        Animal animal2 = new Animal("Elefant", 250, "grå");
        List.add(animal2);

        Animal animal3 = new Animal("polarbjørn", 220, "hvid");
        List.add(animal3);

        System.out.println(animal1.getType());
        Animal.makeSound();
        for (Animal print : List) {
            System.out.println(print);
        }
    }
}
