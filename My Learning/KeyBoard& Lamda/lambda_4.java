interface my{
public void display(String s1,String s2);
}
public class lambda_4 {
    public lambda_4(String s){
        System.out.println(s.toUpperCase());
    }
    public static void main(String[] args) {
        my m=String::compareTo;
               System.out.println(m.display("Hello","world"));
    }
}
