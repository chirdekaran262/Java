import java.rmi.server.ObjID;

public class gen_3<T>{
    T data[]=(T[])new Object[3];
    public static void main(String[] args) {
        gen_3<String> gd=new gen_3<>();
        gd.data[0]="Hi";
        gd.data[1]="Welcome";
        gd.data[2]=new Integer(10);
        String str=gd.data[0];
    }
}
