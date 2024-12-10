import java.util.*;
class Twodigit
{
    public static void main()
    {
        Scanner a=new Scanner(System.in);
        int n, d1, d2;
        System.out.println ("Enter a two-digit number");
        n= a.nextInt ();
        d1=n/10;
        d2=n%10;
        
        System.out.println ("First Digit =" + d1);
        System.out.println ("Second Digit = " + d2);
            }
}
