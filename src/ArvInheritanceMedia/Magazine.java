package ArvInheritanceMedia;
//subklasse
public class Magazine extends Media {
    private int issueNumber;

    public Magazine(String titel, int year, int copies, int issueNumber) {
        super(titel, year, copies);
        this.issueNumber= issueNumber;

    }

    @Override
    public String toString() {
        return super.toString() + " issueNumber; " + issueNumber;
    }
}

