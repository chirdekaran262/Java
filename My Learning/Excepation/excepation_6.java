package mypack2;
import java.io.*;
public class excepation_6 {
    static void show() throws Exception{
        try(FileReader f=new FileReader("karan.txt");){
            
            System.out.println();
            
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("program run");
        }
    }
    public static void main(String[] args) {
        try{
            show();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
