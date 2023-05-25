import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;

public class q3 {
    public static void main(String[] args) throws IOException{
        int ch = 0;
        FileInputStream fin;
        FileOutputStream fout;
        try {
            fin = new FileInputStream("filelab.txt");
            fout = new FileOutputStream("b.txt");
            while ((ch=fin.read())!= -1) {
                fout.write((char) ch);
            }
            fin.close();
            fout.close();
        }
        catch(FileNotFoundException ex){
            System.out.println("File Not Found");
        }
    }
}
