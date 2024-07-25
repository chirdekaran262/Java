class TV{
    void switcon(){
        System.out.println("TV is ON");
    }
    void channelchange(){
        System.out.println("TV channel change");
    }
}
class smartTV extends TV{
    @Override
    void switcon(){
        System.out.println("smartTV is ON");
    }
    @Override
    void channelchange(){
        System.out.println("smartTV channel change");
    }
    void browse(){
        System.out.println("smartTV browse");
    }
}
public class inheritance_4 {
   public static void main(String[] args) {
    TV t=new smartTV();
    t.switcon();
    t.channelchange();
   }
}
