
import java.util.Scanner;

public class array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of cols: ");
        int cols = sc.nextInt();    
        int arr[][] = new int[rows][cols];
        System.err.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        display(arr, rows, cols);
        sc.close();


    }
    public static void display(int arr[][], int rows, int cols) {
        System.out.println("The 2D array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
