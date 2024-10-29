package Loops;

public class FireLoops {
    public static void main (String[] args) {
        ForLoop();
        System.out.println();
        ArrayLoop();
        System.out.println();
        WhileLoop();
        System.out.println();
        DoWhileLoop();
    }

    public static void ForLoop() { //1. Lav et loop der printer 1, 2, 3, 4, 5
        for(int i =1; i<=5;i++) {
            System.out.println(i);
        }
    }
    public static void ArrayLoop(){
        /*2. lav et array med numrene 1, 2, 3, 4, 5*/
        /*3. lav et for each loop til at lave en cumulative sum med arrayet.*/
        int[] Tal = {1, 2, 3, 4, 5};
        int cumulativeSum = 0;
        for (int number : Tal) {
            cumulativeSum += number;
            System.out.print(cumulativeSum + " ");
        }
    }
    /*5. lav en counter med et while loop der tæller op til 5 og hopper
    ud af loopet når den rammer*/
    public static void WhileLoop(){
        int i= 0;
        while(i<=5){
            System.out.println("Counter: " + i);
            i++;
        }
    }
    //6. Gør det med en do while loop
    public static void DoWhileLoop(){
        int i= 0;
        do {
            System.out.println("Counter: " + i);
            i++;
        }while(i<=5);
    }
}
