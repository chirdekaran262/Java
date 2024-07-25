import java.io.*;
public class file_7 {
    public static void main(String[] args) throws Exception {
        FileReader f=new FileReader("karan.txt");
        BufferedReader fb=new BufferedReader(f);
        
        System.out.println((char)fb.read());
        System.out.println((char)fb.read());
        System.out.println((char)fb.read());
       
        fb.mark(10);
        System.out.println(fb.read());
        System.out.println(fb.read());
        fb.reset();
        System.out.println(fb.read());
        System.out.println(fb.read());
        System.out.println(fb.readLine());

    }
}
