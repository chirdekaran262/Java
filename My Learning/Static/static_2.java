class sample{
    static{
        
        System.out.println("blaock_1");
    }
    static{
        System.out.println("block_2");
    }
}
public class static_2 {
   
    public static void main(String[] args) {
        sample s=new sample();
        System.out.println("main");
        
    }
    
}
