//Write the programs in Java to display the following patterns:
// 5 4 3 2 1
// 5 4 3 2
// 5 4 3
// 5 4 
// 5
class PatPrg8
{
    public static void main()
    {
        int i, j;
        for (i=1; i<=5; i++)
        {
            for (j=5; j>=i; j--)
            System.out.print(j + " ");
            System.out.println();
        }
    }
}