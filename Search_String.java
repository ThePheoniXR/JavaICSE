/**
 * Assign given names and phone numbers into two arrays, string and long respectively
 * Accept a name from user  a) perform Linear Search
 *                          b) perform Binary Search
 * If found, display "Search Successful" and print name with phone number, or else display the message
 * "Search Unsuccessful. No such name in the list".
 * name
 * "ARYA"   "BHAVANA"   "ASHISH"    "DEEPAK"    "SHASTRI"
 * 0        1           2           3           4
 * phone
 * 8304083306l      8547091885L     9403454468L     8281185477l     8281083013L
 * 0                1               2               3               4
 * s="Ashish"
 */
import java.util.*;
class Search_String
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        boolean found = false; int i;
        String name[]={"ARYA", "BHAVANA","ASHISH", "DEEPAK" , "SHASTRI"};
        long ph[]={8304083306l, 8547091885L, 9403454468L, 8281185477l, 8281083013L};
        int n=name.length;
        System.out.println("Enter the name to be searched: ");
        String sn=sc.nextLine();
        //Linear search
        for (i=0; i<=name.length; i++)
        {
            if (name[i].equalsIgnoreCase(sn))
            {
                found = true;
                break;
            }//end of if
        }//end of for loop
        if (found)
        {
            System.out.println("Search successful");
            System.out.println(name[i]+ "Phone Number: "+ph[i]);
        }
        else
            System.out.println("Search Unsuccessful. No such name in the list");
        //Binary search
        int l, u, m, v;
        l=0; u=0;
        
            while(l<=u)
            {
                if (name[m].equalsIgnoreCase(sn))
                {   
                    found=true;
                    break;
                }   
                else if (name[m].compareToIgnoreCase(sn)<0)
                l=m+1;
                else
                u=m-1;
            }
    }
}