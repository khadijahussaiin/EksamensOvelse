package IfElseSwitch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class CalculatorSwitch {
    public static void main (String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        double tal1 = scan.nextDouble();

        System.out.println("Enter another number");
        double tal2 = scan.nextDouble();

        System.out.println("Choose a operator (+,-,*,/)");
        char operator =scan.next().charAt(0);

        double result;

        switch(operator) {
            case '+':
                result = tal1 + tal2;
                break;
            case '-':
                result = tal1 - tal2;
                break;
            case '*':
                result = tal1 * tal2;
                break;
            case '/':
                result = tal1 / tal2;
                break;
            default:
                System.out.println("Invalid");
                return;
        }
        System.out.println("The result is; " + result);
        TilFil(tal1, tal2, operator, result);
    }
    public static void TilFil(double tal1, double tal2, char operator, double result) throws FileNotFoundException {
        PrintStream skriv = new PrintStream("Operator.txt");
        skriv.println(result);
        skriv.close();

        File file = new File("Operator.txt");
        Scanner scan= new Scanner(file);
        while(scan.hasNextLine()){
            String line = scan.nextLine();
            System.out.println(line);
        }
        scan.close();
    }
}
