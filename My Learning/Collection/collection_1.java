import java.util.*;

public class collection_1 {
    public static void main(String[] args) {
        ArrayList<Integer> al1=new ArrayList<>(10);
        ArrayList<Integer> al2=new ArrayList<>(List.of(10,20,30,40,50));
        al1.add(3);
        al1.add(5);
        al1.add(20);
        al1.add(0,6);
        al1.addAll(1,al2);
        System.out.println(al1.get(2));
        System.out.println(al1.contains(20));
        System.out.println(al1.indexOf(20));
        System.out.println(al1.lastIndexOf(20));
        al1.set(8, 60);
        for(Integer x:al1){
            System.out.print(" "+x);
        }
        ListIterator<Integer> it=al1.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        al1.forEach(n->show(n));
        static void show(int n){
            if(n>60)
                System.out.println(n);
        }
    }
}
