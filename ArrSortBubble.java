/**
 * Bubble Sort
 * Design a class to accept 'n' numbers in an array and arrange them
 * in ascendind order  using Bubble Sort technique.
 * Display the sorted array
 */
import java.util.*;
public class ArrSortBubble
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements you want in array: ");
        int n=sc.nextInt();
        int a[] = new int[n];
        int i, j, temp;
        for (i=0; i<a.length; i++) //n
        {
            System.out.println("Enter the value at: " + (i+1));
            a[i]=sc.nextInt();
        }//end of Input
        //Bubble sort
        for (i=0; i<n-1; i++)
        {
            for (j=0; j<n-1-i; j++)
                if (a[j]>a[j+1])
                {
                    temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }//inner loop - j n^2 times
        }//outer loop -> i n-1 times
        System.out.println("Sorted Array: ");
        for (i=0; i<n; i++)
        System.out.print(a[i]+", ");
    }//end of main()
}//end of clas
