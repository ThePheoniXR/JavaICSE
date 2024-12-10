//Accept a Number and check if it is odd or even.
import java.util.*;
public class Sel5
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        if (n%2==0)
            System.out.println(n+" is an Even Number");
        else
            System.out.println(n+" is an Odd Number");
        
    }//end of main
}//end of class
