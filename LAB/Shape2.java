// Abstract base class
abstract class Shape2 {
    // Abstract method to calculate area
    abstract void calculateArea();
}

// Circle2 class extends Shape2 
class Circle2 extends Shape2 {
    double radius;

    // Constructor to initialize radius
    Circle2(double radius) {
        this.radius = radius;
    }

    // Override to calculate and display area of the circle
    @Override
    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

// Square2 class extends Shape2 
class Square2 extends Shape2 {
    double length;

    // Constructor to initialize length
    Square2(double length) {
        this.length = length;
    }

    // Override to calculate and display area of the square
    @Override
    void calculateArea() {
        double area = length * length;
        System.out.println("Area of Square: " + area);
    }
}

// Main class 
class Shape2Main {
    public static void main(String[] args) {
        Circle2 circle = new Circle2(5);
        Square2 square = new Square2(4);

        circle.calculateArea(); // Calculate and display area of the circle
        square.calculateArea(); // Calculate and display area of the square
    }
}