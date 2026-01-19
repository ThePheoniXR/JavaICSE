package Array2D;

/**
 * WAP to accept n*n numbers into a square matrix, check if the matrix is symmetric
 */
import java.util.*;
class MatSymmetric
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no: of rows/columns: ");
        int n = sc.nextInt();
        int a[][]= new int [n][n]; //Square Matrix
        int i, j;
        for (i=0; i<n; i++) //input 2D Matrix
            for (j=0; j<n; j++)
            {
                System.out.println("Enter the value at row: " + (i+1) + "column: " + (j+1));
                a[i][j]=sc.nextInt();
            }
        System.out.println("Display Matrix");
        for (i=0; i<a.length; i++)
            {
                for (j=0; j<a[i].length; j++)
                System.out.print(a[i][j] + "\t");
                System.out.println();
            }
        //process
        for (i=0; i<n; i++)
            for (j=0; j<i; j++)
                if (a[i][j]!=a[j][i])
                {
                    System.out.println("is not Symmetric");
                    System.exit(0);
                }
        System.out.println("is Symmetric");
    }
}
