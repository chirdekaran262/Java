import java.util.*;

public class Arthimatic_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double area,b,h;
        System.out.print("Enter the first height and later breath: ");
        h=sc.nextDouble();
        b=sc.nextDouble();
        area=0.5*h*b;
        System.out.print("Area of Traingle of height is "+h+" and breath is "+b+" is "+area+" squnit");
    }
}
