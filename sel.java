//Accept a Number and check if it is divisible by 5 or not.
import java.util.*;
public class sel
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        if (n%5==0)
            System.out.println(n+" is  divisible by 5");
        else
            System.out.println(n+" is not divisible by 5");
        
    }//end of main
}//end of class
