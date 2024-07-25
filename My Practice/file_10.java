import java.io.*;

public class file_10 {
    public static void main(String[] args) throws Exception {
        File f=new File("c:\\Desktop\\sample.txt");
        f.setReadOnly();
        FileOutputStream fos=new FileOutputStream("c:\\Desktop\\sample.txt");
    }
}
