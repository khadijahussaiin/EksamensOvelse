package Array;
// Emne: Array/Multidimensionel/Traversering;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class CumulativeSumArrayy {
    public static void main(String[] args) throws FileNotFoundException {
        int[] Tal = {1, 2, 3, 4, 5};
        int sum = 0;

        print(Tal, sum);
        skrivTil(Tal, sum);
        FraFil();
    }

    public static void print(int[] Tal, int sum) {
        for (int i = 0; i < Tal.length; i++) {
            sum += Tal[i];
            System.out.println(sum);
        }
    }

    public static void skrivTil(int[] Tal, int sum) throws FileNotFoundException {
        PrintStream skriv = new PrintStream("ArrayFil.txt");
        for (int i = 0; i < Tal.length; i++) {
            skriv.println(Tal[i]);
        }
        skriv.println(sum);
        skriv.close();
    }

    public static void FraFil() throws FileNotFoundException {
        File file = new File("ArrayFil.txt");
        Scanner scan = new Scanner(file);
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            System.out.println(line);
        }
        scan.close();
    }
}