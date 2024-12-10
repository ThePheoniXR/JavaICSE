package pg91;

//Discount 10%, 26% and 15%
import java.util.*;
public class prg11
{
    public static void main()
        {
            double amt,dis,net,d;
            Scanner sc=new Scanner(System.in);
            System.out.println("Sales Amount= ");
            amt=sc.nextDouble();
            System.out.println("Enter Date: ");
            d=sc.nextDouble();
            if (d == 15)
                dis = 15.0/100;
            else    
                if (d == 26)
                    dis = 26.0/100;
                    else dis = 0.1;
            
            System.out.println("Sales Amount= "+ amt );
            System.out.println(" Discount Amount= "+ amt*dis);
            System.out.println("Net Amount= "+ (amt-amt*dis));
            
                }
    }
