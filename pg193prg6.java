//Write a program to input a number.
//Display all the digits of the number.
//by stating whether it is an even or an odd digit by using do-while loop.
/* Sample Input:
 * 981
 * Samle Output:
 * 1 : an odd digit
 * 9 : an even digit
 * 8 : an even digit
 */
import java.util.*;
class pg193prg6
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        int n, d;
        System.out.println("Enter a number");
        n=sc.nextInt();
        while (n>0)
        {
            d=n%10;
            if (d%2==0)
            System.out.println(d+ " : an even number");
            else 
            System.out.println(d+ " : an odd number");
            n=n/10;
        }
    }
}