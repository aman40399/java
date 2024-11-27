10. Write a program that creates a user interface to perform integer division. The user enters two numbers in the text fields, Num1 and Num2. The division of Num1 and Num2 is displayed in the Result field when the Divide button is   clicked. If Num1 and Num2 were not integers, the program would throw a NumberFormatException. If Num2 were zero, the program would throw an ArithmeticException Display the exception in a message dialog box. 

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IntegerDivisionApp {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Integer Division Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(4, 2, 5, 5));

        // Create components
        JLabel labelNum1 = new JLabel("Num1:");
        JTextField textNum1 = new JTextField();
        JLabel labelNum2 = new JLabel("Num2:");
        JTextField textNum2 = new JTextField();
        JLabel labelResult = new JLabel("Result:");
        JTextField textResult = new JTextField();
        textResult.setEditable(false);
        JButton divideButton = new JButton("Divide");

        // Add components to the frame
        frame.add(labelNum1);
        frame.add(textNum1);
        frame.add(labelNum2);
        frame.add(textNum2);
        frame.add(labelResult);
        frame.add(textResult);
        frame.add(divideButton);

        // Add action listener for the button
        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Parse integers from input fields
                    int num1 = Integer.parseInt(textNum1.getText());
                    int num2 = Integer.parseInt(textNum2.getText());

                    // Perform division
                    int result = num1 / num2;
                    textResult.setText(String.valueOf(result));

                } catch (NumberFormatException nfe) {
                    // Show error dialog for invalid number format
                    JOptionPane.showMessageDialog(frame, 
                        "Please enter valid integers for Num1 and Num2.", 
                        "Input Error", JOptionPane.ERROR_MESSAGE);

                } catch (ArithmeticException ae) {
                    // Show error dialog for division by zero
                    JOptionPane.showMessageDialog(frame, 
                        "Cannot divide by zero.", 
                        "Arithmetic Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}


/*

output: (dimag lgake copy karna)

Example Output:
Case 1: Valid Input
Num1: 20
Num2: 4
Result: 5

Case 2: Invalid Input
Num1: "abc"
Num2: 5
Message Dialog: "Please enter valid integers for Num1 and Num2."

Case 3: Division by Zero
Num1: 10
Num2: 0
Message Dialog: "Cannot divide by zero."

*/