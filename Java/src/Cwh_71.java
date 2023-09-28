// Runnable Interface

class MyThread1 implements Runnable {
    public void run() {
        for (int i = 0; i < 200; i++) {

            System.out.println("i am thread1 not a threat");
        }
    }
}

class MyThread2 implements Runnable {
    public void run() {
        for (int i = 0; i < 200; i++) {

            System.out.println("i am thread2 not a threat");
        }

    }
}

public class Cwh_71 {
    public static void main(String[] args) {
        MyThread1 bullet1 = new MyThread1();
        Thread gun1 = new Thread(bullet1);
        MyThread2 bullet2 = new MyThread2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();

    }
}
