9. Write a java program to create an abstract class named Shape that contains two integers and an empty method named print Area (). Provide three classes named Rectangle, Triangle and Circle such that each one of the classes extends the class Shape. Each one of the classes contains only the method print Area () that prints the area of the given shape

// Abstract class Shape
abstract class Shape {
    int dimension1, dimension2;

    // Abstract method to be implemented by subclasses
    abstract void printArea();
}

// Class Rectangle extending Shape
class Rectangle extends Shape {
    Rectangle(int length, int width) {
        dimension1 = length;
        dimension2 = width;
    }

    // Overriding printArea() to calculate and print area of rectangle
    void printArea() {
        int area = dimension1 * dimension2;
        System.out.println("Area of Rectangle: " + area);
    }
}

// Class Triangle extending Shape
class Triangle extends Shape {
    Triangle(int base, int height) {
        dimension1 = base;
        dimension2 = height;
    }

    // Overriding printArea() to calculate and print area of triangle
    void printArea() {
        double area = 0.5 * dimension1 * dimension2;
        System.out.println("Area of Triangle: " + area);
    }
}

// Class Circle extending Shape
class Circle extends Shape {
    Circle(int radius) {
        dimension1 = radius;
        dimension2 = 0; // Circle only requires one dimension (radius)
    }

    // Overriding printArea() to calculate and print area of circle
    void printArea() {
        double area = Math.PI * dimension1 * dimension1;
        System.out.println("Area of Circle: " + area);
    }
}

public class ShapeAreaDemo {
    public static void main(String[] args) {
        // Creating objects of different shapes
        Shape rectangle = new Rectangle(10, 5);
        Shape triangle = new Triangle(6, 8);
        Shape circle = new Circle(7);

        // Calling the printArea method for each shape
        rectangle.printArea();
        triangle.printArea();
        circle.printArea();
    }
}


/*

output:

Area of Rectangle: 50
Area of Triangle: 24.0
Area of Circle: 153.93804002589985

*/