/**
 * Write a program to accept numbers into two arrays of same size 'n',
 * Find the sum of each corresponding elements from first & second arrays 
 * store its sum into the third array of same. Display the 3rd array
 * a        2       5       7       4       11
 *          0       1       2       3       4
 *          
 * b        8       9       6       3       2
 *          0       1       2       3       4
 *          
 * c        10      14      13      7       13
 *          0       1       2       3       4
 */
import java.util.*;
class Arr8
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int i, h, j;
        System.out.println("Enter the size of the Array: ");
        int n=sc.nextInt();
        int a[] = new int[n];
        int b[]= new int[n];
        int c[]= new int[n];    
        for (i=0; i<n; i++)
        {
            System.out.println("Enter the element at: " + (i+1) + " in Array 1");
            a[i]=sc.nextInt();
        }//end of Array-1 input
        for (i=0; i<n; i++)
        {
            System.out.println("Enter the element at: " + (i+1) + " in Array 2");
            b[i] = sc.nextInt();
        }//end of Array-2 input
        for (i=0; i<n; i++)
            c[i]=a[i]+b[i];
        for (i=0; i<n; i++)//n
            System.out.println(a[i]);
        for (i=0; i<n; i++)//n
            System.out.println(b[i]);
        for (i=0; i<n; i++)//n
            System.out.println(c[i]);
    }//end of main()
}//end of class
