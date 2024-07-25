public class method_6 {
    static int max(int ...a){
        if(a.length==0){
            return Integer.MIN_VALUE;
        }
        int m;
        m=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>m){
                m=a[i];
            }
        }
        return m;
    }
    public static void main(String[] args) {
        int k=max(5,2,7,4,9,1);
        System.out.print(k);
    }
}
