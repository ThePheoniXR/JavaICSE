package pg91;

//Entry to a club based on the Person's age
import java.util.*;
class prg9
{
    public static void main()
    {
        int g;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        g = sc.nextInt();
        if (g == 13)
        System.out.println("You are Welcome to Teen Club");
        else 
            if (g == 60)
            System.out.println("You are Welcome to Senior Citizen");
            else
            System.out.println("You are Welcome as a Guest");
    }
}

