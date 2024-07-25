class Super{
    void meth1(){
        System.out.println("method_1");
    }
    void meth2(){
        System.out.println("method_2");
    }
}
class sub extends Super{
    @Override
    void meth2(){
        System.out.println("method__2");
    }
    
    void meth3(){
        System.out.println("method_3");
    }
}
public class inheritance_6 {
    public static void main(String[] args) {
        Super s=new sub();
        s.meth1();
        s.meth2();
        
    }
}
