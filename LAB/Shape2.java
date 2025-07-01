abstract class Shape2 {
    abstract void calculateArea();
}

class Circle2 extends Shape2 {
    double radius;

    Circle2(double  radius) {
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

class Square2 extends Shape2 {
    double length;

    Square2(double length) {
        this.length = length;
    }

    @Override
    void calculateArea() {
        double area = length * length;
        System.out.println("Area of Square: " + area);
    }
}

class Shape2Main{
    public static void main(String[] args) {
        Circle2 circle = new Circle2(5);
        Square2 square = new Square2(4);
        circle.calculateArea();
        square.calculateArea();
    }
}