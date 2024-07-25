import java.util.*;
import java.math.*;
public class Arthi_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double area,a,b,c,s;
        System.out.print("Enter the a,b,c: ");
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        s=(a+b+c)/2;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.print("Area of Traingle is "+area+" squnit");
    }
}
