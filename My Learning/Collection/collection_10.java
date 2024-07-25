import java.util.*;

public class collection_10 {
    public static void main(String[] args) {
        HashSet <String> lh=new HashSet<>(10);
        lh.add("A");
        lh.add("B");
        lh.add("C");
        lh.add("D");
        lh.add("E");
        Iterator<String> itr=lh.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
