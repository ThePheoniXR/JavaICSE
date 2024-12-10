package pg111;

import java.util.*;
class prg6a 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter price of book 1: ");
        double b1 = sc.nextDouble();
        
        System.out.println("Enter price of book 2: ");
        double b2 = sc.nextDouble();
        
        double d1, d2;
        
        if (b1 >= 1000) 
            d1 = b1 - ((35.0/100) * b1);
        else
            d1 = b1 - ((10.0/100) * b1);
        
        if (b2 >= 1000) 
            d2 = b2 - ((35.0/100) * b2);
        else
            d2 = b2 - ((10.0/100) * b2);
        
        System.out.println("Price of book 1: " + d1);
        System.out.println("Price of book 2: " + d2);
        System.out.println("Total Price: " + (d1 + d2));
    }
}
