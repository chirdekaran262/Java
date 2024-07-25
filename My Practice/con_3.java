import java.util.*;
public class con_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the mark of 3 subject: ");
        int s1=sc.nextInt();
        int s2=sc.nextInt();
        int s3=sc.nextInt();
        float avg=(float)(s1+s2+s3)/3;
        if(avg>=70){
            System.out.print("your grade is A");
        }
        else if(avg<70 && avg>=60){
            System.out.print("your grade is B");
        }
        else if(avg<60 && avg>=50){
            System.out.print("your grade is C");
        }
        else if(avg<50 && avg>=40){
            System.out.print("your grade is D");
        }
        else{
            System.out.println("Your gradde is E");
        }
    }
}
