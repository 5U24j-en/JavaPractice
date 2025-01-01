import java.lang.*;
import java.util.Scanner;

public class Loops2 
{
    
    public static void main(String[] args) 
    {
        
        int num, temp, digit, rev=0;
        String str= new String();
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter the number: ");
        num=sc.nextInt();

        /* Displaying numbers in words adn in reverse */
        temp=num;
        while(temp>0)
        {
            digit=temp%10;
            temp=temp/10;
            rev=rev*10+digit;
            str=str+digit;

        }
        System.out.println(str);

        for(int i=str.length()-1;i>=0;i--)
        {
            char c=str.charAt(i);
            switch(c)
            {
                case '0': System.out.println("Zero");
                        break;
                case '1': System.out.println("One");
                        break;
                case '2': System.out.println("Two");
                        break;
                case '3': System.out.println("Three");
                        break;
                case '4': System.out.println("Four");
                        break;   
                case '5': System.out.println("Five");
                        break;
                case '6': System.out.println("Six");
                        break;
                case '7': System.out.println("Seven");
                        break;   
                case '8': System.out.println("Eight");
                        break;   
                case '9': System.out.println("Nine");
                        break;   
                default: System.out.println("Invalid");
            }
        }       

    }
}
