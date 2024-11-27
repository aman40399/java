4. Write a Java program that accepts three integers from the user and return true if  the second number is greater than first number and third number is greater than second number. If "abc" is true second number does not need to be greater than first number.

import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept three integers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Accept "abc" boolean input
        System.out.print("Is 'abc' true (true/false)? ");
        boolean abc = scanner.nextBoolean();

        // Check conditions
        boolean result;
        if (abc) {
            result = num3 > num2; // Ignore first number if abc is true
        } else {
            result = (num2 > num1) && (num3 > num2); // Normal condition
        }

        // Print result
        System.out.println("Result: " + result);

        scanner.close();
    }
}


/*

output:
Enter the first number: 5
Enter the second number: 10
Enter the third number: 15
Is 'abc' true (true/false)? false

Result: true


*/