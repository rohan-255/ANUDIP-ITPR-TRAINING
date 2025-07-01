public class Student1 {
    private String name;
    private String department;
    private int age;
    public Student1(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;

    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getDepartment() {
        return department;
    }
    public void setName(String name) {
        this.name = name;
    }  
    public void setAge(int age) {
        this.age = age;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    
    public static void main(String args[]){
        Student1 student = new Student1("John Doe", 20, "Computer Science");
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
        System.out.println("Department: " + student.getDepartment());
    }
}
