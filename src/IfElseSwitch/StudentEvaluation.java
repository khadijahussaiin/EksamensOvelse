package IfElseSwitch;

import java.util.Scanner;

public class StudentEvaluation {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("**Student Evaluation System**");
        System.out.println();
        System.out.println("What is the name of the student");
        String name = scan.next();

        System.out.println("how many execises did the student make?");
        int exMade = scan.nextInt();

        System.out.println("how many exercises should the student have made?");
        int numEx = scan.nextInt();

        studentEval(name, numEx, exMade);

    }

    public static void studentEval(String name, int numEx, int exMade){
        double pMade = (double)exMade / numEx * 100;
        if(pMade < 25){
            System.out.println("The student is lazy");
        }
        else if(pMade < 50){
            System.out.println("The student is behind");
        }
        else if(pMade <= 75){
            System.out.println("The student is diligently");
        }
        else{
            System.out.println("The student is outstanding");
        }
    }
}
