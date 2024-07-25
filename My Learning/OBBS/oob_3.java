class rectangle{
    int length,breath;
    public rectangle(int l,int b){
        length=l;
        breath=b;
    }
    int area(){
        return length*breath;
    }
}
public class oob_3 {
    public static void main(String[] args) {
        int l,b;
        rectangle r=new rectangle(30,20);
        int a=r.area();
        System.out.println(a);
    }
}
