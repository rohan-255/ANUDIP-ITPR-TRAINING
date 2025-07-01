
import java.util.Scanner;

public class EmpSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 1;
        int i = 1;
        while(choice == 1){
            System.out.print("Enter Employee Basic Salary: ");
            double basicSalary = scanner.nextDouble();
            double HRA, DA;
            if(basicSalary > 15000){
                HRA = basicSalary * 0.20; 
                DA = basicSalary * 0.60;
            } else {
                HRA = basicSalary * 0.20; 
                DA = basicSalary * 0.60;
            }
            double grossSalary = basicSalary + HRA + DA;
            System.out.println("Employee " + i + " Gross Salary: " + grossSalary);
            i++;
            System.out.print("Do you want to enter another employee? (1 for Yes): ");
            choice = scanner.nextInt();
        }
        scanner.close();
    }
}
