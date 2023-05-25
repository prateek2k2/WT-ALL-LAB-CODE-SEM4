import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        try {
            File myfile = new File("filelab.txt");
            Scanner scanner = new Scanner(myfile);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
