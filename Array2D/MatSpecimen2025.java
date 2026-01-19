/**
 * ICSE Specimen 2025
 * Define a class to accept values into 4*4 array and find and display the sum of each row.
 * Example: A[][]={{1,2,3,4},{5,6,7,8},{1,3,5,7},{2,5,3,1}}
 * Output:
 * sum of row 1 = 10 (1+2+3+4)
 * sum of row 2 = 26 (5+6+7+8)
 * sum of row 3 = 16 (1+3+5+7)
 * sum of row 4 = 11 (2+5+3+1)
 */
package Array2D;
import java.util.*;
class MatSpecimen2025
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int a[][]= new int[4][4]; //Square Matrix
        int i, j, sumr;
        String s;
        for (i=0; i<4; i++) //input 2D Mat
            for (j=0; j<4; j++)
            {
                System.out.println("Enter the value at row: " + (i+1) + "col: " + (j+1));
                a[i][j]=sc.nextInt();
            }
        for (i=0; i<4; i++)
        {
            for (j=0, sumr=0, s="("; j <4; j++)
            {
                sumr+=a[i][j];
                s+=a[i][j] + (j==3?"":" + ");//Ternary Operator 
                //(j==3?"" : " +") is used to ensure a plus sign is added after every number except the last one.
            }
            System.out.println("Sum of row " + (i+1) + " = " + sumr + s + ")");
        }//end of outer loop - i
        System.out.println("Display Matrix");
        for (i=0; i<a.length; i++)
        {
            for (j=0; j<a[i].length; j++)
            System.out.print(a[i][j]+"\t");//end of inner loop - j
            System.out.println();
        }//end of outer loop - i
    }//end of main
}//end of class