package pg91;

//A number is called RiWi Number if last two digits are same.
//input a number and verify whether it is a RiWi number or not.
import java.util.*;
class prg8

{
    public static void main()
    {
        int n, d1, d2, cn;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        n=sc.nextInt();
        cn = n;
        d1 = cn%10;
        cn = cn/10;
        d2 = cn%10;
        if (d1 == d2)
        {
            System.out.println("The Number " + n + " is a RiWi number");
        }
        else 
        {
            System.out.println("The Number " + n + " is NOT a RiWi number"); 
        }
    }
}
