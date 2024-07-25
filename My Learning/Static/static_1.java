package sta_pack;
class sample{
    static int x=10;
    int y=20;
    static void smethod(){
        System.out.println("X: "+x);
    }
    void method(){
        System.out.println("X: "+x+" y: "+y);
    }
}
public class static_1 {
    public static void main(String[] args) {
        sample.smethod();
        sample s=new sample();
        sample s1=new sample();
        s1.method();
        s.method();
        sample.x=200;
        s.y=100;
        s.method();
        sample.smethod();
    }
}
