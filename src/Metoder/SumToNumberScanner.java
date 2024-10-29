package Metoder;

import java.util.Scanner;

public class SumToNumberScanner {
    public static void main (String[] args){
        sumToNumber();
        System.out.println();
        int result = multiplyToNumber();
        System.out.println("Result: " + result);

    }
    /* Write a program to print the sum of two numbers entered by user by defining your
    own method. */
    public static void sumToNumber(){
        Scanner scan = new Scanner(System.in);
        int x,y;
        System.out.print("Enter number: ");
        x = scan.nextInt();
        System.out.print("Enter number: ");
        y = scan.nextInt();
        System.out.println("Sum er: " + (x+y));
    }
    /* Define a method that returns the product of two numbers entered by user*/
    public static int multiplyToNumber(){
        int x,y;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        x =scan.nextInt();
        System.out.println("Enter another number");
        y = scan.nextInt();
        return x*y;
    }
}
