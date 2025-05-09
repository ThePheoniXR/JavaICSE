//WAP to accept days, display it in: 
//years, months, weeks & days1
import java.util.Scanner;//attaching Scanner class
public class  Days
{
  public static void main()
 {  
    Scanner x = new Scanner(System.in);//connecting KB
     int n;
    System.out.println("Enter number of Days ");
    n= x.nextInt();//reading from keyboard
    System.out.println("Number of years = " + n/365);
     n = n % 365;
    System.out.println("Number of months = " + n/30);
     n = n % 30;
    System.out.println("Number of weeks = " + n/7);
     n = n % 7;
     System.out.println("Number of days = " + n);
    }
}
   
    
    
   
