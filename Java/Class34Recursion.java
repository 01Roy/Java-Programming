public class Class34Recursion {
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int numFac = 5;
        System.out.println("this is the factorial of :" + factorial(numFac));
    }
}
