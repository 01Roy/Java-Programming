import java.util.Scanner;

public class Class16switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();
        int dayName = Integer.parseInt(day);
        switch (dayName) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tues");
            case 3 -> System.out.println("Wed");
            case 4 -> System.out.println("Thrus");
            case 5 -> System.out.println("Fri");
            case 6 -> System.out.println("Sat");
            case 7 -> System.out.println("Snday");
        }
    }
}
