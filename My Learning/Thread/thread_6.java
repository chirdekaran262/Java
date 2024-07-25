class ATM{
    synchronized void checkbalance(String name){
        System.out.println(name+" checking");
    
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){
        }
        System.out.print("Balance");
    }
    synchronized public void withdraw(String name,long amount){
        System.out.println(name+" Withdrawing");
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){}
        System.out.println(amount);
    }
}
class coustmer extends Thread{
    String name;
    long amount;
    ATM atm;
    coustmer(String n,long am,ATM a){
        name=n;
        amount=am;
        atm=a;
    }
    public void useATM(){
        atm.checkbalance(name);
        atm.withdraw(name, amount);
    }
    public void run(){
        useATM();
    }
}

public class thread_6 {
    public static void main(String[] args) {
        ATM at=new ATM();
        coustmer c=new coustmer("Karan", 4308954, at);
        c.start();
    }
}
