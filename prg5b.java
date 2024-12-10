package pg91;

//mini calculator with 5 operators
import java.util.*;
public class prg5b
{
    public static void main()
        {
            double fn, sn;
            char opr;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the First Number.");
            fn=sc.nextDouble();
            System.out.println("Enter the Second Number.)");
            sn=sc.nextDouble();
            System.out.println("Enter the desired operator +, -, *, /, %");
            opr=sc.nextLine().charAt(0);
            if(opr == '+')
                System.out.println("Sum of " + fn + " and " + sn + " = " + (fn + sn)); 
            else if(opr == '-')
                System.out.println("Difference between " + fn + " and " + sn + " = " + (fn - sn));
            else if(opr == '*')
                System.out.println("Product of " + fn + " and " + sn + " = " + (fn * sn));
            else if(opr == '/' && sn !=0)
                      System.out.println("Division of " + fn + " and " + sn + " = " + (fn / sn));
                else if(opr == '%'&& sn != 0)
                            System.out.println("Remainder of "+ fn + " and " + sn + " = " + (fn % sn ) );
                else if (sn == 0)
                            System.out.println("Division by 0 is not possible");
                else
                        System.out.println("Wrong choice of operator");    
              }
            }
            
                
                    
            