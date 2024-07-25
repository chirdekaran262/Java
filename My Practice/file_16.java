import java.io.*;
class student{
    String name;
    int roll_num;
    String dept;
}
public class file_16{
    public static void main(String[] args) throws Exception{
        FileInputStream f=new FileInputStream("myfile1.txt");
        ObjectInputStream o=new ObjectInputStream(f);
        student s =(student)o.readObject();
        System.out.println(s);
    }
}

