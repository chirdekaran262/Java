import java.lang.*;
import java.util.*;
import java.math.*;

public class Quadratic{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        double r1,r2;
        System.out.print("Enter the value of a,b,c: ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        double s=b*b-4*a*c;
        if(s<0 || a==0){
            System.out.print("Root of this equation is not exit");
        }
        else{
            r1=(-b-Math.sqrt(b*b-4*a*c))/2*a;
            r2=(-b+Math.sqrt(b*b-4*a*c))/2*a;
            System.out.print("Root of quadratic equation are the  "+r1+" and "+r2);
        } 
    }
}

