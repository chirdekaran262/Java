import java.util.*;
import java.lang.*;
public class method_2 {
    static int max(int x,int y){
        return x>y?x:y;
    } 
    /*static int max(int x,int y,int z){
        return x>y>z?x:y:z;
    }*/
    static float max(float x,float y){
        return x>y?x:y;
    }
   public static void main(String[] args) {
    System.out.println(max(10,20));
    System.out.println(max(110f,20f));
   }
}
