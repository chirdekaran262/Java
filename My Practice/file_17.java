package filepack3;
import java.io.*;
public class file_17 {
    public static void main(String[] args) throws Exception{
        float l[]={2.3f,4.5f,1.9f,8.2f,3.3f};
        FileOutputStream fos=new FileOutputStream("list.txt");
        DataOutputStream dos=new DataOutputStream(fos);
        dos.writeInt(l.length);
        for(float f:l){
            dos.writeFloat(f);
        }
        dos.close();
        fos.close();
        FileInputStream fis=new FileInputStream("list.txt");
        DataInputStream dis=new DataInputStream(fis);
        int length=dis.readInt();
        float data;
        for(int i=0;i<length;i++){
            data=dis.readFloat();
            System.out.println(data);
        }
        dis.close();
        fis.close();
    }
}
