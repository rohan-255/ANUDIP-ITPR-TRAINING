public class Shape {
    void getArea(){
    }
}

class Circle extends Shape {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    @Override
    void getArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

class Square extends Shape {
    int length;

    Square(int lelength) {
        this.length = length;
    }

    @Override
    void getArea() {
        int area = length * length;
        System.out.println("Area of Square: " + area);
    }
}

class ShapeMain{
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(4);

        circle.getArea();
        square.getArea();
    }
}