interface member{
    public void callback();
}
class store{
    member mem[]=new member[10];
    int count=0;
    void register(member m){
        mem[count++]=m;
    }
    void invitesale(){
        for(int i=0;i<count;i++){
            mem[i].callback();
        }
    }
}
class coustmer implements member{
    String name;
    coustmer(String n){
        name=n;
    }
    public void callback(){
        System.out.println("ok i will visit "+name);
    }
}
public class interface_3 {
    public static void main(String[] args) {
        store s=new store();
        coustmer c1=new coustmer("k");
        coustmer c2=new coustmer("c");
        s.register(c1);
        s.register(c2);
        s.invitesale();
    }
}
