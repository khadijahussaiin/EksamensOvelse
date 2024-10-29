package IfElseSwitch;

import java.util.Scanner;

public class LommeregnerSwitchhIfElse {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        double tal1 = scan.nextDouble();

        System.out.println("Enter antoher number");
        double tal2 = scan.nextDouble();

        System.out.println("Enter an operator (+,-,*, /)");
        char operator = scan.next().charAt(0);

        double result;

        switch(operator){
            case '+':
                result = tal1 + tal2;
                System.out.println("Result is; " +result);
                break;
            case '-':
                result = tal1 - tal2;
                System.out.println("Result is; " +result);
                break;
            case '*':
                result = tal1 * tal2;
                System.out.println("Result is; " +result);
                break;
            case '/':
                if(tal2 != 0) {
                    result = tal1 / tal2;
                    System.out.println("Result is; " + result);
                }else{
                    System.out.println("Error! Division by 0 is not allowed");
                }
                break;
            default:
                System.out.println("Invalide, operator not allowed");
                return;
        }
    }
}
