package pg91;

/* Input the number of subjects in which a Student scored distinction marks 
 * and his/her rank status accordingly */
// Print "Invalid Input" for any other input.

import java.util.*;
class prg10
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of subjects in which the student has scored distinction marks.");
        n = sc.nextInt();
        if (n == 5)
        System.out.println("Excellent");
        else
            if (n == 4)
            System.out.println("Outstanding");
            else
                if (n == 3)
                System.out.println("Brilliant");
                else
                    if (n == 2)
                    System.out.println("Bright");
                    else
                         if (n == 1)
                         System.out.println("Vivid");
                         else 
                             if (n == 0)
                             System.out.println("Good");
                             else 
                             System.out.println("Invalid Input");
    }
}