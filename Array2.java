import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) 
    {
        /* Rotation of Array */
        int lenght;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the Arrays: ");  
        lenght=sc.nextInt();
        
        int Arr[]= new int[lenght];
        System.out.print("Enter the elements in the array: ");
        for(int i=0;i<lenght;i++)
        {
            Arr[i]=sc.nextInt();
        }
        System.out.println("");
        System.out.print("The array is created as displayed: ");
        for(int x: Arr)
        {
            System.out.print(x);
            System.out.print(" ");
        }
        System.out.println("");
        /* Rotation of Array */
        int num,temp,num2;
        System.out.print("Enter the number of times you want to rotate the array from left: ");
        num=sc.nextInt();
        for(int i=0;i<num;i++)
        {
            temp=Arr[0];
            for(int j=1;j<lenght;j++)
            {

                Arr[j-1]=Arr[j];

            }
            Arr[lenght-1]=temp;
        }
        System.out.print("The final Array is: ");
        for(int x: Arr)
        {
            System.out.print(x);
            System.out.print(" ");
        }
        System.out.println(" ");
        System.out.print("Enter the number of times you want to rotate the array from right: ");
        num2=sc.nextInt();
        for(int i=0;i<num2;i++)
        {
            temp=Arr[lenght-1];
            for(int j=lenght-1;j>0;j--)
            {

                Arr[j]=Arr[j-1];

            }
            Arr[0]=temp;
        }
        System.out.print("The final Array is: ");
        for(int x: Arr)
        {
            System.out.print(x);
            System.out.print(" ");
        }


        
    }
}
