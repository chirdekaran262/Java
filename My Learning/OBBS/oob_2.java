class rectangle{
    private int length=10;
    private int breath=5;
    public double area(){
        return length*breath;
    } 
    public double perimeter(){
        return 2*(length+breath);
    } 
    public boolean issquare(){
        if(length==breath){
            return true;
        }
        else{
            return false;
        }
    }
    public int setlength(int l){
        length=l;
        return length;
    }
    public int getlength(){
        return length;
    }
}

public class oob_2 {
    public static void main(String[] args) {
        rectangle r=new rectangle();
        int l=25;
        System.out.println("area= "+r.area());
        System.out.println("perimeter= "+r.perimeter());
        System.out.println("it is square= "+r.issquare());
        System.out.println("length= "+r.getlength());
        System.out.println("set length: "+r.setlength(l));
    }
}
