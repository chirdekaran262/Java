import java.util.*;
public class method_3 {
    static boolean validit(String name){
        return name.matches("[a-aA-z\\s]+");
    }
    static boolean validit(int age){
        return age>3&&age<15;
    }
    public static void main(String[] args) {
        System.out.println("validition: "+validit("Kar@n"));
        System.out.println("validition: "+validit(5));
    }
}
