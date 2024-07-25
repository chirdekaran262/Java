import java.util.*;
public class con_2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the your age: ");
        int age=sc.nextInt();
        if (age>=14 && age<=55){
            System.out.print("Youn are young");
        }
        else{
            System.out.print("You are not young");
        }

    }
}

