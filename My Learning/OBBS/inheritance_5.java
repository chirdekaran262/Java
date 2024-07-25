class car{
    void start(){
        System.out.println("car is start");
    }
    void accelate(){
        System.out.println("car accelarate");
    }
    void changegear(){
        System.out.println("car change gear");
    }
}
class luxarycar extends car{
    
    void openroof(){
        System.out.println("laxurycar oprnroof");
    }
    void changegear(){
        System.out.println("laxurycar change gear");
    }
}

public class inheritance_5 {
   public static void main(String[] args) {
    car c=new luxarycar();
    c.accelate();
    c.changegear();
    luxarycar lc=new luxarycar();
    lc.accelate();
    lc.changegear();
    lc.openroof();
    lc.start();
   }
}
