public class Class27Array {
    public static void main(String[] args) {
        int[] marks = new int[5];
        marks[0] = 1;
        marks[1] = 11;
        marks[2] = 12;
        marks[3] = 13;
        marks[4] = 14;

        System.out.println(marks[1]);
        for (int element : marks) {
            System.out.println(element);
        }
    }
}
