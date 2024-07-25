class mydata{
    int value;
    boolean flag=true;
    synchronized public void set(int v){
        while(flag!=true){
            try{
                wait();
            }
            catch(Exception e){

            }
        }
        value=v;
        flag=false;
        notify();
    }
    synchronized public int get(){
        int x=0;
        while(flag!=false){
            try{
                wait();
            }
            catch(Exception e){

            }
        }

        x=value;
        flag=true;
        notify();
        return x;
    }
}

class producer extends Thread{
    mydata data;
    public producer(mydata d){
        data=d;
    }
    public void run(){
        int count=1;
        while(true){
            data.set(count);
            System.out.println("producer "+count);
            count++;
        }
    }
}
class consumer extends Thread{
    mydata data;
    public consumer(mydata d){
        data=d;
    }
    public void run(){
        int value;
        while(true){
           value=data.get();
            System.out.println("producer "+value);
        }
    }
}
public class thread_7 {
    public static void main(String[] args) {
        mydata m=new mydata();
        producer p=new producer(m);
        consumer c=new consumer(m);
        p.start();
        c.start();
    }
}
