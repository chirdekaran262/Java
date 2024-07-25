import java.util.*;
import java.io.*;
public class collection_13 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis=new FileInputStream("karan.txt");
        byte b[]=new byte[fis.available()];
        fis.read(b);
        String data=new String(b);
        StringTokenizer stk=new StringTokenizer(data, ",", false);
        String s;
        ArrayList<Integer> al=new ArrayList<>();
        while(stk.hasMoreTokens()){
            s=stk.nextToken();
            al.add(Integer.valueOf(s));
        }
        System.out.println(al);
    }
}
