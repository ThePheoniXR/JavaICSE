/** 
 * Write a Program to accept 'n' numbers into an array & display seperate list for odd numbers & even numbers
 */
import java.util.*;
class Arr2
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no: of elements you want in an array: ");
        int n = sc.nextInt();
        int a[]= new int[n];
        int i;
        System.out.println("Enter all the elements: ");
        for (i=0; i<a.length; i++) //n
        {
            System.out.println("Enter the value at: " + (i+1));
            a[i]=sc.nextInt();
        }
        System.out.println("List of even numbers");
        for (i=0; i<n; i++)
            if (a[i]%2==0)
            System.out.println(a[i] + ", ");
            
        System.out.println("List of odd numbers");
        for (i=0; i<n; i++)
            if(a[i]%2==1)
            System.out.println(a[i] + ", ");
    }//end of main()
}//end of class