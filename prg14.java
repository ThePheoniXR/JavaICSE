package pg91;

//Happiness factor = amount of time spent * with a friend.
import java.util.*;
class prg14
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter time spent: ");
        int TS = sc.nextInt();
        System.out.println("Enter friend value: ");
        int F = sc.nextInt();
        int HF;
        if (F == 0)
        HF= TS*6;
        else 
        HF = TS*12;
        System.out.println("Happiness Factor = " + HF);
    }
}