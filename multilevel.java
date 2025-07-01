class shape {
    public void display1() {
        System.out.println("This is a shape.");
    }
}
class triangle extends shape {
    public void display2() {
        System.out.println("This is a triangle.");
    }
}
class equilateral extends triangle {
    public void display3() {
        System.out.println("This is an equilateral triangle.");
    }
}

class multilevel {
    public static void main(String[] args) {
        equilateral e = new equilateral();
        e.display1(); 
        e.display2();
        e.display3();

        
    }
}
