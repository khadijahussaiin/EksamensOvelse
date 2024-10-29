package ArvInheritanceMedia;
//Superklasse
public class Media {
    private String titel;
    private int year;
    private int copies;

    public Media(String titel, int year, int copies){
        this.titel=titel;
        this.year=year;
        this.copies=copies;
    }
    public String toString(){
        return "Titel: " + titel + " Year: " + year + " Copies: " + copies;
    }
}
