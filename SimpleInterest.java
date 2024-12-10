import java.util.*;
class SimpleInterest
{
    public static void main()
    {
        Scanner a=new Scanner(System.in);
        double I, p, r, t;
        System.out.println ("How much do you ne?");
        p= a.nextDouble ();
        System.out.println ("Please mention the Rate");
        r= a.nextDouble ();
        System.out.println ("When will you be giving the money? aka Time Period");
        t= a.nextDouble ();
        I= p*r*t/100;
        
        System.out.println ("Interest =" + I);
        System.out.println ("Amount = " + (p+I));
            }
}