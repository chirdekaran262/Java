public class gen_2 {
    public static void main(String[] args) {
        Object obj[]=new Object[3];
        String str;
        obj[0]="Hi";
        obj[1]="Hello";
        obj[2]="Welcome";
        for(int i=0;i<3;i++){
            str=(String)obj[i];
            System.out.println(str);
        }
    }
}
