
import java.util.Scanner;


public class Array {
    public static void main(String args[])
    {
        System.out.print("Initializing Program  .. ");
        for(int i=0;i<15;i++)
        {
            System.out.print(".  .... .. ");
        }
        System.out.println(" ....");
        /* Declaration */
        
        int A[]= new int[5];
        int B[]= {1,2,3,4,6};
        int C[];
        C= new int[5];
        int [] D = new int[5];

        B[2]=15;

        /* Printing an array */
        for(int x: A)
        {
            System.out.println(x);
        }
        for(int x: C)
        {
            System.out.print(x);
        }
        for(int x: D)
        {
            System.out.print(x);
        }
        for(int i=0; i<B.length; i++)
        {
            System.out.println(B[i]);
        }
        System.out.println(A.length);

        System.out.print("Command executed. Program loaded .. ");
        for(int i=0;i<15;i++)
        {
            System.out.print(".  .... .. ");
        }
        System.out.println(" ....");

        
        /* Sum of all Elements */
        int lenght, sum=0;
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the lenght of the array  : ");
        lenght=sc.nextInt();
        int Arr[]=new int[lenght];
        System.out.print("Enter the array contents : ");
        for(int i=0;i<lenght;i++)
        {
            Arr[i]=sc.nextInt();
        }
        System.out.print("You have entered the following values: ");
        for(int x: Arr)
        {
            System.out.print(x+" ");
        }
        System.out.println(" ");
        System.out.print("The sum of all the values in Arrays is  : ");
        for(int i=0;i<lenght;i++)
        {
            sum=sum+Arr[i];
        }
        System.out.println(sum);

        /* Searching the element in Array */
        int search,a=0,f=0;
        System.out.print("Enter the number to search in the array: ");
        search=sc.nextInt();
        for(int i=0;i<lenght;i++)
        {
            if(search==Arr[i])
            {
                System.out.println("Number "+search+" is in the array at "+(i+1)+" Position");
                f=1;
            }

        }
        if(f==0)
        {
            System.out.println("Number not found in the Array ");
        }

        /* Searching for Maximum Element */

        int max1,min=0,max2;
        max1=Arr[0];
        max2=Arr[0];
        min=Arr[0];
        for(int i=0;i<lenght;i++)
        {
            if(Arr[i]>max1)
            {
                max2=max1;
                max1=Arr[i];
            }
            else if(Arr[i]>max2)
            {
                max2=Arr[i];
            }
        }
        System.out.println("The Maximum Value in Array is: "+max1);
        System.out.println("The Minimum Value in Array is: "+min);
        System.out.println("Second largest number in array is: "+max2);



    }
    
}
