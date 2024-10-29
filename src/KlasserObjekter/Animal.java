package KlasserObjekter;

public class Animal {
    private String type;
    private double højde;
    private String farve;

    public Animal(String type, double højde, String farve){
        this.type = type;
        this.højde = højde;
        this.farve = farve;
    }

    public String getType(){
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getHøjde() {
        return højde;
    }

    public void setHøjde(double højde){
        this.højde = højde;
    }

    public String getFarve(){
        return farve;
    }

    public void setFarve(String farve){
        this.farve=farve;
    }
    public static void makeSound(){
        System.out.println("Dyrelyd");
    }

    public String toString() {
        return "Type: " + type + ", Højde: " + højde + " cm, Farve: " + farve;
    }
}
