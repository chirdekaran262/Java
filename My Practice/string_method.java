public class string_method {
    public static void main(String[] args) {
        String str1=new String("karan");
        System.out.println(str1);

        char sr[] ={'c','h','i','r','d','e'};
        String str2=new String(sr);
        System.out.println(str2);

        byte b[]={65,66,67,68,69,70};
        String str3=new String(b);
        System.out.println(str3);

        System.out.println(str1.length());
        System.out.println(str1.concat(" chirde"));
        System.out.println(str1.replace("k", "K"));        
        System.out.println(str1.charAt(3));
        System.out.println(str1.startsWith("Ka"));
        System.out.println(str1.indexOf("n"));
        System.out.println(str1.endsWith("an"));
    
        String str4="JAVA";
        String str5="java";
        System.out.println(str4.equals(str5));
        System.out.println(str4.equalsIgnoreCase(str5));
        System.out.println(str4.compareTo(str5));
        System.out.println(str1.valueOf(3));

    }
}
