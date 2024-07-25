import java.io.*;
public class file_5 {
    public static void main(String[] args) throws Exception {
        byte b[]={'a','b','c','d','e','f','g','h'};
        ByteArrayInputStream bis=new ByteArrayInputStream( b);
        String s=new String(bis.readAllBytes());
        System.out.println(bis.markSupported());
        bis.close();
    }
}
