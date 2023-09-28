class MyThred extends Thread {
    public MyThred(String name) {
        super(name);
    }

    public void run() {
        System.out.println("thread is running");
    }
}

public class Class74_thread_constructor {
    public static void main(String[] args) {
        MyThred t1 = new MyThred("Subham");
        MyThred t2 = new MyThred("Roy");
        t1.start();
        t2.start();
        System.out.println("the thred id is " + t1.getId());
        System.out.println("the thred id is " + t2.getId());
        System.out.println("the thred id is " + t1.getName());
        System.out.println("the thred id is " + t2.getName());
    }
}
