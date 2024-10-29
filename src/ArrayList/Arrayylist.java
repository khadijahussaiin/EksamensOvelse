package ArrayList;

import java.util.ArrayList;
import java.util. Collections;

public class Arrayylist {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<>();
        names.add("Khadija");
        names.add("Sara");
        names.add("Sofie");
        names.add("Hanne"); //index 3
        names.add("Anne");

        names.set(3, "Hans"); //ændre navnet index 3 fra hanne til Hans således;

        printNames(names);
    }
    public static void printNames(ArrayList<String>names){
        Collections.sort(names);
        for(String print : names) {
            System.out.println(print);
        }
    }
}
