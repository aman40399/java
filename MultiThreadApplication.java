11. Write a java program that implements a multi-thread application that has three threads. First thread generates random integer every1 second and if the value is even, second thread computes the square of the number and prints. If the value is odd, the third thread will print the
value of cube of the number


import java.util.Random;

class NumberGenerator extends Thread {
    public void run() {
        Random random = new Random();
        while (true) {
            int num = random.nextInt(100); // Generate random integer between 0 and 99
            System.out.println("Generated number: " + num);

            if (num % 2 == 0) {
                new SquareCalculator(num).start();
            } else {
                new CubeCalculator(num).start();
            }

            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                System.out.println("NumberGenerator interrupted");
            }
        }
    }
}

class SquareCalculator extends Thread {
    private final int number;

    public SquareCalculator(int number) {
        this.number = number;
    }

    public void run() {
        int square = number * number;
        System.out.println("Square of " + number + " is: " + square);
    }
}

class CubeCalculator extends Thread {
    private final int number;

    public CubeCalculator(int number) {
        this.number = number;
    }

    public void run() {
        int cube = number * number * number;
        System.out.println("Cube of " + number + " is: " + cube);
    }
}

public class MultiThreadApplication {
    public static void main(String[] args) {
        NumberGenerator generator = new NumberGenerator();
        generator.start();
    }
}


/*

output:

Generated number: 12
Square of 12 is: 144

Generated number: 7
Cube of 7 is: 343

Generated number: 4
Square of 4 is: 16


*/