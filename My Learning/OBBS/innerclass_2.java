class outer{
    void display(){
        class inner{
            void show(){
                System.out.println("Hello,world!");
            }
        }
        inner i=new inner();
        i.show();
    }
}
class outer1{
    static int x=10;
    int y=20;
    static class inner1{
        void display_1(){
            System.out.println("x: "+x);
            //System.out.println("y: "+y);
        }
    }
}
abstract class out{
    abstract void display_2();
}
class out1{
    public void meth(){
        out o2=new out() {
            void display_2(){
                System.out.println("anonymas class");
            }
        };
        o2.display_2();
    }
}
public class innerclass_2 {
    public static void main(String[] args) {
        outer o=new outer();
        o.display();
        outer1.inner1 o1=new outer1.inner1();
        o1.display_1();
        out1 o3=new out1();
        o3.meth();
    }
}
