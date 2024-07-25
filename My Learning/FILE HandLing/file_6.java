import java.io.*;
public class file_6 {
    public static void main(String[] args) throws Exception {
        ByteArrayOutputStream bos=new ByteArrayOutputStream(20);
        bos.write("a");
        bos.write("b");
        bos.write("c");
        bos.write("d");
        bos.write("e");
        bos.write(new FileOutputStream("karan2"));
        bos.close();
    }
}
