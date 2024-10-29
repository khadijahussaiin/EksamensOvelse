package ArvInheritanceDyr;

public class Dyr {
    private String navn;
    private int alder;
    private double vægt;

    public Dyr(String navn, int alder, double vægt) {
        this.navn = navn;
        this.alder = alder;
        this.vægt = vægt;
    }
    public String getnavn(){
        return navn;
    }
    public void setNavn(String navn){
        this.navn = navn;
    }

    public String lyd() {
        return "Dyrelyd";
    }

    // toString metode til at udskrive dyrets information
    @Override
    public String toString() {
        return "Navn: " + navn + ", Alder: " + alder + ", Vægt: " + vægt;
    }
}
