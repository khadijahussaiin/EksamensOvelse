package KlasserObjekterBeer;

public class Main {
    public static void main(String[] args) {
        Beer Tuborg = new Beer("Tuborg", "nice", "light", 5.2);
        Beer Hof = new Beer("Hof", "bitter", "dark", 5.6);
        Beer Brown = new Beer("Brown", "sweet", "dark", 7.2);
        Beer DarkBrown = new Beer("DarkBrown", "RellySweet", "reallyDark", 9.2);

        Beer[] beers = new Beer[4];

        beers[0] = Tuborg;
        beers[1] = Hof;
        beers[2] = Brown;
        beers[3] = DarkBrown;

        for(int i = 0; i < beers.length; i++){
            System.out.println(beers[i]);
            System.out.println();
        }
        System.out.printf("The avarage alchol procent is: %.2f", AvAlcohol(beers));

    }
    public static double AvAlcohol(Beer[] myBeers){
        int count = 0;
        double sum = 0;
        for (int i = 0; i < myBeers.length; i++){
            sum += myBeers[i].alcohol;
            System.out.println(myBeers[i].alcohol);
            //count++;
        }
        return sum/myBeers.length;

    }
}
