class Student {
    String name;
    int age;
    public Student() {
        System.out.println("Default constructor called");
        
    }
    Student (String name, int age){
        this.name=name;
        this.age=age;
        System.out.println("Parameterized constructor called");
    }

    void display() {
        System.out.println("Name: " + this.name + ",    Age: " + this.age);
    }

    
    Student(Student other) {
        this.name = other.name;
        this.age = other.age;
        System.out.println("Copy constructor called");
    }
}
public class constructor1 {
    public static void main(String[] args) {
        Student s3= new Student();
        s3.display();
        System.out.println();
        Student s1= new Student("ABC", 20);
        s1.display();
        System.out.println();
        Student s2 =new Student(s1);
        s2.display();
    }
}
