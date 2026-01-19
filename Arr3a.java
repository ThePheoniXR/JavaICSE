/**
 * Write a program to accept 'n' numbers into an array & display seperate list of nos. divisble by 2, 3, 5, 7, 11
 */
import java.util.*;
class Arr3a
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no: of elements you want in an array: ");
        int n= sc.nextInt();
        int a[]=new int[n];
        int i;
        System.out.println("Enter all the elements: ");
        for (i=0; i<a.length; i++)//n
        {
           System.out.println("Enter the value at: " + (i+1));
           a[i]=sc.nextInt();
        }//end of for loop
        System.out.println("List of no: divisible by 2");
        for (i=0; i<n; i++)
            if(a[i]%2==0)
            System.out.println(a[i]+", ");
            
        System.out.println("List of no: divisble by 3");
        for (i=0; i<n; i++)
            if(a[i]%3==0)
            System.out.println(a[i] + ", ");
            
        System.out.println("List of no: divisble by 5");
        for (i=0; i<n; i++)
            if(a[i]%5==0)
            System.out.println(a[i] + ", ");
            
        System.out.println("List of no: divisble by 7");
        for (i=0; i<n; i++)
            if(a[i]%7==0)
            System.out.println(a[i] + ", ");
            
        System.out.println("List of no: divisble by 11");
        for (i=0; i<n; i++)
            if(a[i]%11==0)
            System.out.println(a[i] + ", ");
                
    }//end of main()
}//end of class