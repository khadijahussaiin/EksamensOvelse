package IfElseSwitch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class AlderIfElse {
    public static void main (String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);

        System.out.println("Indtast din alder: ");
        int alder = scan.nextInt();

        if(alder<13){
            System.out.println("Du er et barn da du er under 13");
        } else if(alder>=13 && alder<= 19){
            System.out.println("Du er en teenager");
        } else{
            System.out.println("Du er voksen");
        }

        PrintStream skriv = new PrintStream("Alderchecker.txt");
        skriv.println("Alder: " + alder);
        skriv.close();

        File file = new File("Alderchecker.txt");
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            System.out.println(line);
        }
        scanner.close();

    }
}

