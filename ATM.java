//Prg5-WAP to accept an amount and display it in given
//denominations : 500, 200, 100, 50, 20, 10, 5, 2, 1
import java.util.Scanner;//attaching Scanner class
public class  ATM
{
  public static void main(String arg[])
 {  
    Scanner x = new Scanner(System.in);//connecting KB
     int n;
    System.out.println("Enter an amount ");
    n= x.nextInt();//reading from keyboard
    System.out.println("Number of 500 = " + n/500);
     n = n % 500;
    System.out.println("Number of 200 = " + n/200);
     n = n % 200;
    System.out.println("Number of 100 = " + n/100);
     n = n % 100;
     System.out.println("Number of 50 = " + n/50);
     n = n % 50;
     System.out.println("Number of 20 = " + n/20);
     n = n % 20;
     System.out.println("Number of 10 = " + n/10);
     n = n % 10;
     System.out.println("Number of 5 = " + n/5);
     n = n % 5;
     System.out.println("Number of 2 = " + n/2);
     n = n % 2;
     System.out.println("Number of 1 = " + n);
    }
}
   
    
    
   
