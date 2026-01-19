package Array2D;

/**
 * WAP to accept n*n numbers into a square matrix find sum of 
 * each column, each row and all elements.
 */
import java.util.*;
class MatrixSumRowCol
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no: of rows/colums: ");
        int n = sc.nextInt();
        int a[][]=new int[n][n]; //Square Matrix: n-row & n-columns
        int i, j, sum, rowsm, colsm;
        for (i=0; i<n; i++) //input 2D Matrix
            for (j=0; j<n; j++)
            {
                System.out.println("Enter the value at row: " + (i+1) + "col: " + (j+1));
                a[i][j]=sc.nextInt();
            }
        //process
        for (i=0, sum=0; i<n; i++)
        {
            for (j=0, rowsm=0, colsm=0; j<n; j++)
            {
                sum+=a[i][j];
                rowsm+=a[i][j];
                colsm+=a[j][i];
            }//end of inner loop - j
            System.out.println("Sum of row: " + (i+1) + " = " + rowsm);
            System.out.println("Sum of col: " + (i+1) + " = " + colsm);
        }//end of outer loop - i
    
    System.out.println("Display Matrix");
    for (i=0; i<n; i++)
    {   
        for (j=0; j<n; j++)
        System.out.print(a[i][j]+"\t"); //end of inner loop-j
        System.out.println();
    }//end of outer loop - i
    System.out.println("Sum = " + sum);
    }//end of main
}//end of class
