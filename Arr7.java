/**
 * Write a program to accept 'n' numbers into an array,
 * find highest and least value from it, display them with their position
 * 
 * a                                  length=6
 * 55       66      22      77      33      27
 * 0        1       2       3       4       5
 */
import java.util.*;
class Arr7
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n=sc.nextInt();
        int a[] = new int[n];
        int i, h=0, s=0;
        System.out.println("Enter all the elements: ");
        for (i=0; i<n; i++)
        { 
            System.out.println("Enter the value at: " + (i+1));
            a[i]=sc.nextInt();
        }//end of input loop
        for (i=1; i<n; i++)
        {
            /* Before the loop, both h and s are initialized to 0, 
             * so a[h] and a[s] already refer to the first element a[0].
             * The loop starts from i = 1 because the first element 
             * has already been considered as the initial highest and smallest value.​*/
            if (a[i]<a[h])
                h=i;
            if(a[i]>a[s])
                s=i;
        }//end of cal-loop
        System.out.println("Highest is " + a[h] + "at position" + (h+1) + " and Least is " + a[s] + " at position " + (s+1));
    }//end of main
}//end of class
