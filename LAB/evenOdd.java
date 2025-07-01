
import java.util.Scanner;

public class evenOdd {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oddNo = 0;
        int evenNo = 0;
        System.out.print("Enter numbers(-1 to stop): ");
        int number = scanner.nextInt();
        while (number != -1) {
            if (number % 2 == 0) {
                evenNo++;
            } else {
                oddNo++;
            }
            number = scanner.nextInt();
        }
        System.out.println("Total even numbers: " + evenNo);
        System.out.println("Total odd numbers: " + oddNo);
        scanner.close();
    }
}
