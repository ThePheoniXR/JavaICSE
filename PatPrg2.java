/* Write the programs in Java to display the following patterns
 * 1 1 1 1 1 
 * 2 2 2 2 2
 * 3 3 3 3 3
 * 4 4 4 4 4 
 * 5 5 5 5 5
 */
class PatPrg2
{
    public static void main()
    {
        int i, j;
        for (i=1; i<=5; i++)
        {
            for (j=1; j<=5; j++)
            {
            System.out.print(i + " ");
        }
        System.out.println();
        }
    }
}