
// Interface E
interface E {
    // Interface method declaration
  void interfaceMethod();
}

// Base class B
class Bat {
  void methodB() {
    System.out.println("Bat - I am a mammal");
  }
}

// Class A extends B and implements E
class GermanSheperd extends Bat implements E {
  void methodA() {
    System.out.println("GermanSheperd - I am a dog");
  }

  @Override
  public void interfaceMethod() {
    System.out.println("GermanSheperd - I bark");
  }
}

// Class D extends A
class GunDog extends GermanSheperd {
  void methodD() {
    System.out.println("GunDog - I am a golden retriever");
  }
}

// Class C extends D and implements E
class HomeDog extends GunDog implements E {
  void methodC() {
    System.out.println("HomeDog - I am Max");
  }
}

public class Inheritance{
  public static void main(String[] args) {
    HomeDog myObject = new HomeDog();

    myObject.methodB(); // Accessing method from class B
    System.out.println(); // Add spacing for better readability

    myObject.methodA(); // Accessing method from class A
    System.out.println(); // Add spacing for better readability

    myObject.methodD(); // Accessing method from class D
    System.out.println(); // Add spacing for better readability

    myObject.methodC(); // Accessing method from class C
    System.out.println(); // Add spacing for better readability

    myObject.interfaceMethod(); // Accessing the interface method implemented in class C
  }
}