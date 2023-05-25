import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class q2 {
    public static void main(String[] args)throws IOException {
        char ch='a';
        DataInputStream ob=new DataInputStream(System.in);
        FileOutputStream fout;
        try{
            fout=new FileOutputStream("filelab.txt");
            while((ch=(char)(ob.read()))!='$')
            {
            fout.write(ch);
            }
            fout.close();
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("File not found");
        }
        }
}
