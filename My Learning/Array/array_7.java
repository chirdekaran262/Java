import java.util.*;
import java.lang.*;
public class array_7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        a[0]=10;
        a[1]=34;
        a[2]=23;
        a[3]=39;
        a[4]=12;
        int k,x;
        System.out.print("Enter the element which is remove: ");
        x=sc.nextInt();
        System.out.print("Enter the position on which element delete: ");
        k=sc.nextInt();
        for(int i=k;i<a.length-1;i++){
            a[i]=a[i+1];
        }
        
        System.out.println("Elment of array after deleting the "+x+" is : ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

    }
}
