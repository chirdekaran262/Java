import java.io.*;

public class file_2 {
    public static void main(String[] args) {
       try{
        FileInputStream f=new FileInputStream("karan.txt");
        
        byte b[]=new byte[f.available()];
        f.read(b);
        String str=new String(b);
        System.out.println(str);
       }
       catch(Exception e){
        System.out.println("Error is: "+e);
       }
    }
}
