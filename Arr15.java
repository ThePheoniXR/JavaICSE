/**
 * BINARY SEARCH
 * Write a program to accept 'n' numbers into an array, 
 * accept a number from user and search the number in the array.
 * If number exists, display message "Number found at Position"
 * If not found, display message "Number does not exist in the array"
 * 
 * a    22      44      66      125     735     n=5
 *      0       1       2       3       4
 * if s = 44 -> Number found at position 2
 * if s = 200 -> Number does not exist in the array
 */
import java.util.*;
class Arr15
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        /**
         * @param i to generate array index number
         * @param s to store a number to search
         * @param found to set a flag
         */
        int i, s;
        boolean found=false;
        System.out.println("Enter all the elements in Array-1: ");
        for (i=0; i<n; i++)
        {
            System.out.println("Enter the value at: " + (i+1));
            a[i]=sc.nextInt();
        }//end of Array-input
        System.out.println("Enter a number to search: ");
        s=sc.nextInt();
        
        /**
         * @param l to store lower index
         * @param u to store higher index
         * @param m to store middle index
         */
        int l, u, m; //Binary Search
        l=0;
        u=a.length-1;
        while (l<=u)
        {
            m=(l+u)/2;
            if (s==a[m])
            {
                System.out.println("Number found at position " + (m+1));
                found = true; 
                break;
            }
            else if (s>a[m])
            l=m+1;
            else
            u=m-1;
        }//end of binary
        if (found !=true)
        System.out.println("Number does not exist");
    }//end of main()
}//end of class