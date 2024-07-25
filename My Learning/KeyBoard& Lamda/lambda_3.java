import javax.swing.DesktopManager;

interface my{
    public void display();
}
class Demo{
    int temp=20;
    public void show(){
        int count=0;
        my m=()->{
            System.out.println("Karan");
            System.out.println("temp"+(temp++));
        };
        m.display();
    }
}
public class lambda_3 {
    public static void main(String[] args) {
        Demo d=new Demo();
        d.show();
    }
}
