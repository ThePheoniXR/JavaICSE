//Accept five Numbers and find highest number among them 
 
import java.util.*;
public class sel11
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int h, n;
        System.out.println("Enter 1st number");
         h=sc.nextInt();
        System.out.println("Enter 2nd number");
         n=sc.nextInt();
        if (n>h)
         h=n;
        System.out.println("Enter 3rd number");
         n=sc.nextInt();
        if (n>h)
         h=n;
        System.out.println("Enter 4th number");
        n=sc.nextInt();
        if (n>h)
         h=n;
         System.out.println("Enter 4th number");
        n=sc.nextInt();
        if (n>h)
         h=n;
         System.out.println("Enter 5th number");
        n=sc.nextInt();
        if (n>h)
         h=n;
        System.out.println(h+ " is the highest among five number");
        
    }//end of main
}//end of class
