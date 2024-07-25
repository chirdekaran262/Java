import java.util.*;

public class collection_11 {
   public static void main(String[] args) {
    Hashtable<Integer,String> ht=new Hashtable<>();
    ht.put(1, "A");
    ht.put(2, "B");
    ht.put(3, "C");
    ht.put(4, "D");
    ht.put(5, "E");
    String s=(String)ht.get(10);
    Enumeration e=ht.keys();
    while(e.hasMoreElements()){
        System.out.println(e.hasMoreElements());
    }

   } 
}
