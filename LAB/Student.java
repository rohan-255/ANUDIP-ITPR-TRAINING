public class Student {
    private String Sname;
    private String Cname;
    private int StudentID;
    public Student(int id, String sname, String cname) {
        this.StudentID = id;
        this.Sname = sname;
        this.Cname = cname;
        
    }
    public void display(){
        System.out.println("Student ID: " + this.StudentID);
        System.out.println("Student Name: " + this.Sname);
        System.out.println("Course Name: " + this.Cname);
    }
    public static void main(String args[]){
        Student student = new Student(101, "John Doe", "DYPTC");
        System.out.println("Successful!");
        student.display();
    }
}
