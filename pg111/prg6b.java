package pg111;

//Input the Cost of a Guitar and a Tabla
//Input the Selling Price of his Camera
//Print whether he incurred Profit or Loss 
//Print the Profit or Loss percent

import java.util.*;
class prg6b
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        double g, t, c, a, profit, loss;
        System.out.println("Input the Cost of the Guitar: ");
        g = sc.nextDouble();
        System.out.println("Input the Cost of the Tabla: ");
        t = sc.nextDouble();
        System.out.println("Input the Selling Price of Your Camera: ");
        c = sc.nextDouble();
        a=g+t;
        if (a > c)
        {
            loss = a-c;
            System.out.println("You incurred a Loss of " + loss);
            System.out.println("Loss Percentage = " + (loss/a*100.0));
        }
        else if (a<c)
        {
            profit = c-a;
            System.out.println("You incurred a Profit of " + profit);
            System.out.println("Profit Percentage = " + (profit/a*100.0));
        }
        else
        {
            System.out.println("You neither incurred Profit nor a Loss");
        }
    }
}