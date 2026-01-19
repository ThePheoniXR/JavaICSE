/**
 * Write a program to accept 'n' names into an array, 
 * accept a name from user and search in the array.
 * If exists, display message "Name found at position"
 * If not exists, "Name does not exist"
 * 
 * a    "Adam"      "Andria"        "FayidFaisal"       "ShaniaShaji"       "Sukruta"   n=5
 *      0           1               2                   3                   4
 * if s = "Andria" -> "Name found at position 2
 */
import java.util.*;
class Arr16
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        sc.nextLine(); //consume leftover newline
        String a[] = new String[n];
        String s;
        int i;
        boolean found = false;
        System.out.println("Enter all the names into array: ");
        for (i=0; i<n; i++) //a.length
        {
            System.out.println("Enter the element at position " + (i+1));
            a[i]=sc.nextLine();
        }
        System.out.println("Enter a name to search: ");
        s=sc.nextLine();
        //Binary Search
        int low, mid, upper;
        low=0;
        upper=a.length-1;
        while (low<=upper)
        {
            mid=(low+upper)/2;
            if (s.compareToIgnoreCase(a[mid])==0)
            {
                System.out.println("Name found at position " + (mid+1));
                found = true;
                break;
            }
            else if (s.compareToIgnoreCase(a[mid])>0)
            low=mid+1;
            else
            upper=mid-1;
        }//end of Binary Search
        if (found!=true)
        System.out.println("Name does not exist");
    }//end of main()
}//end of class