class whiteboard{
    String text;
    int numofstu=8;
    int count=0;
    public void attendance(){
        numofstu++;
    }
    synchronized public void write(String t){
        System.out.println("Teacher is writing"+t);
        while(count!=0){
            try{
                wait();
            }
            catch(Exception e){

            }
            text=t;
            count=numofstu;
            notify();
        }
    }

    synchronized public String read(){
        while(count==0){
            try{
                wait();
            }
            catch(Exception e){

            }
        }
        String t=text;
        count--;
        if(count==0){
            notify();
        }    
        return t;
    }
}
class Teacher extends Thread{
    whiteboard wt;
    String notes[]={"Java is simple lang","java is oobs","java most popular programming lang"};
    public Teacher(whiteboard w){
        wt=w;
    }
    public void run(){
        for(int i=0;i<notes.length;i++){
            wt.write(notes[i]);
        }
    }
}
class student extends Thread{
    whiteboard wt;
    String name;
    
    public student(whiteboard w,String n){
        wt=w;
        name=n;
    }
    public void run(){
        String text;
        wt.attendance();
        do{
            text=wt.read();
            System.out.println(name+" Reading "+text);
            System.out.flush();
        }while(!text.equals("end"));
    }
}

public class thread_8 {
    public static void main(String[] args) {
        whiteboard wt=new whiteboard();
        Teacher t=new Teacher(wt);
        student s1=new student(wt, "1. cummins");
        student s2=new student(wt, "1. warner");
        student s3=new student(wt, "1. smith");
        student s4=new student(wt, "1. carry");
        student s5=new student(wt, "1. head");
        t.start();
        s1.start();
        s2.start();
        s3.start();
        s4.start();
        s5.start();
    }
}
