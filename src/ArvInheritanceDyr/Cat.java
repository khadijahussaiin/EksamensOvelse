package ArvInheritanceDyr;

public class Cat extends Dyr {
    private String favoritLegetøj;

    public Cat(String navn, int alder, double vægt, String favoritLegetøj){
        super(navn, alder, vægt);
        this.favoritLegetøj= favoritLegetøj;
    }
    @Override
    public String lyd(){
        return "miav";
    }
    @Override
    public String toString() {
        return super.toString() + ", Favorit Legetøj: " + favoritLegetøj;
    }
}