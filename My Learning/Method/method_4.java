public class method_4 {
    static void array(int ...a){
        for(int x:a){
            System.out.print(x);
        }
    }
    public static void main(String[] args) {
        array();
        array(1,2,3,4,5);
        array(new int[]{5,2,9,6,1});
    }
}
