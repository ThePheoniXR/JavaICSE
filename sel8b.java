//Accept three Numbers and find highest number among them 
 
import java.util.*;
public class sel8b
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
        if (a > b && a > c)//I using logical operator
                System.out.println(a +" is greater");
            else//I 
            if(b>c)//II
                System.out.println(b +" is greater");
            else//II
                System.out.println(c +" is greater");
    }//end of main
}//end of class
