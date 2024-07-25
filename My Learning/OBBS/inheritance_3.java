class Super{
    void display(){
        System.out.println("Hello");
    }
}
class subclass extends Super{
    void display(){
        System.out.println("Hello,world!");
    }
}
public class inheritance_3 {
    public static void main(String[] args) {
        Super s=new Super();
        subclass su=new subclass();
        su.display();
        s.display();
    }
}
