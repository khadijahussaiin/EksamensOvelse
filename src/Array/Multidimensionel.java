package Array;
// Emne: Array/Multidimensionel/Traversering;

public class Multidimensionel {
    public static void main(String[] args) {
        ToDim();
        print();

    }

    public static void ToDim() {
        // Oppretter en 3x3 matrix og initialiser den med tallene 1-9
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        // Skriv ud matrixen
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void print(){
        int[][] Tal = {{1,2,3}, {4,5,6}};
        for(int i=0; i <Tal.length; i++){
            for(int j = 0; j < Tal[i].length; j++){
                System.out.print(Tal[i][j]);
            }

        }
    }
}
