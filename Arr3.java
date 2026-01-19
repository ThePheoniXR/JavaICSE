/**
 * Write a program to accept 'n' numbers into an array & display
 * seperate list of nos. divisble by 2, 3, 5, 7, 11, 13, 17, 19
 * using another array to initialize 2, 3, 5, 7, 11...
 */
import java.util.*;
class Arr3
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No: of elements you want in array: ");
        int n= sc.nextInt();
        int a[] = new int[n];
        int b[] = {2, 3, 5, 7, 11, 13, 19, 23}; //initializing array
        int i, j;
        System.out.println("Enter all the elements: ");
        for (i=0; i<a.length; i++) //n
            {
                System.out.println("Enter the value at: " + (i+1));
                a[i]=sc.nextInt();
            }//end of for loop
        for (j=0; j<b.length; j++) //outer loop for b-array
        {
            System.out.println("List of nos. divisble by " + b[j]);
            for (i=0; i<n; i++)//inner loop for a-array
                if (a[i]%b[j]==0)
                System.out.println(a[i]+", ");
            //end of inner loop - i
        }//end of outer loop - j
    }//end of main()
}//end of class