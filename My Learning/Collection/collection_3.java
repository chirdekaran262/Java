import java.util.*;

public class collection_3 {
    public static void main(String[] args) {
        ArrayDeque<Integer> aq=new ArrayDeque<>();
        aq.offerLast(10);
        aq.offerLast(20);
        aq.offerLast(30);
        aq.offerLast(40);
        aq.offerLast(60);
        aq.offerLast(70);
        aq.offerLast(80);
        aq.offerLast(90);
        aq.offerLast(100);
        aq.pollLast();
        aq.forEach((x)->System.out.println(x));
        //aq.offerFirst(1);
        aq.forEach((x)->System.out.println(x));

    }
}
