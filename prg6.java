package pg91;

//calculatvalue of t , taking input of R,K & S
import java.util.*;
public class prg6
{
    public static void main()
        {
            double t,k,  r, s;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the value of s");
            s=sc.nextDouble();
            System.out.println("Enter the value of r");
            r=sc.nextDouble();
            System.out.println("Enter the value of k");
            k=sc.nextDouble();
            if(s<=10)
            {
                t =Math.pow(r,2) + Math.pow(k,3);                
            }
             else if (s<=20 && s>10)
            {
                t=Math.pow(r,3) + Math.pow(k,2);
            }
            else    
                {
                   t= Math.pow(r+k,2);
                }
            System.out.print("\n The calculated result of t  =" + t);
        }
    }