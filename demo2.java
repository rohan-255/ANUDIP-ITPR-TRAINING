
import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        //System.out.println("Hello, World!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();
        scanner.close();
        switch(choice) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Good Morning!");
                break;
            default:
                System.out.println("BORNJUNG");
        }
}
}
