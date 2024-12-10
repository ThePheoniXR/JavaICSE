package pg111;
//(Y > 8) HRA = (25.0/100)*salary;
//else HRA = (18.0/100)*salary;
//HRA: House Rent Allowance
import java.util.*;
class prg6h
{
    public static void main ()
    {
        Scanner sc = new Scanner(System.in);
        double HRA = 0.0, salary, Y;
        System.out.println("Enter the Salary: ");
        salary=sc.nextDouble();
        System.out.println("Enter the Years of Service: ");
        Y=sc.nextDouble();
        if (Y>8)
        HRA = (25.0/100)*salary;
        else
        HRA = (18.0/100)*salary;
        System.out.println("House Rent Allowance: " + HRA);
    }
}