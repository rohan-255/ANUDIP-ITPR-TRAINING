
import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter start number: ");
        int start = scanner.nextInt();
        System.out.print("Enter end number: ");
        int end = scanner.nextInt();
        System.out.println("Armstrong numbers between " + start + " and " + end + ":");
        printArmStrongNumbers(start, end);
        scanner.close();
    }
    public static void printArmStrongNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            int sum = 0;
            int originalNumber = i;
            while(originalNumber > 0){
                int digit = originalNumber % 10;
                int power = 1;
                for(int j = 0; j < 3; j++){
                    power *=digit;
                }
                sum += power;
                originalNumber /= 10;
            }
            if(sum == i){
                System.out.println(i + " ");
            }
        }
    }
}
