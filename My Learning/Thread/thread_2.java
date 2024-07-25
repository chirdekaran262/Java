 class thread_2 implements Runnable {
    public void run(){
        int i=1;
        while(true){
            System.out.println(i+"Hello");
            i++;
        }
    }
    public static void main(String[] args) {
        thread_2 t=new thread_2();
        Thread tr=new Thread(t);
        tr.start();
        int i=1;
        while(true){
            System.out.println(i+"World!");
            i++;
        }
    }
}
