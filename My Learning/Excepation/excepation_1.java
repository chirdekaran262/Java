//package excepationdemo;
import java.util.Scanner;

public class excepation_1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number a and b: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        try{
            int c=a/b;
            System.out.println("division of a and b is: "+c);            
        }
        catch(ArithmeticException  e){
            System.out.println("Error is: "+e);
        }
        System.out.println("Program End");
    }
}
