package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class BrugerIndput {
    public static void main (String[] args) throws FileNotFoundException{
        Scanner info = new Scanner(System.in);

        System.out.println("Indtast navn:");
        String navn1 = info.nextLine();
        System.out.println("Indtast alder");
        int alder1 = info.nextInt();
        info.nextLine();


        System.out.println("Indtast navn:");
        String navn2 = info.nextLine();
        System.out.println("Indtast alder");
        int alder2 = info.nextInt();

        TilFil(navn1, alder1);
        TilføjTilFil(navn2,alder2);
        FraFil();

    }
    public static void TilFil(String navn1, int alder1) throws FileNotFoundException{
        PrintStream Skriv = new PrintStream("Brugerinformation.txt");
        Skriv.println("Navn: " + navn1);
        Skriv.println("Alder: " + alder1);
        Skriv.close();

    }
    public static void FraFil() throws FileNotFoundException {
        File file = new File("Brugerinformation.txt");
        Scanner scan = new Scanner(file);
        while(scan.hasNextLine()){
            String line = scan.nextLine();
            System.out.println(line);
        }
        scan.close();
    }
    public static void TilføjTilFil(String navn2, int alder2) throws FileNotFoundException{
        PrintStream Skriv = new PrintStream(new FileOutputStream("Brugerinformation.txt",true));
        Skriv.println("Navn: " + navn2);
        Skriv.println("Alder: " + alder2);
        Skriv.close();
    }
}
