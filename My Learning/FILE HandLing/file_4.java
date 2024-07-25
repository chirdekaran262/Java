import java.io.*;

public class file_4{
    public static void main(String[] args) throws Exception {
        FileInputStream f1=new FileInputStream("karan.txt");
        FileInputStream f2=new FileInputStream("sample.txt");       
        FileOutputStream f3=new FileOutputStream("karan1.txt");
        SequenceInputStream s=new SequenceInputStream(f1, f2);
        int b;
        while((b=s.read())!=-1){
            f3.write(b);
        }
        f1.close();;
        f2.close();
        f3.close();
        s.close();
    }
}
