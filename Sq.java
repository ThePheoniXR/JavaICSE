//Write a program to input a set of numbers.
//The program checks whether each number is a perfect square number or not.
//The program will terminate when zero is entered by the user.
import java.util.*;
class Sq
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        double a, sr;
        while(true)
        {
            System.out.println("Enter a number");
            a=sc.nextDouble();
            if (a>0)
            {
                sr=(int)Math.sqrt(a);
                if (a==sr*sr)
                System.out.println(a + " is a Perfect Square");
                else
                System.out.println(a + " is not a Perfect Square");
            }
            else
            break;
        }
    }
}