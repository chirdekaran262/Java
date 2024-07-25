import java.io.FileInputStream;
import java.util.*;

public class collection_12 {
    public static void main(String[] args) {
        Properties p=new Properties();
        p.load(new FileInputStream("karan.txt"));
        System.out.println(p.getProperty("Name"));
    }
}
