class Base1 {
    Base1() {
        System.out.println("this is calling from base constructor");
    }

    Base1(int a) {
        System.out.println("this is calling from base constr with value : " + a);
    }
}

class DriveClass extends Base1 {
    DriveClass() {
        super(0);
        System.out.println("Im calling from drived class");
    }
}

public class Class46cont {
    public static void main(String[] args) {
        // Base1 h1 = new Base1();
        DriveClass d = new DriveClass();
    }
}
