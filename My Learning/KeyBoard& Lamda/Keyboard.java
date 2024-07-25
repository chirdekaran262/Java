import java.util.*;
public class Keyboard {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter The number: ");
        a=sc.nextInt();
        b=sc.nextInt();
        int c=a+b;
        System.out.print("Sum of "+a+" and "+b+" is  "+c);
    }
}
