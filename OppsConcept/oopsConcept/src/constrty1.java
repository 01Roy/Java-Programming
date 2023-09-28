
class Pen {
    String name;
    int age;

    public void peninfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // this constoror is without parameters
    // Pen() {
    // System.out.println("constortor is called");
    // }

    // this is constrator with parameters
    Pen(String name, int age) {
        this.name = name;
        this.age = age;
    }

}

public class constrty1 {
    public static void main(String[] args) {
        Pen pen1 = new Pen("Aman", 23);
        pen1.peninfo();

    }

}
