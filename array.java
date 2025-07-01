import java.util.Scanner;

public class array {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n= sc.nextInt();
        int[] arr =new int[n];
        System.out.println("Enter the elements of the array:");
        for(int j=0; j < n; j++) {
            arr[j] = sc.nextInt();
        }
        
        System.out.println("enter key to be found:");
        int key= sc.nextInt();
        boolean found= false;
        int i = 0;
        while ( i < n) {
            if(key==arr[i]) {
                found=true;
                break;
            }
            i++;
        }
        if(found) System.out.println("Key found at index: "+i);
        else System.out.println("Key not found!");
        sc.close();
}
}
