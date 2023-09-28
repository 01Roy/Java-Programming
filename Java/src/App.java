import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Please enter the name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Your name is : " + name);

        // Check the number is int or not
        Scanner src = new Scanner(System.in);
        System.out.println(sc.hasNextInt());

    }
}
