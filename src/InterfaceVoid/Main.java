package InterfaceVoid;

import java.util.ArrayList;

public class Main {
    public static void main (String[] args){
        ArrayList<Dyr> List = new ArrayList<>();
//instanser af objekterne oprettes
        Hund hund =new Hund();
        List.add(hund);

        Fugl fugl = new Fugl();
        List.add(fugl);

        //såleds printes mine interface metoder ud
        hund.lyde();
        System.out.println();
        hund.bevægelse();
        System.out.println();
        fugl.lyde();
        System.out.println();
        fugl.bevægelse();


    }
}