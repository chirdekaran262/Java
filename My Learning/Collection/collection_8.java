import java.util.*;

public class collection_8 {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm=new TreeMap<>(Map.of(0, "A", 1, "B", 2, "C", 3, "D"));
        tm.put(4, "E");
        tm.put(5, "F");
        System.out.println(tm.ceilingEntry(5).getValue());
        tm.get(3);
        System.out.println(tm);
    }
}
