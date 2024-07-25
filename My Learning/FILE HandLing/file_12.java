import java.io.*;
class student{
    String name;
    String roll_num;
    String dept;
}
public class file_12 {
    public static void main(String[] args) throws Exception{
        FileInputStream f=new FileInputStream("myfile.txt");
        BufferedReader b=new BufferedReader(new InputStreamReader(f));
        student s=new student();
        s.name=b.readLine();
        s.roll_num=b.readLine();
        s.dept=b.readLine();
        System.out.println(s.name+" "+s.roll_num+" "+s.dept);
    }
}
