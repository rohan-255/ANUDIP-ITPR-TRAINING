
import java.util.Scanner;

public class fun1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number:");
        int b = sc.nextInt();  
        System.out.println("The sum of the two numbers is: " + display(a, b));

        sc.close();
    }
    public static int display(int a, int b) {
        return a + b;
       }
}
