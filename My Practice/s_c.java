import java.util.Scanner;

public class s_c {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String num;
        System.out.println("Enter the number from 1 to 5: ");
        num=sc.nextLine();
        switch(num){
            case "1":
                System.out.println("one");
                break;
            case "2":
                System.out.println("two");
                break;
            case "3":
                System.out.println("three");
                break;
            case "4":
                System.out.println("four");
                break;
            case "5":
                System.out.println("five");
            default:
                System.out.println("Other then one-five");

        }
        
    }
}
