import java.io.File;
import java.io.FileWriter;
import java.util.Random;

public class FileHandlingQuestion {
    public static void main(String[] args) {
        try {
            File file = new File("program-es.txt");
            FileWriter fileWriter = new FileWriter(file.getName());
            for (int i = 0; i <= 99; i++) {
                Random rand = new Random();
                int rand_int1 = rand.nextInt(1000);
                fileWriter.write(rand_int1 + "\n");
            }
            fileWriter.close();
        } catch (Exception e) {
            // TODO: handle exception
        }

        // Random rand = new Random(1000);
        // int rand_int1 = rand.nextInt(1000);
        // System.out.println(rand_int1);
    }
}
