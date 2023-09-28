// learn about the construcctor

class Reactangle {
    int length, breath;

    // this is a constructor
    Reactangle() { // default constructor
        System.out.println("i am default constructor");
        length = 0;
        breath = 0;

    }

    // this is a constructor
    Reactangle(int x, int y) { // perameterized constructor
        System.out.println("i am [erametrized constructor");
        length = x;
        breath = y;

    }

    int reacArea() {
        return length * breath;
    }
}

public class Constr {
    public static void main(String[] args) {
        Reactangle reac1 = new Reactangle(); // calling default constructor
        Reactangle reac2 = new Reactangle(3, 4); // calling perametrized contructor
        int areaReact1 = reac1.reacArea();
        int areaReact2 = reac2.reacArea();
        System.out.println(areaReact1);
        System.out.println(areaReact2);
    }
}
