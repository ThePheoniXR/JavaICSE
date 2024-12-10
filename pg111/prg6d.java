package pg111;

//Check whether M is a factor of L or not
//If M is a factor of L, then print whether it is an even factor or an odd factor
//If M is not a factor of L, then just print "Not a Factor".
import java.util.*;
class prg6d
{
    public static void main ()
    {
        Scanner sc = new Scanner (System.in);
        int M, L;
        System.out.println("Enter Number to be Checked: ");
        M=sc.nextInt();
        System.out.println("Enter Number to be Checked from: ");
        L=sc.nextInt();
        if (M%L==0)
        {
            System.out.println(M + " is a factor of " + L);
            if (M%2==0)
            System.out.println(M + " is an Even Factor ");
            else
            System.out.println(M + " is an Odd Factor");
        }
        else
        System.out.println("Not a Factor");
    }
}
