/**
 * Innerclass
 */
class iic {
    static int a = 10;
    int b = 20;

    static void pr() {
        System.out.println("Inner class static method " + a);
    }

    public void prb() {
        System.out.println("Print the public class " + b);
    }
}

/**
 * InnerInnerclass
 */
public class Iclass extends iic {
    public static void main(String[] args) {
        iic ic = new iic();
        ic.prb();
        pr();

    }

}