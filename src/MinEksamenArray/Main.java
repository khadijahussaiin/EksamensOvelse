package MinEksamenArray;

import java.util.Arrays;
public class Main {
    public static void main(String[] args){
        Student student = new  Student("Peter", 180);//3. skulle lave objekt student med navn og højde


        int[][] Tal = new int[2][4];//4. lave dette multidimensionel array og printe det ud
        Tal[1][2]=5;
        System.out.println(Arrays.deepToString(Tal));

        String[] myString ={"Peter", "Hans", "Jørgen"}; //1. Han vil starte med at have mig til at lave dette Array
        arr(myString);//2. metodekald til at print navnet Hans ud
    }
    public static void arr(String[] myString){
        for(int i=0 ; i<myString.length ; i++){
            if(myString[i].charAt(0)=='H'){
                System.out.println(myString[i]);
                //2.Derefter skulle jeg printe navne i arrayet ud men kun navne som starter med H (Hans)
                //Dette gjorde i denne metode hvor jeg lavede en metodekald
            }
        }
    }
}
