
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to calculate its factorial:");   
        int n = sc.nextInt();  
        int result = 1; 
        
        for (int i = 1; i <= n; i++) {
            result *= i; 
        }
        
        System.out.println("Factorial of " + n + " is: " + result); 
        sc.close();
    }
}