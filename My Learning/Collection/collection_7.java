import java.util.*;

class Point implements Comparable{
    int x;
    int y;
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    public String toString(){
        return "x="+x+" y="+y;
    }
    public int compareTo(Point p){
        if(this.x<p.x)
            return -1;
        else if(this.x>p.x)
            return 1;
        else{
            if (this.y<p.y)
                return -1;
            else if(this.y>p.y)
                return 1;
            else
                return 0; 
        }
    }
}

public class collection_7 {
    public static void main(String[] args) {
        TreeSet<Point> t=new TreeSet<>();

        t.add(new Point(1,1));
        t.add(new Point(5,5));
        t.add(new Point(5,2));
        System.out.println(t);
    }
}
