package Array2D;

/**
 * WAP to accept [n*n] matrix, display elements in a square matrix form
 */
import java.util.*;
class Sqr_Mat1
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows/columns: ");
        int n = sc.nextInt();
        int a[][]=new int [n][n]; //Square Matrix
        int i, j;
        for (i=0; i<n; i++) //input 2D Matrix
            for (j=0; j<n; j++)
            {
                System.out.println("Enter the value at row: " + (i+1) + " col: " + (j+1));
                a[i][j]=sc.nextInt();
            }
        System.out.println("Display Matrix");
        for (i=0; i<n; i++)
        {
            for (j=0; j<n; j++)
            System.out.print(a[i][j] + "\t");//end of inner loop - j
            System.out.println();
        }//end of outer loop - i
    }//end of main()
}//end of class
