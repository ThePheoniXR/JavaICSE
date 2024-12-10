//Accept four Numbers and find highest number among them 
 
import java.util.*;
public class sel9
{
    public static void main()//using ternary operator
    {
        Scanner sc=new Scanner(System.in);
        int a, b, c, d;
        System.out.println("Enter 1st number");
         a=sc.nextInt();
        System.out.println("Enter 2nd number");
         b=sc.nextInt();
        System.out.println("Enter 3rd number");
         c=sc.nextInt();
        System.out.println("Enter 4th number");
         d=sc.nextInt();
        System.out.println(a > b && a > c && a > d ? a:  b > c &&
             b > d ? b : c > d ? c : d +" is greater");
    }//end of main
}//end of class
