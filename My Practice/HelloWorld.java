public class HelloWorld {

    public static void main(String[] args) {
        String s = "";
        for (int i = 0; i < 5; i++) {
            char d = (char) ('a' + i);
            int e = 'a' + i;
            System.out.printf("Hello world %c\n", d);
            System.out.printf("Hello world %d\n", e);
            s += d;
        }
        System.out.print(s);
    }
}
