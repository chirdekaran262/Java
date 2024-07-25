interface test{
    final static int x=10;
    public abstract void method_1();
    public abstract void method_2();
    public static void method_3(){
        System.out.println("Method_3");
    }
}
interface test2 extends test{
    void method_4();
}
class my implements test2{
    public void method_1(){
        System.out.println("method_1");
    }
    public void method_2(){
        System.out.println("method_2");
    }
    public void method_4(){
        System.out.println("method_4");
    }
}
public class interface_4 {
    public static void main(String[] args) {
        System.out.println(test.x);
        test.method_3();
    }
}
