public class thread1 {
    
    public static void main(String[] args) {
        mythread1 t1 = new mythread1();
        t1.start();
        mythread2 t2 = new mythread2();
        Thread t3 = new Thread(t2);
        t3.start();
        
    }
}

class mythread1 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running using Thread class");
    }
}
class mythread2 implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running using Runnable interface");
    }
}