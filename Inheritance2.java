// Define an Animal interface with a method called sound
interface Animal {
    void sound();
}

// Define the Cow class that implements the Animal interface
class Cow implements Animal {
    // Implement the sound method for Cow
    public void sound() {
        System.out.println("Cows moo");
    }
}

// Define the Horse class that implements the Animal interface
class Horse implements Animal {
    // Implement the sound method for Horse
    public void sound() {
        System.out.println("Horses neigh");
    }
}

// Define the Cat class that implements the Animal interface
class Cat implements Animal {
    // Implement the sound method for Cat
    public void sound() {
        System.out.println("Cats meow");
    }
}

// Define the Dog class that implements the Animal interface
class Dog implements Animal {
    // Implement the sound method for Dog
    public void sound() {
        System.out.println("Dogs bark");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        // Create objects of each class
        Animal cow = new Cow();
        Animal horse = new Horse();
        Animal cat = new Cat();
        Animal dog = new Dog();

        // Call the sound method on each object
        System.out.println("Cow:");
        cow.sound();

        System.out.println("Horse:");
        horse.sound();

        System.out.println("Cat:");
        cat.sound();

        System.out.println("Dog:");
        dog.sound();
    }
}
