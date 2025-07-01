class Student2 {
    String name;
    int age;
    String department;

    public Student2() {
        this.name = "Unknown";
        this.age = 20;
        this.department = "Unassigned";
    }

    public Student2(String name, int age) {
        this.name = name;
        this.age = age;
        this.department = "IT";
    }

    public Student2(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
    }
}

class Main {
    public static void main(String[] args) {
        Student2 student1 = new Student2();
        Student2 student2 = new Student2("Alice", 22);
        Student2 student3 = new Student2("Bob", 21, "Computer Science");

        student1.display();
        System.out.println();
        student2.display();
        System.out.println();
        student3.display();
    }
}
