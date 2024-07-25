class product{
    private String name;
    private int batch_no,capacity;
    product(String n,int b,int c){
        batch_no=b;
        name=n;
        capacity=c;
    }
    void display(){
        System.out.println(name);
        System.out.println(batch_no);
        System.out.println(capacity);
    }
}
public class oob_4 {
    public static void main(String[] args) {
        product p=new product( "k",20, 30);
        p.display();
    }
}
