import javax.security.auth.Subject;

class sub{
    private String name;
    private String subid;
    private int maxmark;
    private int obtmark;
    sub(String name,String stuid,int maxmark,int obtmark){
        this.name=name;
        this.subid=stuid;
        this.maxmark=maxmark;
    }
    String n(){
        return name;
    }
    String s(){
        return subid;
    }
    int  mm(){
        return maxmark;
    }
    void setmmark(int mm){
        maxmark=mm;
    }
    void setomark(int obm){
        maxmark=obm;
    }
    int ob(){
        return obtmark;
    }
    boolean qulified(){
        if (obtmark>=maxmark/10*4){
            return true;
        }
        else{
            return false;
        }
    }
    String st(){
        return "\n subid: "+subid+"\n name: "+name+"\n maxmark: "+maxmark+"\n obtmark: "+obtmark;
    }
}
public class oob_5 {
    public static void main(String[] args) {
        sub s[]=new sub[3];
        s[0]=new sub("s10","DS",100,80);
        s[1]=new sub("s11","JAVA",100,82);
        s[2]=new sub("s11","NSC",100,85);
        for(sub su:s){
            System.out.println(su);
        }
    }
}
