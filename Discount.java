//Write a program to calculate Amount to be paid by the customer if the shop is giving 10 percent discount.
//Discount Percent = 10/100 = 0.1
//Discount (d) = a * percent
//Discounted Prize (net) = Initial Amount (a) - Discount (d)
public class Discount
{
    public static void main(String arg[])
    {
        double a, d, net;
        a=5000; //amount
        d=a*0.1;//discount
        net=a-d;//Amount paid by the Customer
        System.out.println("Initial Amount = Rs."+a);
        System.out.println("Discount = Rs."+d);
        System.out.println("Amount to be paid by the Customer = Rs." +net);
        
    }
}