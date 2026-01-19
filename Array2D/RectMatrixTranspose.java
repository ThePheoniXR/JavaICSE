package Array2D;

/**
 * Define a class to accept values into [m*n] array and create a new transpose matrix and display
 */
import java.util.*;
class RectMatrixTranspose
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int m = sc.nextInt();
        System.out.println("Enter number of columns: ");
        int n = sc.nextInt();
        int a[][]=new int[n][n]; //Rectangle Matrix: m - rows & n - columns
        int i, j;
        int b[][]= new int[m][m];
        for (i=0; i<m; i++) //input 2D matrix
            for (j=0; j<n;j++)
            {
                System.out.println("Enter the value at row " + (i+1) +" column " + (j+1));
                a[i][j]=sc.nextInt();
            }
        for (i=0; i<m; i++)
            for (j=0; j<n; j++)
            b[j][i]=a[i][j];
            System.out.println("Display Original Matrix");
        for (i=0; i<m; i++)
        {
            for (j=0; j<n; j++)
            System.out.println(a[i][j] +"\t");
            System.out.println();
        }
        System.out.println("Display Transpose Matrix");
        for (i=0; i<n; i++)
        {
            for (j=0; j<m; j++)
            System.out.println(b[i][j] +"\t");
            System.out.println();
        }//end of outer loop - i
    }//end of main
}//end of class