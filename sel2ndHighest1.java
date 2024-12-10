//Accept three Numbers and find 2nd highest number among them 
 
import java.util.*;
public class sel2ndHighest1
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
        if (a<b && b<c)//c>b>a
                System.out.println(b +" is 2nd greater");
        else  if(c<b && b<a)//a>b>c
                System.out.println(b +" is 2nd greater");
        else  if(c<a && a<b)//b>a>c
                System.out.println(a +" is 2nd greater");
        else  if(b<a && a<c)//c>a>b
                System.out.println(a +" is 2nd greater");
        else  if(a<c && c<b)//b>c>a
                System.out.println(c +" is 2nd greater");
        else 
                System.out.println(c +" is 2nd greater");
    }//end of main
}//end of class
