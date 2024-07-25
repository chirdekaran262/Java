class phone{
    public void call(){
        System.out.println("Calling the phone");
    }
    public void sms(){
        System.out.println("sms the phone");
    }
}
interface Imusic{
    void play();
    void stop();
}
interface Icamera{
    void click();
    void see();
}
class smartphone extends phone implements Imusic,Icamera{
    public  void videocall(){
        System.out.println("Calling the video call");
    }
    public void play(){
        System.out.println("play the music");
    }
    public void stop(){
        System.out.println("stop the music");
    }
    public void click(){
        System.out.println("click the photo");
    }
    public void see(){
        System.out.println("see the clicked photo");
    }
}
public class interface_2 {
    public static void main(String[] args) {
        smartphone s=new smartphone();
        s.call();
        s.click();
        s.play();
    }
}
