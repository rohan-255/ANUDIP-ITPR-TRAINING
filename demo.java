import java.util.Scanner;

class demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("* \n*\t*\n*\t*\t*");
        System.out.println("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = sc.nextInt();
        
        int c=a+b;
        int d=a-b;
        int e=a*b;
        int f=a/b;
        System.out.println("Add="+c);
        System.out.println("Sub="+d);
        System.out.println("Mul="+e);
        System.out.println("Div="+f);
        sc.close();
    }
}
