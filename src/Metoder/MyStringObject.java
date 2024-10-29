package Metoder;

public class MyStringObject{
    public static void main(String[] args){
        String name = "Copenhagen";
        char letter = 'g';

        myCharAt(name, letter);

    }
    public static void myCharAt(String name, char letter){
        for(int i = 0; i < name.length();i++){
            if(name.charAt(i) == letter){
                System.out.println("The letter is "+letter+" is at position "+i);
            }
        }
    }

}
