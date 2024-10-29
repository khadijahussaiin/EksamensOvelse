package ArvInheritanceMedia;
//subklasse
public class Newspaper extends Media {
    private String publisher;

    public Newspaper(String titel, int year, int copies, String publisher){
        super(titel, year, copies);
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return super.toString() + " publisher; " + publisher;
    }
}
