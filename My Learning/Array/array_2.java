import java.util.*;
public class array_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]={2,3,4,1,5,8,7,6,9,10};
        int b[]=new int[10];
        System.out.println("Enter the element of array b:  ");
        for(int i=0;i<b.length;i++){
            b[i]=sc.nextInt();
        }
        System.out.println("sum of array a and b is:");
        for(int j=0;j<a.length;j++){
            System.out.println(a[j]+b[j]);
        }
    }
}
