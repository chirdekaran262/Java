class mythread extends Thread{
    mythread(String name){
        super(name);
        //setPriority(Thread.MAX_PRIORITY+2);
        //setPriority(Thread.MIN_PRIORITY+2);
    }
    public void run(){
        int i=1;
        while(true){
            System.out.println(i+" Hello");
            i++;
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }

}
public class thread_3 {
    public static void main(String[] args) {
        mythread tr=new mythread("My thread 1");
        /*System.out.println("Id "+tr.getId());
        System.out.println("Name "+tr.getName());
        System.out.println("Priority "+tr.getPriority());
        System.out.println("State "+tr.getState());
        System.out.println("Alive "+tr.isAlive());*/
        tr.start();
        tr.interrupt();
        int i=1;
        while(true){
            System.out.println(i+" World!");
            i++;
        
         try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        
        }
    }
}
