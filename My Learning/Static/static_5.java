import java.util.Date;

import javax.xml.crypto.Data;
class student{
    private String rollno;
    private static int count=1;
    private String assingrollno(){
        Date d=new Date();
        String rno=(d.getYear()+1900)+"BCS"+count;
        count++;
        return rno;
    }
    student(){
        rollno=assingrollno();
    }
    public String getrollno(){
        return rollno;
    }

}
public class static_5 {
    public static void main(String[] args) {
        student s1=new student();
        student s2=new student();
        student s3=new student();

        System.out.println(s1.getrollno());
        System.out.println(s2.getrollno());
        System.out.println(s3.getrollno());
    }
}
