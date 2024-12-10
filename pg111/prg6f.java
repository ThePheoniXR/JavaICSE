package pg111;
//(choice == 1) Input: Kelvin; Output: Celsius;
//(choice == 2) Input: Celsius; Output: Kelvin;
//K = C - 273
import java.util.*;
class prg6f
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int K,C, choice;
        System.out.println("Enter the choice: [1 to input Kelvin or 2 to input Celsius]");
        choice=sc.nextInt();
        if (choice == 1)
        {
            System.out.println("Enter the Temperature in Kelvin");
            K=sc.nextInt();
            C=K-273;
            System.out.println("Temperature in Celsius: " + C);
        }
        else if (choice == 2)
        {
            System.out.println("Enter the Temperature in Celsius");
            C=sc.nextInt();
            K=C+273;
            System.out.println("Temperature in Kelvin: " + K);
        }
        else
        System.out.println("Invalid Input");
    }
}