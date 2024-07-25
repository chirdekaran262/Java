class mydata{
    synchronized
        void display(String str){
            for(int i=0;i<str.length();i++){
                System.out.println(str.charAt(i));
            }
        }
    }

class mythread1 extends Thread{
    mydata d1;
    mythread1(mydata data){
        d1=data;
    }
    public void run(){
        d1.display("Hello,world");
    }
}
class mythread2 extends Thread{
    mydata d2;
    mythread2(mydata data){
        d2=data;
    }
    public void run(){
        d2.display("Welcome");
    }
}

public class thread_5 {
    public static void main(String[] args) {
        mydata d=new mydata();
        mythread1 t1=new mythread1(d);
        mythread2 t2=new mythread2(d);
        t1.start();
        t2.start();
    }
}
