6. Write a Java program to find first non repeating character in a string.

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String input = "swiss"; // Example input

        // Create a LinkedHashMap to store character frequencies
        Map<Character, Integer> charCount = new LinkedHashMap<>();

        // Count frequencies of characters
        for (char c : input.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Find the first non-repeating character
        char firstNonRepeating = '\0'; // Null character
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                firstNonRepeating = entry.getKey();
                break;
            }
        }

        // Display the result
        if (firstNonRepeating != '\0') {
            System.out.println("First non-repeating character: " + firstNonRepeating);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}


/*

output:

String input = "swiss";

First non-repeating character: w

*/