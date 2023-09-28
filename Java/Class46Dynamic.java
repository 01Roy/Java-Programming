// Dynamic method dispatch in java

class Phone {
    public void greeting() {
        System.out.println("Hello from phone class");
    }

    public void on() {
        System.out.println("Phone is on");
    }
}

class SmartPhone extends Phone {
    public void swagat() {
        System.out.println("Sawagat hai apka smartphone mai");
    }

    public void on() {
        System.out.println("Smart Phone is on");
    }
}

public class Class46Dynamic {
    public static void main(String[] args) {
        Phone obj = new SmartPhone();
        obj.on();
    }
}
