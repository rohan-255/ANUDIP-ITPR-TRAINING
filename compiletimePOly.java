class student {
    
    public void printInfo(String name) {
        System.out.println("Name: "+name);
    }
    public void printInfo(int age) {
        System.out.println("Age:  "+age);
    }
    public void printInfo(String name, int age) {
        System.out.println("Name: "+name);
        System.out.println("Age:  "+age);
    }
}

class compiletimePOly {
    public static void main(String[] args) {
        student s = new student();
        s.printInfo("John Doe");
        s.printInfo(20);
        s.printInfo("John Doe", 20);
    }
        
}
