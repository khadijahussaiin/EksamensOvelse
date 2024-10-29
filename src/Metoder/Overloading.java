package Metoder;

public class Overloading{
    public static void main(String[] args){
        printNumbers(22, 33);
        System.out.println();
        printNumbers(22, 33, 88);

    }
    public static void printNumbers(int a, int b){
        System.out.println(a+" "+b);
    }
    public static void printNumbers(int a, int b, int c){
        System.out.println(a+" "+b+" "+c);
    }
}
/*Overloading handler om metoder med samme navn men forskellige parametre, mens
parameteroverførsel handler om hvordan værdier overføres til disse metoder.*/
