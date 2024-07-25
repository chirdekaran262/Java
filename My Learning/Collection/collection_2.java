import java.util.*;

public class collection_2{
    public static void main(String[] args) {
        LinkedList<Integer> al1=new LinkedList<>();
        LinkedList<Integer> al2=new LinkedList<>(List.of(10,20,30,40,50));
        al1.add(3);
        al1.add(5);
        al1.add(20);
        al1.add(0,6);
        al1.addAll(1,al2);
        al1.addFirst(90);
        al1.addLast(100);
        al1.set(8, 60);
        System.out.println(al1.size());
        for(Integer x:al1){
            System.out.print(" "+x);
        }
        System.out.println('\n');
        ListIterator<Integer> it=al1.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
    }
}
