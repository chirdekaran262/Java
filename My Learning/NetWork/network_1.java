package packnet;
import java.net.*;
import java.io.*;

public class network_1 {
    public static void main(String[] args) throws Exception {
        ServerSocket ss=new ServerSocket(2000);
        Socket sk=ss.accept();

        BufferedReader bf=new BufferedReader(new InputStreamReader(sk.getInputStream()));
        PrintStream ps=new PrintStream(sk.getOutputStream());
        String msg;
        StringBuilder sb;
        do{
            msg=bf.readLine();
            sb=new StringBuilder(msg);
            sb.reverse();
            msg=sb.toString();

            ps.println(msg);
        }while(!msg.equals("dne"));
    }
}


class client{
     public static void run() throws Exception {

        Socket ss=new Socket("192.168.43.192",2000);
        BufferedReader keyb=new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bf=new BufferedReader(new InputStreamReader(ss.getInputStream()));
        PrintStream ps=new PrintStream(ss.getOutputStream());
        String msg;
        do{
            msg=keyb.readLine();
            ps.println(msg);
            msg=bf.readLine();
            System.out.println("From Server "+msg);
        }while(!msg.equals("dne"));
        
    }
}

