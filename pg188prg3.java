//Write a program to input 10 different numbers.
//Display the sum of only odd numbers by using for-loop.
import java.util.*;
class pg188prg3
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int i, n, sum=0;
        for (i=1; i<=10; i=i+1)
        {
            System.out.println("Enter a number one by one");
            n=sc.nextInt();
            if (n%2!=0)
            sum=sum+n;
        }
        System.out.println("Sum of Odd Numbers is " + sum);
    }
}