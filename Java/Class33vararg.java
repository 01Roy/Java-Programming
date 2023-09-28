public class Class33vararg {
    // if we want the pass the mutliple argument by calling the function then we use
    // the ...args in the function
    // parameter
    static int sum(int... args) {
        int result = 0;
        for (int i : args) {
            result += i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("this is sum :" + sum(2, 4, 8));

    }
}
