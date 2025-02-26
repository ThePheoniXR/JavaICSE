/*Write the programs in Java to display the following patterns:
 *1 2 3 4 5 
 *1 2 3 4 5
 *1 2 3 4 5
 *1 2 3 4 5
 *1 2 3 4 5 
 */
import java.util.*;
class PatPrg1
{
    public static void main()
    {
        int i, j;
        for (i=1; i<=5; i++)
        {
            for (j=1; j<=5; j++)
            System.out.print(j);
            System.out.println();
        }
        
    }
}