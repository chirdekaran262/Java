public class masking {
    public static void main(String[] args) {
        int a=10,b=6;
        a=a^b;
        System.out.println("a "+a);
        b=a&b;
        System.out.println("b "+b);
        a=a^b;
        System.out.println("a "+a);
    }
}
