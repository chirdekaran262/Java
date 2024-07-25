import java.io.*;
class student{
    String name;
    int roll_num;
    String dept;
}
public class file_14{
    public static void main(String[] args) throws Exception{
        FileInputStream f=new FileInputStream("myfile1.txt");
        DataInputStream d=new DataInputStream(f);
        student s=new student();
        s.name=d.readUTF();
        s.roll_num=d.readInt();
        s.dept=d.readUTF();
        System.out.println(s.name+" "+s.roll_num+" "+s.dept);
    }
}

