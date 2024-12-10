//Accept three Numbers and find highest number among them 
 
import java.util.*;
public class sel8c
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter 1st number");
         a=sc.nextInt();
        System.out.println("Enter 2nd number");
         b=sc.nextInt();
         System.out.println("Enter 3rd number");
         c=sc.nextInt();
        System.out.println(Math.max(a, Math.max(b,c)) +" is greater");
    }//end of main
}//end of class
