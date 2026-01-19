/**
 * LINEAR SEARCH
 * Write a program to accept 'n' numbers into an array,
 * accept a number from user and search the number in the array.
 * If number exists, display message - "Number found at position"
 * If not found, display message - "Number does not exist in the array"
 * 
 * a        22      753     44      125     66      n=5
 *          0       1       2       3       4
 * if s = 44    ->  Number found at position 3
 * if s = 200   ->  Number does not exist in the array 
 *
    | Identifier | Type   | Description                     |
    |----------- |--------|-------------------------------- |
    | n          | int    | To store the size of the array  |
    | a          | int[]  | To store values into array      |
    | i          | int    | To generate array index number  |
    | s          | int    | To store a number to search     |
    | found      | boolean| To set a flag                   |
*/    
import java.util.*;
class Arr13
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        int i, s;
        boolean found=false;
        for (i=0; i<n; i++)
        {
            System.out.println("Enter all the element at position " + (i+1) + " in Array-1");
            a[i]=sc.nextInt();
        }
        System.out.println("Enter a number to search: ");
        s=sc.nextInt();
        for (i=0; i<n; i++)
        {
            if (a[i]==s)
            {
                found = true;
                System.out.println("Number found at position " + (i+1));
                break;
            }//end of if
        }//end of search loop
        if (found !=true)
        System.out.println("Number does not exist");
    }//end of main
}//end of class