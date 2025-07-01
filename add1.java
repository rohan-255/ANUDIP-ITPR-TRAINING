import java.util.Scanner;
public class add1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 1st no. : ");
        int a =sc.nextInt();
        System.out.println("Enter 2nd no. : ");
        int b =sc.nextInt();
        System.out.println("The sum is: " + adds(a, b));
        sc.close();
    }
    static int adds(int a, int b){
        return (a+b) ;
    }
}
