3. Write a Java program to accept a number and check the number is even or not. Prints 1 if the number is even or 0 if the number is odd.

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if even or odd
        if (number % 2 == 0) {
            System.out.println(1); // Print 1 if even
        } else {
            System.out.println(0); // Print 0 if odd
        }

        scanner.close();
    }
}


/*

output1:
Enter a number: 8
1

output2:
Enter a number: 5
0

*/