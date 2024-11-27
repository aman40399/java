7. Write a program in java to demonstrate method overloading

public class MethodOverloadingDemo {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double numbers
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MethodOverloadingDemo demo = new MethodOverloadingDemo();

        // Call the methods
        System.out.println("Sum of 10 and 20 (int): " + demo.add(10, 20));
        System.out.println("Sum of 10, 20, and 30 (int): " + demo.add(10, 20, 30));
        System.out.println("Sum of 5.5 and 3.2 (double): " + demo.add(5.5, 3.2));
    }
}


/*

output:

Sum of 10 and 20 (int): 30
Sum of 10, 20, and 30 (int): 60
Sum of 5.5 and 3.2 (double): 8.7

*/