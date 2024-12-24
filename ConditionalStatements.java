import java.lang.*;
import java.util.Scanner;


public class ConditionalStatements 
{
    public static void main(String[] args) 
    {
        int a,b,c=10;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        a=sc.nextInt();
        System.err.println("enter the value of b: ");
        b=sc.nextInt();

        if (a>b&&a<c)
        {
            System.out.println("a is greater than b ? Du bist meine Frau. wie gehts");

        }
        else if(b>a||a<c){
            System.out.println("Guten tag. Milch und Kaffe bitte. Danke und Tschuss");
        }
        else{
            System.out.println("Es tut mir leid");
        }

        /* Finding the type of website and protocol used */
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Website URL: ");
        String str=scan.nextLine();
        if(str.contains(":")&&str.contains("."))
        {
            String protocol=str.substring(0, str.indexOf(":"));
            System.out.println(protocol);

            int l;
            l=str.length();
            System.out.println(l);   
            String domain=str.substring(str.lastIndexOf(".")+1, l);
            System.out.println(domain);
            if(protocol.equals("https")&&domain.equals("com"))
            {
                System.out.println("This is a https protocol with a commerical domain ");
            }
            else if(protocol.equals("ftp")&&domain.equals("com"))
            {
                System.out.println("This is a ftp protocol with a commercial domain");
            }   
            else if(protocol.equals("https")&&domain.equals("gov"))
            {
                System.out.println("This is a https protocol with a goverment domain ");
            }
            else if(protocol.equals("ftp")&&domain.equals("gov"))
            {
                System.out.println("This is a ftp protocol with a goverment domain ");
            }
            else{
                System.out.println("ERROR. Please enter the requested domain");
            }
        }
        else{
            System.out.println("Invalid URL. Enter complete Website");
        }
        
        /* To check the radix (bases) of given string */

        System.out.println("Please enter the the number: ");
        Scanner num= new Scanner(System.in);
        String input=num.nextLine();

        if(input.matches("[10]+"))
        {
            System.out.println("Input is Binary");
        }
        else if(input.matches("[0-7]+"))
        {
            System.out.println("Input is Octal");
        }
        else if(input.matches("[0-9]+"))
        {
            System.out.println("Input is Decimal");
        }
        else if(input.matches("[0-9A-F]+"))
        {
            System.out.println("Input is Hexadecimal");
        }
        else{
            System.out.println("Invalid Input");
        }        

        /* To check if the year is a leap year or not */

        System.out.println("Enter the year to check if it is leap year or not: ");
        int year=sc.nextInt();
        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                {
                    System.out.println("It is a leap Year");
                }
                else
                {
                    System.out.println("It is not a leap year");
                }
            }
            else
            {
                System.out.println("It is a leap year");
            }
        }
        else
        {
            System.out.println("It is not a leap year");
        }


        


        
    }

    
}
