package Metoder;

public class MyMethods{
    public static void main(String[] args){
        printNavn();
    }
    public static void printNavn(){
        forNavn();
        efterNavn();
        udregnAlder(2024, 1996);
    }
    public static void forNavn(){
        System.out.println("Peter");
    }
    public static void udregnAlder(int nu, int født){
        int alder = nu - født;
        System.out.println("Han er: "+alder+" år gammel");
    }
    public static void efterNavn(){
        System.out.println("Hansen");
    }
}
