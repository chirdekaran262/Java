class mythrea extends Thread{
    public void run(){
        int i=0;
        while(true){
            System.out.println(i+" my thread");
        }
    }
}
public class thread_4 {
    public static void main(String[] args) {
        mythrea t=new mythrea();
        t.start();
        int i=0;
        while(true){
            System.out.println(i+" main");
            Thread.yield();
            i++;
        }
    }
}
