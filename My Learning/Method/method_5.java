public class method_5 {
    static void show(int start,String ...s){
        for(int i=0;i<s.length;i++){
            System.out.println(start+". "+s[i]);
            start++;
        }
    }
    public static void main(String[] args) {
        show(5,"karan","chirde","baldi","cse","sggs");
    }
}
