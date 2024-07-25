package method_pack;

import java.util.*;
import java.lang.*;
public class method_1 {
    static boolean prime(){
        Scanner sc=new Scanner(System.in);
        int x;
        System.out.print("Enter the number to check the prime or not: ");
        x=sc.nextInt();
        for(int i=2;i<x;i++){
            if(x%i==0){
                return true;
            }
            else{
                continue;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        boolean c;
        c=prime();
        if(c==true){
            System.out.print("Entered number is not a prime number.");
        }
        else{
            System.out.print("Entered number is a prime number.");
        }
    }
}
