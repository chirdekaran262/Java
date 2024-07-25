import java.util.*;

public class collection_9 {
    public static void main(String[] args)  {
        LinkedHashMap<Integer,String> lh=new LinkedHashMap<>();
        lh.put(1, "A");
        lh.put(2, "B");
        lh.put(3, "C");
        lh.put(4, "D");
        lh.put(5, "E");
        String s=lh.get(2);
        s=lh.get(5);
        lh.forEach((k,v)->System.out.println(k+" "+v));
    }
}
