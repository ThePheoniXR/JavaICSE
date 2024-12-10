//Accept five Numbers and find highest number among them 
 
import java.util.*;
public class sel11b
{
    public static void main()//using Math.max
    {
        Scanner sc=new Scanner(System.in);
                int a, b, c, d, e, h;
        System.out.println("Enter 1st number");
         a=sc.nextInt();
        System.out.println("Enter 2nd number");
         b=sc.nextInt();
         System.out.println("Enter 3rd number");
         c=sc.nextInt();
         System.out.println("Enter 4th number");
         d=sc.nextInt();
         System.out.println("Enter 5th number");
         e=sc.nextInt();
         h= Math.max(a, Math.max(b, Math.max (c, Math.max (d, e))));
        System.out.println(h+ " is the highest number");
        
    }//end of main
}//end of class
