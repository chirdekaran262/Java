import java.lang.reflect.Array;
import java.util.*;
class my implements Comparator<Integer>{
    public int compare(Integer i1,Integer i2){
        if(i1<i2)
            return 1;
        if(i1>i2)
            return -1;
        return 0;
    }
}

public class collection_15 {
    public static void main(String[] args) {
        Integer a[]={2,4,6,8,1,3,5,7,9};
        Arrays.sort(a);
        for(Integer x:a){
            System.out.println(x);
        }
    }
}
