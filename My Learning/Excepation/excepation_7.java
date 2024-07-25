package mypack2;
class stackoverflow extends Exception{
    public String toString(){
        return "Stack is full"; 
    }
}
class stackunderflow extends Exception{
    public String toString(){
        return "Stack is empty"; 
    }
}
class stack{
    private int size;
    private int top=-1;
    private int s[];

    public stack(int sz){
        size=sz;
        s=new int[sz];
    }
    public void push(int x) throws stackoverflow{
        if(top==size-1){
            throw new stackoverflow();
        }
        top++;
        s[top]=x;
        System.out.println(x+" Element push into the stack.");
    }
    public void pop() throws stackunderflow{
        int x=-1;
        if(top==-1){
            throw new stackunderflow();
        }
        x=s[top];
        top--;
        System.out.println("Element poped is: "+x);
    }
 
}
public class excepation_7{
    public static void main(String[] args) {
        stack st=new stack(5);
        try{
            st.push(10);
            st.push(20);
            st.push(30);
            st.push(40);
            st.push(50);
            st.push(60);
        }
        catch(stackoverflow e){
            System.out.println(e);
        }
        try{
            st.pop();
            st.pop();
            st.pop();
            st.pop();
            st.pop();
            st.pop();
        }
        catch(stackunderflow e){
            System.out.println(e);
        }
        finally{
            System.out.println("program run");
        }
    }
}
