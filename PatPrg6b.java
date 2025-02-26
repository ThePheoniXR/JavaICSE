//Write the programs in Java to display the following patterns;
/* 1
 * 1 2
 * 1 2 3
 * 1 2 3 4 5
 * 1 2 3 4 5
 */
class PatPrg6b
{
    public static void main()
    {
        int i, j;
        for (i=1; i<=5; i++)
        {
            for (j=1; j<=i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}