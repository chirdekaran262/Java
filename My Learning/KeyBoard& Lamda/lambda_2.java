interface my{
    public int display(int x,int y);
}
public class lambda_2 {
    public static void main(String[] args) {
        my m=(a,b)->a+b;
        int c=m.display(10, 20);
        System.out.println("Addition of a and b is: "+c);
    }
}
