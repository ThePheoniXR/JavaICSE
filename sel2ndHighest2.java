//Accept three Numbers and find 2nd highest number among them 
 
import java.util.*;
public class sel2ndHighest2
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
         if (a<b)
             if (c<a) //c<a<b
                System.out.println(a + " is 2nd Highest Number");
            else   if (c<b)//a<c<b
                System.out.println(c + " is the 2nd Highest Number");
            else //a<b<c
                System.out.println(b + " is the 2nd Highest Number");
        else //b<a
            if (c<b)//c<b<a
                System.out.println(b + " is the 2nd Highest Number");
            else if (c<a)//b<c<a
                System.out.println(c + " is the 2nd Highest Number");
                else //b<a<c
                System.out.println(a + " is the 2nd Highest Number");
        }//end of main
}//end of class
