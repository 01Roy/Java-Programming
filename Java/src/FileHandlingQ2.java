import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.util.Date;

// import javax.xml.crypto.Data;

public class FileHandlingQ2 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        LocalDateTime time = LocalDateTime.now();
        double d1 = 6.78;
        try {
            File file = new File("programs__ms.txt");

            BufferedWriter outputWriter = null;
            outputWriter = new BufferedWriter(new FileWriter(file));
            for (int i = 0; i < arr.length; i++) {

                outputWriter.write(arr[i] + "\n");

            }
            outputWriter.write(time.toString() + "\n");
            outputWriter.write(String.valueOf(d1) + "\n");

            outputWriter.flush();
            outputWriter.close();

        } catch (Exception e) {

        }

    }
}
