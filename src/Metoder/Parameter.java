package Metoder;

import java.util.Scanner;

public class Parameter{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String name;
        int daysInMonth;
        int birthday;

        System.out.println("indtast navn");
        name = scan.next();

        System.out.println("Enter number of days in birthmonth");
        daysInMonth = scan.nextInt();

        System.out.println("Enter the month day of your birthday");
        birthday = scan.nextInt();

        int number;

        //name = "Claus";
        //number = 7;
        System.out.println("Number of times name should be printed: "+ findDays(daysInMonth, birthday));
        myPrint(name, findDays(daysInMonth, birthday));
    }
    public static void myPrint(String name, int nu){
        for(int i = 1; i <= nu; i++){
            System.out.println(name);
        }
    }

    public static int findDays(int daysInMonth, int birthday){
        return daysInMonth - birthday;
    } //Denne kode minusser hvor mange dage der er i måneden med fødselsdato

}