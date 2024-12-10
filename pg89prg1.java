package pg89;
//Input a Number for Temperature to check wheter Water is Boiling.
//Use a Condition for verifying the value of Temperature
//The Output Statement in this program is Conditional

import java.util.*;
class prg1
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Temperature: ");
        int temp = sc.nextInt();
        if (temp == 100)
        {
            System.out.println("The Water is Boiling");
        }
        else if (temp >= 101)
        {
            System.out.println("Water has been Boiled"); 
        }
        else if (temp <=99)
        {
            System.out.println("Boiling Point of Water has not yet been reached");
        }
    
    }
}