interface test1{
    public abstract void method_1();
    abstract void method_2();
}
interface test2 extends test1{
    void method_4();
}
class test3 implements test2{
    public void method_1(){
        System.out.println("Hello,world!");
    }
    public void method_2(){
        System.out.println("Hello");
    }
    public void method_4(){
        System.out.println("method_4");
    }
}
public class interface_1 {
    public static void main(String[] args) {
        test1 t=new test3();
        test2 t2=new test3();
        t.method_1();
        t.method_2();
        t2.method_4();
}
    }
