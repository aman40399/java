8. Write a program in java to demonstrate multi level inheritance in java.

// Base class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Intermediate class (inherits from Animal)
class Mammal extends Animal {
    void walk() {
        System.out.println("This mammal walks on land.");
    }
}

// Derived class (inherits from Mammal)
class Dog extends Mammal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class MultiLevelInheritanceDemo {
    public static void main(String[] args) {
        // Create an object of the derived class
        Dog dog = new Dog();

        // Call methods from all levels of inheritance
        dog.eat();   // Method from Animal class
        dog.walk();  // Method from Mammal class
        dog.bark();  // Method from Dog class
    }
}


/*

output:

This animal eats food.
This mammal walks on land.
The dog barks.

*/