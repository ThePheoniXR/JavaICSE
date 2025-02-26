/* Write the programs in Java to display the following patterns:
//* * * * *
//* * * * *
//* * * * *
//* * * * *
//* * * * *
*/
class PatPrg4
{
    public static void main()
    {
        int i, j;
        for (i=1; i<=5; i++)
        {
            for (j=1; j<=5; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}