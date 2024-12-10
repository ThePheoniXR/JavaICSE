//Accept two Numbers and check  
//first number is divisible by second number 
import java.util.*;
public class sel7
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a, b;
        System.out.println("Enter I number");
         a=sc.nextInt();
        System.out.println("Enter 2nd number");
         b=sc.nextInt();
        if (a % b == 0)
            System.out.println(a +" is divisible by "+ b);
        else
            System.out.println(a +" is not divisible by " + b);
    }//end of main
}//end of class
