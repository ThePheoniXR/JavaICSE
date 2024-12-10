//Accept three Numbers and find highest number among them 
 
import java.util.*;
public class sel8a
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter 1st number");
        int a=sc.nextInt();
        System.out.println("Enter 2nd number");
        int b=sc.nextInt();
        System.out.println("Enter 3rd number");
        int c=sc.nextInt();
        if (a > b)// I
            if (a > c)// II
                System.out.println(a +" is greater");
            else//II
                System.out.println(c +" is greater");
        else//I 
            if(b>c)//III
            System.out.println(b +" is greater");
            else
            System.out.println(c +" is greater");
    }//end of main
}//end of class
