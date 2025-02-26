//Write a program in Java to display the sum of any two numbers for ten iterations.
//If the sum of two numbers is negative then the program will terminate.
import java.util.*;
class pg195prg7
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        double a, b, sum;
        while (true)//endless or infinite loop
        {
            System.out.println("Enter the first number");
            a=sc.nextDouble();
            System.out.println("Enter the second number");
            b=sc.nextDouble();
            sum=a+b;
            if(sum<0)
            break;
            System.out.println("Sum = " + sum);
        }
    }
}