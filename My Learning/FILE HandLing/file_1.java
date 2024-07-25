import java.io.*;
public class file_1 {
    public static void main(String[] args) {
        try{
            FileOutputStream f=new FileOutputStream("karan.txt");
            String str="I learn java programming from udemy";
            byte b[]=str.getBytes();
            for (byte x:b)
                f.write(x);
            f.close();
        }
        catch(FileNotFoundException e){
            System.out.println("Error is: "+e);
        }
        catch(IOException e){
            System.out.println("Error is: "+e);
        }
    }
}
