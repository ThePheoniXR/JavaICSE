/** 
 * Design a class to accept 'n' words in an array and arrange them in ascending order 
 * using the Bubble sort technique
 * Display the sorted array
 */
import java.util.*;
class ArrSorBubbleStr
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements you want in array: ");
        int n = sc.nextInt();
        sc.nextLine();
        String a[]=new String[n];
        int i, j;
        String temp; 
        for (i=0; i<a.length; i++)      //n
        {
            System.out.println("Enter the value at: " + (i+1));
            a[i]=sc.nextLine();
        }
        //Bubble sort
        for (i=0; i<n-1; i++)
        {
            for (j=0; j<n-1-i; j++)
            {
                if (a[j].compareToIgnoreCase(a[j-1])>0)
                temp = a[j];
                
            }   
            if (a[j].compareToIgnoreCase(a[j+1])>0)
            {
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
            System.out.println("Sorted Array: ");
            for (i=0; i<n; i++)
                System.out.println(a[i] + ", ");
        }
    }//end of main
}//end of class