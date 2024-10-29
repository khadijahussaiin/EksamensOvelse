package IfElseSwitch;
import java.util.Scanner;

public class PointCheckerIfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Hvor mange point fik du");
        int Point = scan.nextInt();

        if (Point < 20) {
            System.out.println("Du er i den lave ende");
        } else if(Point>20){
            System.out.println("Du ligger lavet");
        } else if (Point >75){
            System.out.println("Du ligger i middel");
        }else{
            System.out.print("Du ligger højjt");
        }
    }
}
