import java.io.File;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;
import java.util.Scanner;

public class Filenadling {
    public static void main(String[] args) {
        // Creating a file
        // File file = new File("newFile.txt");
        // try {
        // file.createNewFile();
        // } catch (IOException e) {
        //
        // e.printStackTrace();
        // }

        // code to write a file

        // try {
        // FileWriter file = new FileWriter("newFile.txt");
        // file.write("this is the normal text");
        // file.close();
        // } catch (Exception e) {
        //
        // }

        // Code to read the file
        // File file = new File("newFile.txt");
        // try {
        // Scanner sc = new Scanner(file);
        // while (sc.hasNextLine()) {
        // String line = sc.nextLine();
        // System.out.println(line);
        // }
        // sc.close();
        // } catch (Exception e) {
        // // TODO: handle exception
        // }

        // Deleting a file
        File file = new File("newFile.txt");
        if (file.delete()) {
            System.out.println("the file is deleted" + file.getName());
        } else {
            System.out.println("the is not deleted from this pc");
        }
    }
}
