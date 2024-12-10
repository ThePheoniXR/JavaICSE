package pg111;
//Discount: Flat 5% on p.
//Full Page (fp) Ad: Additional Discount of 4% on the DP


import java.util.*;
class prg6g
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        double p, D, DP = 0.0, A;
        int fp;
        System.out.println("Enter the Price of the Advertisement");
        p=sc.nextDouble();
        System.out.println("Is it a Full Page Advertisement or not?: [1 for Yes, 2 for No]");
        fp=sc.nextInt();
        D = p - ((5.0/100)*p);
        if (fp>0 && fp<=2) 
        {
            if (fp == 2)
                DP = D;
            else if (fp == 1)
                DP = D - ((4.0/100)*D);
                System.out.println("Discounted Price: " + DP);
        }
        else
        System.out.println("Invalid Input");
    }
}