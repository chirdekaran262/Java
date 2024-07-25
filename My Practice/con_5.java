import java.util.*;;
public class con_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String num;
        System.out.println("Enter the a number: ");
        num=sc.nextLine();
        if(num.matches("[0-1]+")){
            System.out.println(num+" is binary number");
        }
        else if(num.matches("[0-7]+")){
            System.out.println(num+" is octal number");
        }
        else if(num.matches("[0-9]+")){
            System.out.println(num+" is decimal number");
        }
        else if(num.matches("[0-9A-F]+")){
            System.out.println(num+" is Hexadecimal number");
        }
        else{
                System.out.println(num+" It is not number.");
        }
    }
}
