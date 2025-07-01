class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}   
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}


class runtimePOLY {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Animal animal = dog; // Upcasting
        Animal ani=new Animal(); // Creating an instance of Animal
        ani.sound(); // Calls Animal's sound method
        animal.sound(); // Calls Dog's sound method due to runtime polymorphism
        dog.sound();
    }
}
