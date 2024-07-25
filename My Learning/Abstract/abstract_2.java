abstract class shape{
    abstract double perimeter();
    abstract double area();
}
class circle extends shape{
    double redius;
    circle(double redius){
        this.redius=redius;
    }
    @Override
    double area(){
        return 3.14*redius*redius;
    }
    @Override
    double perimeter(){
        return 2*3.14*redius;
    }
}
class rectangle extends shape{
    double length,breath;
    rectangle(double length,double breath){
        this.length=length;
        this.breath=breath;
    }
    @Override
    double area(){
        return length*breath;
    }
    @Override
    double perimeter(){
        return 2*(length+breath);
    }
}
public class abstract_2 {
    public static void main(String[] args) {
        shape r=new rectangle(20, 15);
        shape c=new circle(20);
        System.out.println(r.area());
        System.out.println(c.area());
        System.out.println(r.perimeter());
        System.out.println(c.perimeter());
    }
}
