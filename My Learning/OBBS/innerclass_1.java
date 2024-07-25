class outer{
    int x=10;
    class inner{
        int y=10;
        void innerdisplay(){
            System.out.println("inner class: "+y);
        }
    }
    inner i=new inner();
    void outerdiaplay(){
        System.out.println("x: "+x);
        System.out.println("y: "+i.y);
    }
}
public class innerclass_1 {
    public static void main(String[] args) {
        outer o=new outer();
        System.out.println("inner y:"+o.i.y);
        o.outerdiaplay();
        o.i.innerdisplay();
        outer.inner in=new outer().new inner();
        in.innerdisplay();
    }
}
