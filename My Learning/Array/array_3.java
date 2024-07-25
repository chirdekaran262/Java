import java.util.*;
public class array_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        int temp,max=0;
        System.out.println("Enter the array element: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int  j=0;j<arr.length;j++){
            if(arr[j]>arr[0]){
                temp=arr[j];
                arr[j]=max;
                max=temp;
                
            }
        }
        System.out.println("Maximum number is "+max);
    }
}
