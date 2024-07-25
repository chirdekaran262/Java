import java.lang.*;
public class inc_dec {
    public static void main(String[] args) {
        int x=5;
        System.out.println("x "+x);
        int y=x++;
        System.out.println("y "+y);
        y=++x;
        System.out.println("y "+y);
        int a=10;
        System.out.println("a "+a);
        int b=a--;
        System.out.println("b "+b);
        b=--a;
        System.out.println("b "+b);
    }
}
