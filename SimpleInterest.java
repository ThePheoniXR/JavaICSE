//Write a program to calculate Simple Interest (si)
//Principal = p
//Rate = r
//Time Period = t
public class SimpleInterest
{
    public static void main(String arg[])
    {
        double si, p, r, t;
        p=7500;
        r=8;
        t=2;
        si=p*r*t/100;
        System.out.println("Simple Interest = Rs."+si);
    }
}