package KlasserObjekterBeer;

public class Beer {
    String name;
    String taste;
    String color;
    double alcohol;

    public Beer(String name, String taste, String color, double al){
        this.name = name;
        this.taste = taste;
        this.color = color;
        alcohol = al;
    }

    public String toString(){
        return ("Beer name: "+name+"\nTaste: "+taste+"\nColor: "+color+"\nAlcohol: "+alcohol);
    }
}