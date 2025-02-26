// Write the programs in Java to display the following patterns:
// 1 3 5 7 9
// 1 3 5 7 
// 1 3 5 
// 1 3
// 1
class PatPrg10
{
    public static void main()
    {
        int i, j;
        {
            for (i=5; i>=1; i--)
            {
                for (j=1; j<=i; j++)
                {
                    System.out.print((j*2)-1 + " ");   
                }
                System.out.println();
            }
            
        }
    }
}