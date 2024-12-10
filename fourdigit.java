import java.util.*;
class fourdigit
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n, d1, d2,d3,d4;
        System.out.println ("Enter a four-digit number");
        n= sc.nextInt ();
        d1=n/1000;
        d2=n%1000/100;
        d3=n%1000%100/10;
        d4=n%1000%100%10;
        
        System.out.println ("First Digit = " + d1);
        System.out.println ("Second Digit = " + d2);
        System.out.println (" third Digit = " + d3);
        System.out.println ("Four Digit = " + d4);
            }
}
