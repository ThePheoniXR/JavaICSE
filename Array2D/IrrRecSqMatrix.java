package Array2D;
import java.util.*;
/**
 * WAP to initialize with values into irregular matrix, rectangular matrix and square matrix,
 * display elements of 3 matrix form
 */
class IrrRecSqMatrix
{
    static Scanner sc = new Scanner(System.in);
    public static void main()
    {
        int a[][]={{1,2,3},{1,2},{1,2,3,4}};//irregular Matrix
        int b[][]={{1,2,3,4},{1,2,3,4},{1,2,3,4}};//rectangular Matrix
        int c[][]= {{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};//square matrix
        int i, j;
        System.out.println("Display Matrix");
        for (i=0; i<a.length; i++)
        {
            for (j=0; j<a[i].length; j++)
                System.out.print(a[i][j] + "\t");//end of inner loop - j
            System.out.println();
        }//end of outer loop - i
        System.out.println("Display Matrix");
        for (i=0; i<a.length; i++)
        {
            for (j=0; j<a[i].length; j++)
                System.out.print(a[i][j] + "\t");//end of inner loop - j
            System.out.println();
        }//end of outer loop - i
        System.out.println("Display Matrix");
        for (i=0; i<b.length; i++)
        {
            for (j=0; j<b[i].length; j++)
                System.out.print(b[i][j] + "\t");//end of inner loop - j
            System.out.println();
        }//end of outer loop - i
        System.out.println("Display Matrix");
        for (i=0; i<c.length; i++)
        {
            for (j=0; j<c[i].length; j++)
                System.out.print(c[i][j] + "\t");//end of inner loop - j
            System.out.println();
        }//end of outer loop - i
    }
}

