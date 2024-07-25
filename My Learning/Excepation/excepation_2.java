public class excepation_2 {
    public static void main(String[] args) {
        int a[]={34,23,87,46,0};
        try{
            int c=a[0]/a[4];
            System.out.println("Division is: "+c);       
            System.out.println(a[3]);  
        }     
        catch(ArithmeticException e){
            System.out.println("Error is: "+e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error is: "+e);
        }
        System.out.println("Program run");
    }
}
