import java.util.*;
public class array_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[10];
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
        int max1=ar[0];
        int max2=ar[0];
        for(int j=0;j<ar.length;j++){
            if(ar[j]<max1){
                max1=max2;
                max1=ar[j];
                }
            else if(ar[j]<max2){
                max2=ar[j];
            }
        }
        System.out.println("second min no. is: "+max2);
    }
}
