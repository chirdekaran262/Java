import java.util.*;
import java.io.*;
class Account implements Serializable
{
    String accno;
    String name;
    double balance;
    
    Account(){}
    
    Account(String a,String n,double b)
    {
        accno=a;
        name=n;
        balance=b;
    }
    
    public String toString()
    {
        return "Account No:"+accno+"\nName :"+name+"\nBalance :"+balance+"\n";
    }
}

public class collection_16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Account ac=null;
        HashMap<String,account> hm=new HashMap<>();

        try{
            FileInputStream fis=new FileInputStream("sample.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);

            int count=ois.readInt();
            for(int i=0;i<count;i++){
                ac=(Account)ois.readObject();
                System.out.println(ac);
                hm.put(ac.accno,ac);
            }
            fis.close();
            ois.close();
        }
        catch(Exception e){

        }
        FileOutputStream fos=new FileOutputStream("sample.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        System.out.println("MENU");
        int choice;
         String accno;
        String name;
        double balance;
        do{
            System.out.println("1. Create account");
            System.out.println("2. Delete account");
            System.out.println("3. view account");
            System.out.println("4. view all account");
            System.out.println("5. save account");
            System.out.println("6. EXIT account");
            System.out.println("7. Enter your choice");
            choice=sc.nextInt();
            sc.skip("(\r\n|[\n\ru2028\u2029\u0085])?");
            switch (choice) {
                case 1:
                    System.out.println("Enter Detials accNo,Name,balance: ");
                    accno=sc.nextLine();
                    name=sc.nextLine();
                    balance=sc.nextDouble();
                    ac=new Account(accno,name,balance);
                    hm.put(accno,name);
                    System.out.println("Account created for "+name);
                    break;
                case 2:
                    System.out.println("Enter accno: ");
                    accno=sc.nextLine();
                    hm.remove(accno);
                    break;
                case 3:
                    System.out.println("Enter accno: ");
                    accno=sc.nextLine();
                    ac=hm.get(accno);
                    System.out.println(ac);
                case 4:
                    for(Account a:hm.values()){
                        System.out.println(a);
                    }
                    break;
                case 5:
                case 6:
                    oos.writeInt(hm.size());
                    for(Account a:hm.values())
                        oos.writeInt(a);

                default:
                    break;
            }
        }while(choice!=6);
        oos.flush();
        fos.close();
        oos.close();
    }
}
