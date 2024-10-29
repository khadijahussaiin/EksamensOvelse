package Files;

import java.io.PrintStream;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;


public class Khadija {
    public static void main (String[] args) throws FileNotFoundException {

        PrintStream skriv = new PrintStream("Khadija.txt");
        skriv.println("In'sha'allah jeg får 12");
        skriv.println("Jeg misser aldig en bøn");
        skriv.println("In'sha'allah jeg klarer denne uddannelse med Allahs hjælp");

        skriv.close();

        File file = new File("Khadija.txt");
        Scanner scan = new Scanner(file);
        while(scan.hasNextLine()){
            String line = scan.nextLine();
            System.out.println(line);
        }
        scan.close();
    }

}
