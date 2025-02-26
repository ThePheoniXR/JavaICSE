/* Write the programs in Java to display the following patterns:
 * 1 2 3 4 5 
 * 6 7 8 9 10
 * 11 12 13 14 15
 * 16 17 18 19 20
 * 21 22 23 24 25 
 */
class PatPrg3
{
    public static void main()
    {
        int i, j, c=0;
        for (i=1; i<=5; i++)
        {
            for (j=1; j<=5; j++)
            {
                System.out.print(++c + " ");
            }
            System.out.println();
        }
    }
}