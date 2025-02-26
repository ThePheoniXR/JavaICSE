// Write the programs in Java to display the following patterns:
// *
// * #
// * # *
// * # * #
// * # * # *
class PatPrg7
{
    public static void main()
    {
        int i, j;
        for (i=1; i<=5; i++)
        {
            for (j=1; j<=i; j++)
            {
                if (j%2==0)
                System.out.print("# ");
                else
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}