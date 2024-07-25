package oob_pack;

import java.util.*;
class student{
    String n;
        int r;
        int m;
    student(String name,int r_n,int mark){
        n=name;
        r=r_n;
        m=mark;
    }
    void display(){  
        System.out.println("Name of student is: "+n);
        System.out.println("Roll No. of "+n+" student is: "+r);
        System.out.println("Mark of "+n+" student is: "+m);
    }
}
public class oob_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name;
        int r_n,mark;
        /*System.out.println("Enter the name roll no. and mark of student: ");
        name=sc.nextLine();
        r_n=sc.nextInt();
        mark=sc.nextInt();*/
        student k=new student("karan", 60,80);
        k.display();
        student p=new student("parth", 57, 70);
        p.display();
        student b=new student("bibishan", 72, 85);
        b.display();
    }
}
