package ArvInheritanceDyr;

public class Hund extends Dyr{
    private String Race;
    public Hund(String navn, int alder, double vægt, String Race){
        super (navn, alder, vægt);
        this.Race = Race;
    }
    @Override
    public String lyd(){
        return "wof";
    }
    public String toString(){
        return super.toString() + "Race: " + Race;
    }
}
