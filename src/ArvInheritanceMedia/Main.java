package ArvInheritanceMedia;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Media> List = new ArrayList<>();

        Book Hp = new Book("Harry potter", 2005, 1000, "jk Rowling", 4373);
        List.add(Hp);

        Magazine Vu = new Magazine("Vi unge", 2024,100,83923);
        List.add(Vu);

        Newspaper SH = new Newspaper("Se og hør", 2000, 100, "berlinske");
        List.add(SH);

        //Collections.sort();
        for(Media print:List) {
            System.out.println(print);
        }
    }
}