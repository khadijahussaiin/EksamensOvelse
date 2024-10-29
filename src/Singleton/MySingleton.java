package Singleton;

public class MySingleton {
    private static MySingleton theInstance = null;

    // Privat konstruktør for at forhindre oprettelse af objekter uden for klassen
    private MySingleton() {
    }

    // Offentlig metode til at få adgang til den eneste instans
    public static MySingleton getInstance() {
        if (theInstance == null) {
            theInstance = new MySingleton();
        }
        return theInstance;
    }
}

