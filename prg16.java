package pg91;

// (P != Q, P%2==0) K = 10;
// (P != Q, P%2!=0) K = 20;
// (otherwise) K = 30;

import java.util.*;
class prg16
{
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter P: ");
        double P = sc.nextDouble();
        System.out.println("Enter Q: ");
        double Q = sc.nextDouble();
        double K;
        if (P!=Q && P%2==0)
        System.out.println("K: 10");
        else 
            if (P!=Q && P%2!=0)
            System.out.println("K: 20");
            else
            System.out.println("K: 30");
    }
}