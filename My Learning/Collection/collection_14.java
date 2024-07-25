import java.util.*;

public class collection_14 {
    public static void main(String[] args) {
        BitSet b=new BitSet();
        b.set(1);
        b.set(2);
        b.set(3);
        b.set(4);
        b.set(5);
        b.set(6);
        b.set(7);
        BitSet b1=new BitSet();
        b1.set(8);
        b1.set(9);
        b1.set(10);
        b1.set(11);
        b1.set(12);
        b1.set(13);
        b1.set(14);
        b.and(b1);
        b.or(b1);
        b.flip(0, b1.length());
        System.out.println(b);
    }
}
