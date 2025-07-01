public class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
    public static double add(double a, double b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        System.out.println("5 + 10 : " + add(5, 10));;
        System.out.println("5 + 10 + 15 : " + add(5, 10, 15));
        System.out.println("5.5 + 10.5 : " + add(5.5, 10.5));
    }
}
