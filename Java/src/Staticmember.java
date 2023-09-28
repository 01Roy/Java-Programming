// when  we declear any variable or method to static. it can be access without creating objects

class Mathoperation {
    static float mul(float x, float y) {
        return x * y;
    }

    static float div(float x, float y) {
        return x / y;
    }
}

public class Staticmember {
    public static void main(String[] args) {
        float a = Mathoperation.mul((float) 2.4, 8);
        System.out.println(a);
    }
}
