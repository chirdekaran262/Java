public class method_8  {
    static double inr(Double ...a){
        if(a.length==0){
            return Integer.MIN_VALUE;
        }
        double sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        double intrest=0;
        if(sum<=500){
            intrest= sum*0.1;
        }
        else if(sum<1000){
            intrest= sum*0.15;
        }
        else if(1000<=sum){
            intrest= sum*0.2;
        }
        return intrest;
    }
    public static void main(String[] args) {
        double k=inr(5,2,7,4,9,1);
        System.out.print("Intrest: "+k);
    }
}
