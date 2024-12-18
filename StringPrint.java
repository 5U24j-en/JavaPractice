import java.lang.*;


public class StringPrint {
    public static void main(String[] args) 
    {
    int x=10, y=20;
    System.out.println("sum of "+x+" and "+y+" is: "+(x+y));

    String str=new String("   netbeans  ");

    System.err.println(str);
    System.out.println(str.length());
    int len=str.length();

    String str2=str.toUpperCase();
    System.err.println(str2);
    
    String str3=str.trim();
    System.out.println(str3);

    String str4=str3.substring(3, 5);
    System.out.println(str4);
    
    String str5=str.replace('e', 'M');
    System.out.println(str5);

    System.out.println(str3.startsWith("et"));
    System.err.println(str3.endsWith("ans"));

    System.out.println(str3.charAt(4));
    System.err.println(str3.indexOf('a'));
    System.err.println(str3.indexOf('e',4));

    String str6=str3;
    System.out.println(str6);

    str6=str6.replace('e','E');

    System.out.println(str6);
    System.out.println(str3.equals(str6));
    System.out.println(str3.equalsIgnoreCase(str6));
    }
    

}
