package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandlingExample {
    public static void main(String[] args) throws FileNotFoundException {
        createInitialFile();
        ArrayList<Integer> numbersList = readFromFile();
        addToFile(numbersList);
        numbersList = readFromFile();

        System.out.println("Indholdet af ArrayList:");
        for (Integer number : numbersList) {
            System.out.print(number + ", ");
        }
    }

    // Metode til at oprette den oprindelige Numbers.txt fil med tallene 1-5
    public static void createInitialFile() throws FileNotFoundException {
        PrintStream skriv = new PrintStream(new FileOutputStream("FileHandlingExample.txt"));
        for (int i = 1; i <= 5; i++) {
            skriv.print(i + " ");
        }
        skriv.close();
        //System.out.println("Oprettet Numbers.txt med tallene 1-5");
    }

    // Metode til at læse fra Numbers.txt og tilføje til en ArrayList
    public static ArrayList<Integer> readFromFile() throws FileNotFoundException {
        ArrayList<Integer> numbersList = new ArrayList<>();
        Scanner scanner = new Scanner(new File("FileHandlingExample.txt"));
        while (scanner.hasNextInt()) {
            numbersList.add(scanner.nextInt());
        }
        scanner.close();
        return numbersList;
    }

    // Metode til at tilføje tallene 6-10 til Numbers.txt
    public static void addToFile(ArrayList<Integer> numbersList) throws FileNotFoundException {
        PrintStream skriv = new PrintStream(new FileOutputStream("FileHandlingExample.txt", true));
        for (int i = 6; i <= 10; i++) {
            skriv.print(i + " ");
        }
        skriv.close();
        //System.out.println("Tilføjet tallene 6-10 til Numbers.txt");
    }

}
