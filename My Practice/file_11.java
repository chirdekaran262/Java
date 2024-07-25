import java.io.*;
class student{
    String stu_name;
    String roll_num;
    String dept;
}
public class file_11 {
    public static void main(String[] args) throws Exception{
        FileOutputStream f=new FileOutputStream("myfile.txt");
        PrintStream p=new PrintStream(f);
        student s=new student();
        s.stu_name="Karan";
        s.roll_num="A60";
        s.dept="CSE";
        p.println("Name of student: "+s.stu_name);
        p.println("Roll No of student: "+s.roll_num);
        p.println("Name of student: "+s.dept);
    }
}
