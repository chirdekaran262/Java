
import java.io.*;
class student{
    String stu_name;
    int roll_num;
    String dept;
}
public class file_13 {
    public static void main(String[] args) throws Exception{
        FileOutputStream f=new FileOutputStream("myfile1.txt");
        DataOutputStream p=new DataOutputStream(f);
        student s=new student();
        s.stu_name="Karan";
        s.roll_num=60;
        s.dept="CSE";
        p.writeInt(s.roll_num);
        p.writeUTF(s.stu_name);
        p.writeUTF(s.dept);
    }
}

