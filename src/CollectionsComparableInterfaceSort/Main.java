package CollectionsComparableInterfaceSort;

import java.util.ArrayList;
import java.util.Collections;
//sorteret fra mindst til størst ved at bruge comparable interface
public class Main {
    public static void main(String[] args){
        ArrayList<Person> list = new ArrayList<>();
        Person Hans = new Person("Hans", 26);
        list.add(Hans);
        Person Khadija = new Person("Khadija", 20);
        list.add(Khadija);
        Person Riaz = new Person("Riaz", 47);
        list.add(Riaz);
        Person Per = new Person("Per", 11);
        list.add(Per);

        Collections.sort(list);
        for(Person person : list) {
            System.out.println(person);
        }
    }
}
