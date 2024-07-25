@SuppressWarnings("uncheked")
class myarray<T>{
    T A[]=(T[]) new Object();
    int length=0;
    public void append(T v){
        A[length++]=v;
    }
    public void display(){
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]);
        }
    }
}
class gen_4{
    public static void main(String[] args) {
        myarray<Integer> ma=new myarray<>();
        ma.append(10);
        ma.append(20);
        ma.append(30);
        ma.display();
    }
}