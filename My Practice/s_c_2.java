import java.util.*;
public class s_c_2 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str;
    System.out.print("Enter the domian name: ");
    str=sc.nextLine();
    String ext=str.substring(str.lastIndexOf(".")+1);
    switch(ext){
        case "com":
            System.out.print("Commorical");
            break;
        case "org":
            System.out.print("organistion ");
            break;
        case "gov":
            System.out.print("goverment ");
            break;
        case "net":
            System.out.print("network ");
            break;
        default:
            System.out.print("other ");
            break;
    }
   } 
}
