import java.util.*;
class Threedigit
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n, d1, d2,d3;
        System.out.println ("Enter a three-digit number");
        n= sc.nextInt ();
        d1=n/100;
        d2=n%100/10;
        d3=n%100%10;
        
        System.out.println ("First Digit = " + d1);
        System.out.println ("Second Digit = " + d2);
        System.out.println (" third Digit = " + d3);
            }
}
