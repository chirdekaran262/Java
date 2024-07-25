package anademo;
//@Retention(retentionPolicy.class)
//@Documented
//@Target(value=Elementtype.LOCAL_VARIABLE,ElementType.METHOD)
//Repeatable(myanno.class)
@interface myanno{
    String name();
    String project();
    String date() default "today";
    String version() default "13";
}
//@myanno(name="Karan",project = "bank")
public class doct_4 {
    //@myanno(name="Karan")
    int data=1;
    //@myanno(name="Karan")
    public static void main(String[] args) {
        //@myanno(name="Karan")
        int x;
    }
}
