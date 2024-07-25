import java.util.*;
//import java.lang.*;
public class array_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a[]=new int[2][2];
        System.out.print("Enter the element of array:\n");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Element of array: ");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print("a["+i+"]["+j+"]="+a[i][j]+" ");
            }
            System.out.println("\n");
        }
    }
}
