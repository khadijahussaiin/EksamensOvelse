package Metoder;

public class Name {
    public static void main(String[] args) {
        // 1. Lav et array der hedder ”names” med 5 navne ”a”, ”b”, ”c”, ”d” og ”e”
        String[] names = {"a", "b", "c", "d", "e"};

        // 3. Parametre overfør ”names” og kald metoden
        printNames(names);
    }

    // 2. Lav en metode der hedder ”printNames” som kan printe navnene i arrayet
    public static void printNames(String[] names) {
        for (String name : names) {
            System.out.println(name);
        }
    }
}
