//Write a program to input a number.
//Display all the digits of the number using while-loop.
/* Sample Input:
   372
   Sample Output:
   2
   7
   3*/
import java.util.*;
class pg191prg5
{
    public static void main()
   {
    Scanner sc = new Scanner(System.in);
    int n, d;
    System.out.println("Enter a number");
    n=sc.nextInt();
    while (n>0)
    {
        d=n%10;
        System.out.println(d);
        n=n/10;
    }
} 
}
