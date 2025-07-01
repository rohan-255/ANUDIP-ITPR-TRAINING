public class Employee{
    protected int id;
    protected int age;
    protected String name;
    protected boolean isPermanent;
    public Employee(int id, int age, String name, boolean isPermanent) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.isPermanent = isPermanent;
    }
    public void display() {
        System.out.println("ID: " + id + ", Age: " + age + ", Name: " + name + ", Permanent: " + isPermanent);
    }
    public static void main(String[] args) {
        int id=1;
        int age=(int) 30.5;
        String name="John Doe";
        boolean isPermanent=true;

        Employee emp = new Employee(id, age, name, isPermanent);
        System.out.println("Successfully Started!");
        emp.display();
    }
}