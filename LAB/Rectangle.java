public class Rectangle {
    private int length;
    private int width;
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    public int area() {
        return length * width;
    }
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(5, 10);
        Rectangle rectangle2 = new Rectangle(7, 3);

        if(rectangle1.area() > rectangle2.area()) {
            System.out.println("Rectangle 1 > Rectangle 2");
        } else if(rectangle1.area() < rectangle2.area()) {
            System.out.println("Rectangle 1 < Rectangle 2");
        } else{
            System.out.println("They are equal!");
        }
    }
}
