/* Write the programs to display the following patterns:
 * 1_1 1_2 1_3 1_4 1_5
 * 2_1 2_2 2_3 2_4 2_5
 * 3_1 3_2 3_3 3_4 3_5
 * 4_1 4_2 4_3 4_4 4_5
 * 5_1 5_2 5_3 5_4 5_5
*/
class PatPrg_1_2
{
    public static void main()
    {
        int i, j;
        for (i=1; i<=5; i++)
        {
            for (j=1; j<=5; j++)
            {
            System.out.print(i+"_"+j+"\t");
        }
        System.out.println();
        }
    }
}