package Array2D;
/**
 * Define a class to accept values into [m*n] rectangular matrix array and find and 
 * display the sum of [each row, each column and total elements]
 */

import java.util.*;
class RectMatrixSumRowCol
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no: of rows");
        int m = sc.nextInt();
        System.out.println("Enter no: of columns");
        int n = sc.nextInt();
        int a[][]=new int[m][n]; //Rectangle Matrix
        int i,j , sum=0, rowsm, colsm;
        for (i=0; i<m; i++) //input 2D Matrix
            for (j=0; j<n; j++)
            {
                System.out.println("Enter the value at row: " + (i+1) + "column: " + (j+1));
                a[i][j]=sc.nextInt();
            }
        //process sum of each row
        for (i=0; i<m; i++)
        {
            for (j=0, rowsm=0; j<n; j++)
            {
                sum+=a[i][j];
                rowsm+=a[i][j];
            }//end of inner loop - i
            System.out.println("Sum of row: " + (i+1) + " = " + rowsm);
        }//end of outer loop - i
        //process sum of each column
        for (i=0; i<n; i++)
        {
            colsm=0;
            for (j=0; j<m; j++)
            
                colsm+=a[j][i]; //end of inner loop - j
            System.out.println("Sum of column: " + (i=1) + " = " + colsm);
        }//end of outer loop -i 
        System.out.println("Sum = " + sum);
        System.out.println("Display Matrix");
        for (i=0; i<m; i++)
            {
                for (j=0; j<n; j++)
                System.out.print(a[i][j] + "\t"); //end of inner loop - j
                System.out.println();
            }//end of outer loop - i
    }
}