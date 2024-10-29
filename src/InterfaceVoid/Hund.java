package InterfaceVoid;

public class Hund implements Dyr{
    @Override
    public void lyde(){
        System.out.print("Hunden gør");

    }
    @Override
    public void bevægelse() {
        System.out.print("Hunden løber");
    }
}
