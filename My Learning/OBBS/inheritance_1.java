package inher_pack;
import java.math.*;
class circle{
    double redius;
    double area(){
        return  Math.PI*redius;
    }
}

class cylinder extends circle{
    double height;
    
    double area(){
        return  2*Math.PI*redius*height+2*Math.PI*redius*redius;
    }
}
public class inheritance_1 {
    public static void main(String[] args) {
        circle c=new circle();
        c.redius=10;
        System.out.println(c.area());
        c.redius=15;
        System.out.println(c.area());
        cylinder cy=new cylinder();
        cy.height=14;
        cy.redius=16;
        System.out.println(cy.area());
    }
}
