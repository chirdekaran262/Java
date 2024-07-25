class NegativeDimension extends Exception{
    public  String toString(){
        return "Dimension of rectangle can not be negative.";
    }
}
public class excepation_4 {
    static int area(int l,int b) throws NegativeDimension{
        if(l<0 || b<0){
            throw new NegativeDimension();
        }
        return l*b;
    }
    static void displayarea() throws NegativeDimension{
        System.out.println("Area of reactangle is "+area(40,20));
    }
    static void show(){
        try{
            displayarea();
        }
        catch(NegativeDimension e){
            System.out.println("Error is: "+e);
        }
    }
    public static void main(String[] args) {
        show();
        System.out.println("Program run");
    }
}
