import java.io.FileWriter;
import java.io.IOException;

public class q2 {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("filelab.txt");
            writer.write("KIIT UNIVERSITY\n");
            writer.write("HELLO\n");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}
