//Write a program to accept a number 
//and display if the number is positive or negative
import java.util.*;
public class sel2
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=sc.nextInt();
        if (n>0)
        {
        System.out.println(n+" is Positive");
         }//end of truth block
        else
        {
        System.out.println(n+" is negative");
        }//end of false block
    }//end of main
}//end of class
