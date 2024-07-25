import java.util.*;

public class array_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[10];
        System.out.println("Enter Element of array:");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int temp;
        temp=a[0];
        for(int i=1;i<a.length;i++){
            a[i-1]=a[i];
        }
        a[a.length-1]=temp;
        System.out.println("Element of array in rotating from: ");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
