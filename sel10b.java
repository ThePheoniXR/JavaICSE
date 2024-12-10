//Accept three Numbers and find II highest number among them 
 
import java.util.*;
public class sel10b
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
         //a>b>c; we want b
        if (a < b && a > c)//I using logical operator
                System.out.println(a +" is 2nd greater");
            else//I 
            if(b<c)//II
                System.out.println(b +" is 2nd greater");
            else//II
                System.out.println(c +" is 2nd greater");
    }//end of main
}//end of class
