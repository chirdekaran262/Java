abstract class Super{
    void method_1(){
        System.out.println("Method_1");
    }
    abstract void method_2();
} 
class sub extends Super{
    @Override
    void method_2(){
        System.out.println("Method_2");
    }
    void method_3(){
        System.out.println("Method_3");
    }
}
public class abstract_1 {
    public static void main(String[] args) {
        Super s=new sub();
        s.method_1();
        s.method_2();
    }
}
