package Array;

public class BeregnSumToDim{
    public static void main(String[] args) {
        // Opret et to-dimensionelt array (3x3)
        int[][] toDimensioneltArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Beregn summen af alle elementerne i to-dimensionelt array
        int sum = beregnSum(toDimensioneltArray);

        // Udskriv resultatet
        System.out.println("Summen af alle elementerne i to-dimensionelt array er: " + sum);
    }

    // Metode til at beregne summen af alle elementerne i et to-dimensionelt array
    public static int beregnSum(int[][] array) {
        int sum = 0;
        // Gennemgå hver række i arrayet
        for (int i = 0; i < array.length; i++) {
            // Gennemgå hver kolonne i den aktuelle række
            for (int j = 0; j < array[i].length; j++) {
                // Tilføj værdien af det aktuelle element til summen
                sum += array[i][j];
            }
        }
        return sum;
    }
}
