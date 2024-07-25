class coffemacine{
    private float caffq;
    private float sugq;
    private float watq;
    private float milq;
    static coffemacine my=null;
    private coffemacine(){
        caffq=1;
        sugq=1;
        watq=1;
        milq=1;
    }
    public void fillwater(float qty){
        watq=qty;
    }
    public void fillsuger(float qty){
        sugq=qty;
    }
    public void fillmilk(float qty){
        milq=qty;
    }
    public float goatcoffe(){
        return 0.15f;
    }
    static coffemacine getInstance(){
        if(my==null)
            my=new coffemacine();
        return my;
    }
}
public class static_4 {
    public static void main(String[] args) {
        coffemacine m1=coffemacine.getInstance();
        coffemacine m2=coffemacine.getInstance();
        coffemacine m3=coffemacine.getInstance();
        System.out.println(m1+" "+m2+" "+m3);
        if(m1==m2 && m2==m3){
            System.out.println("same");
        }
    }
}
