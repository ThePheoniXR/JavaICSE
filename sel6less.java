//Accept two Numbers and dispaly the 
//first number is less than or viceversa .
import java.util.*;
public class sel6less
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter first number");
         a=sc.nextInt();
        System.out.println("Enter second number");
         b=sc.nextInt();
        if (a<b)
            System.out.println(a +" is less than "+ b);
        else
            System.out.println(b +" is less than "+ a);
        
    }//end of main
}//end of class
