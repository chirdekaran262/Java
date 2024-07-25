package anademo;
@interface myanno{
    String name();
    String project();
    String date() default "today";
    String version() default "13";
}
@myanno(name="Karan",project = "bank")
public class doct_3 {
    //@myanno(name="Karan")
    int data=1;
    //@myanno(name="Karan")
    public static void main(String[] args) {
        //@myanno(name="Karan")
        int x;
    }
}
