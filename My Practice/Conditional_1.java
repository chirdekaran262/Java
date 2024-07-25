import java.util.*;
public class Conditional_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to check odd or even: ");
        int num=sc.nextInt();
        if (num%2==0){
            System.out.print(num+" number is Even.");
        }
        else{
            System.out.print(num+" number is odd.");
        }

    }
}
