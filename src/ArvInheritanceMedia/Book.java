package ArvInheritanceMedia;
//subklasse
public class Book extends Media{
    private String author;
    private int ISBN;

    public Book(String titel, int year, int copies, String author, int ISBN){
        super(titel, year, copies);
        this.author=author;
        this.ISBN=ISBN;
    }
    @Override
    public String toString(){
        return super.toString() + " Author; " + author + " ISBN: " + ISBN;
    }
}
