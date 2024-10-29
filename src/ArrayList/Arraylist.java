package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
    public static void main (String[]args){
        Array();
        System.out.println();
        Arraylis();
    }
    public static void Array(){
        String[] Bogstaver = new String [5];
        Bogstaver [0]= "a";
        Bogstaver [1]="b";
        Bogstaver [2]= "c";
        Bogstaver [3] = "d";
        Bogstaver [4] = "e";
        System.out.println(Bogstaver[3]); //kun index 2 printes ud
        for(int i = 0; i<Bogstaver.length; i++){
            System.out.print(Bogstaver[i] + ", ");
        }
    }
    public static void Arraylis(){
        ArrayList <String> Bg = new ArrayList<>();
        Bg.add("d");
        Bg.add("c");
        Bg.add("e");
        Bg.add("a");
        Bg.add("b");

        System.out.println(Bg.get(2)); //Sådan printer man kun index 2 ud
        Collections.sort(Bg);
        //System.out.print(Bg.toString());
        for (String print:Bg){
            System.out.print(print + ", ");
        }
    }
}
