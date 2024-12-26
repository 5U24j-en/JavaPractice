import java.lang.*;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args)
    {
        /* Basic Loops Printing Prime Numbers*/
        System.out.println("Printing Prime Number: (*.*)(⊙.⊙()⊙.⊙)( ◡́.◡̀)(^◡^ )");
        int l=2;
        while(l<100)
        {
            int flag=0;
            
            for(int i=2;i<l;i++)
            {
                if(l%i==0&&i!=1&&i!=l)
                {                    
                    flag=1;
                }
                
            }
            if(flag==0)
            {
                System.out.println(l);
            }
            l=l+1;
        }
        System.out.println("End of this stage +++++++++++++++++++++++++++++++++++++++++++++++");
        
        /* Factorial */
        
        System.out.println("Enter the number to find the factorial: ");
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        int fact=1;
        for(int i=1;i<=x;i++)
        {
            fact=fact*i;
        }
        System.out.println("The Factorial is = "+fact);
        
        /* Displaying Digits and counting the digits in a number and checking if the number is Armstrong or not */

        int num, digit,a=10,count=0,armstrong=0,temp,rev=0;
        System.out.println("Enter the Number to find Digits: ");
        num=sc.nextInt();
        temp=num;
        while(temp>0)
        {
            /* Finding and counting the Digits */
            digit=temp%10;
            System.out.println("The Digits at "+a +"s place is:  "+digit);
            a=a*10;
            temp=temp/10;
            count=count+1;

            /* Reversing Number */
            rev=rev*10+digit;

            /*Armstrong */
            armstrong=armstrong+(digit*digit*digit);

        }
        System.out.println("Number of digits in the number is: "+count);
        if(armstrong==num)
        {
            System.out.println("Number is Armstrong Number: " + armstrong);
        }
        else
        {
            System.out.println("Not an Armstrong Number: "+ armstrong);
        }
        if(rev==num)
        {
            System.out.println("The number is a palindrome: "+rev);
        }
        else{
            System.out.println("The number is not a palindrome: "+rev);
        }
        
            
        

       
    }    
}

