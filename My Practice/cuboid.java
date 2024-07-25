import java.util.*;
import java.math.*;
public class cuboid{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int area,l,b,h,volume;
        System.out.print("Enter the length,breath,height: ");
        l=sc.nextInt();
        b=sc.nextInt();
        h=sc.nextInt();
        area=2*((l*b)+(l*h)+(b*h));
        volume=l*b*h;
        System.out.print("Area of cuboid is "+area+" squnit and the volume is "+volume+" cubicunit");
    }
}
