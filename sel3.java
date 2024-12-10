//Accept age of a Person and display a message 
//if the person can vote or not.
import java.util.*;
public class sel3
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Age");
        int n=sc.nextInt();
        if (n>=18)
        	System.out.println(n+" can Vote");
        else
        	System.out.println(n+" cannot Vote");
        
    }//end of main
}//end of class
