import java.io.*;

public class file_3 {
    public static void main(String[] args) throws Exception {
        FileInputStream f=new FileInputStream("C:/Users/KARAN/OneDrive/Desktop/Progrmming/sample.txt");
        FileOutputStream f1=new FileOutputStream("C:/Users/KARAN/OneDrive/Desktop/Progrmming/karan1.txt");
        int b;
        while((b=f.read(null))!=-1){
            if(b>=65 && b<=120){
            f1.write(b+32);
            }
            else{
                f1.write(b);
            }
            f.close();
            f1.close();
        }
    }
}
