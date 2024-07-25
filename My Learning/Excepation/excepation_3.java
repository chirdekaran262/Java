public class excepation_3 extends sample{
    public String tostring(){
        return "Balance should not be less then 5000";
    }
}

public class chack{
    static void fun1(){
        try{
            throw new excepation_3();
        }
        catch(excepation_3 e){
            System.out.println(e);
        }
    }
    static void fun2(){
        fun1();
    }
    static void fun3(){
        fun2();
    }
    public static void main(String[] args) {
        fun3();
    }
}
