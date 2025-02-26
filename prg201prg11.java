//Write a program to input a set of numbers.
//The program checks each number whether it a positive or a negative number,
//The loop should terminate when zero is entered by the user.
import java.util.*;
class prg201prg11
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        double a;
        while (true)//endless loop
        {
        System.out.println("Enter a number");
        a=sc.nextDouble();
        if(a>0)
        System.out.println(a + " is a Positive Number");
        else if (a<0)
        System.out.println(a + " is a Negative Number");
        else
        break;
    }
    
    }
}