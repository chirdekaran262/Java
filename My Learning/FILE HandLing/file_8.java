import java.io.*;
class producer extends Thread{
    OutputStream os;
    public producer(OutputStream o){
        os=o;
    }
    public void run(){
        int count=1;
        while(true){
            try{
                os.write(count);
                os.flush();
                System.out.println("producer "+count);
                System.out.flush();
                Thread.sleep(10);
                count++;
            }
            catch(Exception e){
                
            }
        }
    }
}
class consumer extends Thread{
    InputStream is;
    public consumer(InputStream i){
        is=i;
    }
    public void run(){
        int x;
        while(true){
            try{
                x=is.read();
                System.out.println("consumer "+x);
                System.out.flush();
                Thread.sleep(10);
            }
            catch(Exception e){

            }
        }
    }
}
public class file_8 {
    public static void main(String[] args) {
        PipedInputStream pis=new PipedInputStream();
        PipedOutputStream pos=new PipedOutputStream();
        pos.connect(pis);
        producer p=new producer(pos);
        consumer c=new consumer(pis);
        p.start();
        c.start();
    }
}
