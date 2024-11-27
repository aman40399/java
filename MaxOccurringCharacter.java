5. Write a Java program to find the maximum occurring character in a string

import java.util.HashMap;
import java.util.Map;

public class MaxOccurringCharacter {
    public static void main(String[] args) {
        String input = "sample string"; // Example input

        // Create a HashMap to store character frequencies
        Map<Character, Integer> charCount = new HashMap<>();

        // Iterate through the string to count characters
        for (char c : input.toCharArray()) {
            if (c != ' ') { // Ignore spaces
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
        }

        // Find the maximum occurring character
        char maxChar = ' ';
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        // Display the result
        System.out.println("Maximum occurring character: " + maxChar);
        System.out.println("Occurrences: " + maxCount);
    }
}


/*

output:

String input = "sample string";

Maximum occurring character: s
Occurrences: 2



*/