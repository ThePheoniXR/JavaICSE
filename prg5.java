package pg91;

//mini calculator with 5 operators
import java.util.*;
class prg5
{
    public static void main()
        {
            double fn, sn,  res;
            char opr;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the First Number.");
            fn=sc.nextDouble();
            System.out.println("Enter the Second Number.)");
            sn=sc.nextDouble();
            System.out.println("Enter the desired operator +, -, *, /, %");
            opr=sc.nextLine().charAt(0);
            if(opr == '+')
            {
                res = fn + sn;
                System.out.println("Sum of " + fn + " and " + sn + " = " + res); 
            }
        else
            if (opr == '-')
            {
                res = fn - sn;
                System.out.println("Difference between " + fn + " and " + sn + " = " + res);
            }
            else
                if (opr == '*')
                {
                    res = fn * sn;
                    System.out.println("Product of " + fn + " and " + sn + " = " + res);
                }
            else
                if (opr == '/')
                {
            if (sn !=0)
            {
                    res = fn / sn;
                    System.out.println("Division of " + fn + " and " + sn + " = " + res);
            }
    else System.out.println("Division by Zero not possible");
                } //end of '/'
                else
                    if (opr == '%')
                    {
                        if (sn != 0)
                        {
                            res = fn%sn;
                            System.out.println("Remainder of "+ fn + " and " + sn + " = " + res);
                        }
                        else
                        {
                            System.out.println("Error in Division");
                        }
                    }
                    else 
                    {
                        System.out.println("Wrong Choice of Operator");
                    }
                }
            }
            
                
                    
            