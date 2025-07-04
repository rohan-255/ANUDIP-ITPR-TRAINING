import java.util.Scanner;

// Base class 
public class Animal2 {
    // Method to make animal sound
    void makeSound() {
        System.out.println("The Animal makes sound");
    }
}

// Dog2 class inherits from Animal2 and overrides makeSound
class Dog2 extends Animal2 {
    @Override
    void makeSound() {
        System.out.println("The Dog barks");
    }
}

// Cat2 class inherits from Animal2 and overrides makeSound
class Cat2 extends Animal2 {
    @Override
    void makeSound() {
        System.out.println("The Cat meows");
    }
}

// Main class
class Animal2Main {
    public static void main(String[] args) {
        // Display menu to user
        System.out.println("Choose an Animal:");
        System.out.println("1. Dog");
        System.out.println("2. Cat");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt(); // Read user choice

        switch(choice) {
            case 1:
                Dog2 dog = new Dog2();
                dog.makeSound();
                break;
            case 2:
                Cat2 cat = new Cat2();
                cat.makeSound();
                break;
            default:
                Animal2 animal = new Animal2();
                animal.makeSound();
                break;
        }
        scanner.close(); // Close the scanner 
    }
}