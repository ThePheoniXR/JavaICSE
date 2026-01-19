/**
 * Write a program to accept 'n' numbers into an array &
 * create a new array of same size, store all the even numbers into 
 * the first part of second array, odd numbers in remaining part, 
 * display the second array
 * 
 * a                          length=5
 * 55       66      22      77      33
 * 0        1       2       3       4
 * 
 * b                               n=5
 * 66       22      55      77      33
 * 0        1       2       3       4
 */
import java.util.Scanner;
class Arr5
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter no. of elements you want in array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        int i, j=0;
        System.out.println("Enter all the elements: ");
        for (i=0; i<a.length; i++) //n
        {
            System.out.println("Enter all the value: " + (i+1));
            a[i]=sc.nextInt();
        }
        for (i=0; i<n; i++) //storing even nos.
            if(a[i] %2==0)
            {
                b[j]=a[i];
                j++;
            }
        for (i=0; i<n; i++)//storing odd nos.
            if (a[i]%2==1)
            {
                b[j++]=a[i];
            }
        for (i=0; i<n; i++)
            System.out.println(b[i]+", ");    
    }//end of main()
}//end of class
