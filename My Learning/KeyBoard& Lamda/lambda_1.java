interface mylambda{
    public void display();
}


public class lambda_1 {
   public static void main(String[] args) {
     mylambda m=()->System.out.println("Hello, World!");
    m.display();
   }
}
