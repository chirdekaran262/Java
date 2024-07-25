import java.util.*;
class mycom implements Comparator<Integer>{
    public int compare(Integer o1,Integer o2){
        if(o1<o2)return -1;
        if(o1>o2)return 1;
        return 0;
    }
}
public class collection_4 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(new mycom());
        pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.add(40);
        pq.add(50);
        pq.add(60);
        pq.add(70);
        pq.add(80);
        pq.add(90);
        pq.add(100);
        pq.add(110);
        System.out.println(pq.peek());
        pq.forEach((x)->System.out.println(x));
        pq.poll();
        System.out.println("After deleting: ");
        pq.forEach((x)->System.out.println(x));

    }
}
