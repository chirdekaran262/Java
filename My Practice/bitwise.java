public class bitwise {
    public static void main(String[] args) {
        int x=5,y=8,z;
        z=x&y;
        System.out.println("x&y is "+z);
        z=x|y;
        System.out.println("y "+z);
        z=~x;
        System.out.println("~x "+x);
        z=x>>1;
        System.out.println("x right shift "+x);
        z=y>>1;
        System.out.println("y left shift "+z);
        z=x>>>1;
        System.out.println("x unsigned left shift "+z);
        z=y>>>1;
        System.out.println("y unsigned right shift "+z);
    }
}
