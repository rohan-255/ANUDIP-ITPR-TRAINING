
import java.util.Scanner;

public class prime {
    public static void main(String args[]){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a no to check if it is prime? :- ");
            int n = scanner.nextInt();
            prime(n);
        }
    }
    public static void prime(int n){
        if(n==1 || n==0) System.out.println(n+" is not a prime no!");
        int flag = 0;
        for(int i =2;i<(n/2+1);i++){
            if((n%i)==0){
                flag+=1;
            }
        }
        if(flag==0){
            System.out.println(n  +" is a prime no!");
        }
        else{
            System.out.println(n+" is not a prime no!");
        }
    }
}
