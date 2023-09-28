//Abstract Class

abstract class Parent {
    public Parent() {
        System.out.println("Im constructor in parent class");
    }

    public void sayhello() {
        System.out.println("hello from parent class");
    }

    abstract public void greet();
}

class Child extends Parent {
    public void greet() {
        System.out.println("Namaste");
    }
}

public class Class53abstrst {
    public static void main(String[] args) {

    }
}
