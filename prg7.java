package pg91;

//Input length of 3 sides, and check if it can form a triangle , if so specify its
//type-isosceles , equilateral ,right angle triangle or scalene
import java.util.*;
public class prg7
{
    public static void main()
        {
            double a,b,c;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter 1st side");
            a=sc.nextDouble();
            System.out.println("Enter 2nd side");
            b=sc.nextDouble();
            System.out.println("Enter 3rd side");
            c=sc.nextDouble();
            if(a >b+c || b > a+c || c > a+b)
                System.out.println("Cannot form a triangle");        
            else if (a==b && b ==c)
                System.out.println("Equilateral triangle");
            else if ( a ==b || b == c || c ==a)
                  System.out.println("Isosceles triangle");
            else if (a*a == b*b + c*c || b*b == c*c + a*a || c*c == b*b + a*a) //using Pythagoras Theorem
                      System.out.println("Right angled triangle");
            else 
                  System.out.println(" Scalene triangle");
                }
    }
