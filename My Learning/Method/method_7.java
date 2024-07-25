public class method_7 {
    static int sum(int ...a){
        if(a.length==0){
            return Integer.MIN_VALUE;
        }
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int k=sum(5,2,7,4,9,1);
        System.out.print(k);
    }
}

