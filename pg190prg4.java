//Write a program to accept any 10 numbers.
//Display the sum of only negative numbers.
import java.util.*;
class pg190prg4
{
    public static void main()
    {
    Scanner sc = new Scanner(System.in);
    int i, n, sum=0;
    for (i=1; i<=10; i++)
    {
        System.out.println("Enter a number one by one");
        n=sc.nextInt();
        if (n<0)
        sum=sum+n;
    }
    System.out.println("Sum of all Negative Numbers is " + sum);
    }
}