package ArvInheritanceDyr;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Dyr> List = new ArrayList<>();
        Hund hund1 = new Hund("Bella", 3, 15.5, "Labrador");
        List.add(hund1);
        Cat cat1 = new Cat("Misser", 2, 4.2, "Bold");
        List.add(cat1);
        Hund hund2 = new Hund("Max", 5, 20.3, "Schæferhund");
        List.add(hund2);
        Cat cat2 = new Cat("Luna", 1, 3.8, "Mus");
        List.add(cat2);

        hund1.setNavn("Hej");

        //for (int i = 0; i < List.size(); i++) {
        //System.out.println(List.get(i));
        for (Dyr dyr : List) {
            System.out.println(dyr);
            System.out.println(dyr.lyd());

        }
    }
}

/*   Opret en liste (ArrayList) af forskellige dyreobjekter (Hund og Kat).
Iterer over listen og kald lyd() metoden for hvert dyr for at demonstrere polymorfisme. */
