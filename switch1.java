import java.util.Scanner;

public class switch1 {
    public static void main(String[] args) {
       
        
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 7:");
        int day = sc.nextInt();
        String name;
        switch(day){
            case 1:
                name="Monday";
                break;
            case 2:
                name= "Tuesday";
                break;
            case 3:
                name="Wednesday";
                break;
            case 4:
                name="Thursday";break;
            case 5: 
            name="Friday"; 
            break;
            case 6: name="Saturday"; break;
            case 7: name="Sunday"; break;   
            default:
            name="Invalid Day!";
        }
        System.out.println("The day is: " + name);
        sc.close();
    
    }
}
