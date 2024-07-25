import java.io.*;
class student{
    String stu_name;
    int roll_num;
    String dept;
}
public class file_15 {
    public static void main(String[] args) throws Exception{
        FileOutputStream f=new FileOutputStream("myfile2.txt");
        ObjectOutputStream o=new ObjectOutputStream(f);
        student s=new student();
        s.stu_name="Karan";
        s.roll_num=60;
        s.dept="CSE";
        o.writeObject(s);
        f.close();
        o.close();
    }
}


