/**
 * Write a program to accept the names of 10 cities in a single dimensional array
 * and their STD (Subscribers Trunk Dailing) codes in another single dimension integer array.
 * Search for a name of a city input by the user in the list. If found, display, "Search Successful" 
 * and print the name of the city along with the STD code, or else display the message "Search Unsuccessful. No such city in the list."
 * city
 * city.length=10
 * "New Delhi"      "Mumbai"        "Kolkata"       "Chennai"       "Hyderabad"     "Ahmedabad"     "Bengaluru"     "Thiruvananthapuram"        "Kollam"        "Kochi"
 * 0                1               2               3               4               5               6               7                           8               9                   
 * 
 * 1                2               3               4               0               9               0               71                          74              84
 * 0                1               2               3               4               5               6               7                           8               9               
 * s="koLLam"       Kollam - 474
 */
import java.util.*;
class Arr17
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        String city[]=new String[10];
        int std[]=new int[10];
        String s;
        int i;
        boolean found=false;
        System.out.println("Enter all the city names & std codes into two arrays: ");
        for (i=0; i<10; i++)
        {
            System.out.println("Enter the city name at: " + (i+1));
            city[i]=sc.nextLine();
            System.out.println("Enter the STD code: ");
            std[i]=sc.nextInt();
            sc.nextLine(); //or use Integer.parseInt(sc.nextLine());
        }
        System.out.println("Enter a city name to search: ");
        s=sc.nextLine();
        for (i=0; i<10; i++)
        {
            if (city[i].equalsIgnoreCase(s))
            {
                System.out.println("Search Successful, City name" + city[i]);
                found = true;
                break;
            }
        }//end of Search
        if (found !=true)
        System.out.println("Search Unsuccesful. No such city name in the list");
    }//end of main()
}//end of class