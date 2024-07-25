class account{
    String accno;
    String name;
    String address;
    String phono;
    String dob;
    long balance=0;
    account(String acc,String n,String ad,String ph,String d,long b){
        accno=acc;
        name=n;
        address=ad;
        phono=ph;
        dob=d;
        balance=b;
    }
    void display(){
        System.out.println("accno is "+accno);
        System.out.println("name is "+name);
        System.out.println("phono is "+phono);
        System.out.println("address is "+address);
        System.out.println("dob is "+dob);
        System.out.println("balance is "+balance);
    }
    void setbalance(long b){
        balance=b;
    }
}
class savingacc extends account{
    savingacc(){
        super("43i02", "k", "kkkkk", "902", "209290", 892774);
    }
    void deposit(long saving){
        balance=+saving;
    }
    void withdraw(long wd){
        balance=-wd;
    }
}
class loanaccount extends account{
    loanaccount(){
        super("43i02",s "k", "kkkkk", "902", "209290", 892774);
    }
    void emi(long amt){
        balance=-amt;
    }
    void repay(long amt){
        if(balance==amt){
            balance=0;
        }
    }
}

public class inheritance_2 {
    public static void main(String[] args) {
        account ac=new account("43i02", "k", "kkkkk", "902", "209290", 892774);
        savingacc sc=new savingacc();
        loanaccount lc=new loanaccount();
        sc.display();
        lc.display();
        lc.setbalance(900000);
        lc.display();
        sc.setbalance(800000);
        sc.display();
        sc.deposit(50000);
        sc.display();
        sc.withdraw(500000);
        sc.display();
        lc.emi(20000);
        lc.display();
        lc.repay(720000);
        lc.display();
    }
}
