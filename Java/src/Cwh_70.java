class MyThread1 extends Thread {
    public void run() {
        while (true) {
            System.out.println("thread1 is running for cooking");
            System.out.println("I'm Happy");
        }
    }
}

class MyThread2 extends Thread {
    public void run() {
        while (true) {
            System.out.println("thread2 is running for chatting");
            System.out.println("I'm also Happy");
        }
    }
}

public class Cwh_70 {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}
