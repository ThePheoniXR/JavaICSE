package pg111;
//Stavensev Number (V): if it is V>700 and a multiple of 77 (V%77==0)
//<77 and a factor of 700 (700%V==0)
//Check whether a number is a Stavensev Number or not.
import java.util.*;
class prg6e
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int V;
        System.out.println("Enter a Number: ");
        V = sc.nextInt();
        if ((V>100 && V%77==0) || V<77 && 700%V==0)
        System.out.println(V + " is a Stavensev Number");
        else
        System.out.println(V + " is not a Stavensev Number");
    }
}
 