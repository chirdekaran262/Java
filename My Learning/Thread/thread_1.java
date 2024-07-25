
 class thread_1 extends Thread{
    public void run(){
        int i=0;
        while(true){
            System.out.println(i+"Hello,");
            i++;
        }
    }


    public static void main(String[] args) {
        thread_1 tr=new thread_1();
        tr.start();
        int i=0;
        while(true){
            System.out.println(i+"World!");
            i++;
        }
    }
}
