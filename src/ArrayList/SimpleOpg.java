package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SimpleOpg {
    public static void main(String[] args) {
        Arr();
        dyr();
        int[] Tal = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        TiElementer(Tal);
    }

    public static void TiElementer(int[] Tal) {
        for (int i = 0; i < Tal.length; i++) {
            System.out.print(Tal[i] + ", ");
        }
    }

    public static void Arr() {
        String[] names = {"Khadija", "Hans", "Jens"};
        Arrays.sort(names);
        for (String Names : names) {
            System.out.print(Names + ", ");
        }
    }
    public static void dyr(){
        ArrayList<String> Animal = new ArrayList<>();
        Animal.add("Løve");
        Animal.add("Giraf");
        Animal.add("Hund");
        Animal.add("Kat");
        Animal.add("Ko");
        Animal.remove(3);
        Collections.sort(Animal);
        for(int i = 0; i <Animal.size(); i++){
            System.out.print(Animal.get(i) + ", ");
        }
    }
}