package pg91;

//Input the fare by a passenger and print the distance travelled 
//using the Following Data
// (fare == 10) Distance <=6
// (fare == 15) Distance >6 and <=10
// (fare == 20) Distance >10

import java.util.*;
class prg13
{
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Ticket Fare: ");
        int f = sc.nextInt();
        if (f == 10)
        System.out.println("Distance is <= 6 km.");
        else 
        if (f == 15)
        System.out.println("Distance is > 6 and <= 10.");
        else
        if (f == 20)
        System.out.println("Distance is > 10 km.");
        else
        System.out.println("Invalid Fare Amount");
    }
}