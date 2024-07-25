import java.util.*;
import java.lang.*;
public class array_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        a[0]=10;
        a[1]=34;
        a[2]=23;
        a[3]=39;
        a[4]=12;
        int k,x;
        System.out.print("Enter the element which is insert: ");
        x=sc.nextInt();
        System.out.print("Enter the position on which element insert: ");
        k=sc.nextInt();
        for(int i=8;i>=k;i--){
            a[i+1]=a[i];
        }
        a[k]=x;
        System.out.println("Elment of array after inserting the "+x+" is : ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

    }
}
