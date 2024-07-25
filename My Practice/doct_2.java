class A{
    public void display(){

    }
}
class B extends A{
    @Override
    public void display(){

    }
    @Deprecated
    public void show(){

    }
}
public class doct_2 {
    public static void main(String[] args) {
        @SuppressWarnings("deprecation")
        B b=new B();
        b.show();

    }
}
