/**
 * Write a program to accept 'n' names into an array, 
 * accept a name from user and search in the array
 * If exists, display message - "Name found at position",
 * if not - "Name does not exist"
 * a    "Shania Shaji"      "Sukruta"       "Adam"      "Andria"        "FayidFaisal"       n=5
 *      0                   1               2           3               4
 * if s="Andria" -> Name found at position 3
 * if s="Newell" -> Name does not exist
*/
import java.util.*;
class Arr14
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        sc.nextLine(); //consume leftover newline
        String a[]= new String[n];
        String s;
        int i;
        boolean found=false;
        System.out.println("Enter all the names into an array: ");
        for (i=0; i<n; i++) //a.length
        {
            System.out.println("Enter the name at: " + (i+1));
            a[i]=sc.nextLine();
        }
        System.out.println("Enter a name to search: ");
        s=sc.nextLine();
        //Linear Search
        for (i=0; i<n; i++)
        {
            if (a[i].equalsIgnoreCase(s))
            {
                System.out.println("Name found at position " + (i+1));
                found = true; 
                break;
            }
        }
        if (found !=true)
        System.out.println("Name does not exist");
    }
}
