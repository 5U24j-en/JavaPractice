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
    /* str1==str2 will check if references are equal not the string itself */
    System.err.println("Printing and practising regular expressions");
    String str7="abcdef1";
    String str8="abbccdddaa";
    String str9="abcDefgh";
    String str10="abcdEEE123";
    String str11="";
    System.err.println(str7.matches(".*"));
    System.err.println(str7.matches("[abc]*"));
    System.err.println(str8.matches("[abcd]*"));
    System.err.println(str9.matches("[a-z]*"));
    System.err.println(str8.matches("[a-z]*"));
    System.out.println(str11.matches("[abc]*"));
    System.out.println(str11.matches("[abc]+"));
    System.out.println(str10.matches("[a-zA-Z0-9]*"));

    System.out.println("To check if the string is gmail account");
    String str12="John@gmail.com";
    System.out.println(str12.matches("\\w*@gmail(.*)"));

    /* Student Challenge */

    System.out.println("To check if string is a email id or not using Java Methods: ");
    String str13="programmer@gmail.com";
    int a=str13.indexOf("@");
    System.out.println(a);
    String sub1=str13.substring(0,a);
    int l=str13.length();
    System.out.println(l);
    String sub2=str13.substring(a+1, l);
    System.out.println("Username = "+sub1);
    System.out.println("Domain name = "+sub2);
    System.out.println("Is the email gamil a account? : "+sub2.matches("[gmail.com]+"));
    /* Checking if the number is binary or not */

    int b=10110111;
    String str14=b+"";
    System.out.println(str14.matches("[10]*"));

    /*Replacing Special Characters from string*/
    String str15="  a!B@c#123ab%%%  f%  ";
    System.out.println(str15);
    System.out.println(str15.replaceAll("\\W", "").trim());

    /*To check number of words in String*/

    String str16="My name is diablo";
    String words[]=str16.split("\\s");
    System.out.println(words.length);
    
    }
    

}
