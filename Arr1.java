/**
 * Write a program to accept 'n' numbers into an array & display them
 */
import java.util.*;
class Arr1
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements you want in array: ");
        int n = sc.nextInt();
        int a[]= new int[n];
        int i;
        System.out.println("Enter all the elements: ");
        for (i=0; i<a.length; i++) //n
        {
            System.out.println("Enter the value at: " + (i+1));
            a[i]=sc.nextInt();
        }
        for (i=0; i<n; i++)
            System.out.println(a[i] + ", ");
    }//end of main()
}//end of class