package Interface;

public class Main {
    public static void main (String[] args){
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Printing sounds of each animal
        System.out.println("Dog says: " + dog.makeSound());
        System.out.println("Cat says: " + cat.makeSound());
    }
}
