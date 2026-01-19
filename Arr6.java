/**
 * Write a program to accept 'n'
 * create a new array of same size, store all one digit, 
 * number in the first part, 2-digits into 2nd part and '
 * 3-digits to the remaining parts of the new array
 */
import java.util.*;
class Arr6
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no: of elements you want in array: ");
        int n =sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        int i, j=0;
        System.out.println("Enter all the numbers ranging 1 and <1000");
        for (i=0; i<a.length; i++)//n
        {
            System.out.println("Enter the value at: " + (i+1));
            a[i]=sc.nextInt();
        }
        for (i=0; i<n; i++)
            if (a[i]<10)
            b[j++]=a[i];
        for (i=0; i<n; i++)
            if (a[i]<100 && a[i]>9)
            b[j++]=a[i];
        for (i=0; i<n; i++)
            if(a[i]>99 && a[i]<1000)
            b[j++]=a[i];
        for (i=0; i<n; i++)//to display
        System.out.println(b[i]);
    }
}