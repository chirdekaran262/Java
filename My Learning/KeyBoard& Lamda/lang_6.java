public class lang_6 {
    public static void main(String[] args) {
        System.out.println("Absolute: "+Math.abs(-123));
        System.out.println("Absolute: "+StrictMath.abs(-123));
        System.out.println("Cube root: "+Math.cbrt(125));
        int i=Integer.MAX_VALUE;
        i--;
        System.out.println("Exact: ");
        System.out.println("Exponent value in floating point rep.: ");
        System.out.println(Math.getExponent(1134.32));
        System.out.println("Round Division: "+Math.floorDiv(40,3));
        System.out.println("e power x: "+Math.exp(1));
        System.out.println("e power x: "+StrictMath.exp(1));
        System.out.println("Log base 10: "+Math.log10(100));
    }
}
