package Array2D;

/**
 * Define a class to accept values into an integer array of order 4*4,
 * and check whether it is a DIAGONAL array or not. An Array is DIAGONAL,
 * if the sum of the left diagonal elements equals the sum of the right diagonal elements.
 * Print the appropriate message.
 * Example
 *  3   4   2   5
 *  2   5   2   3
 *  5   3   2   7
 *  1   3   7   1
 *  Sum of the left diagonal elements = 3+5+2+1 = 11
 *  Sum of the right diagonal elements = 5+2+3+1=11
 */
class checkDiagonal
{
    int x[][];
    checkDiagonal(int z[][])
    {
        x=z;
    }
    void checkDiagonal()
    {
        int i, c, ld=0, rd=0;
        for (i=0; i<x.length; i++)
        {
            ld+=x[i][i];
            rd+=x[i][3-i];
        }
        if(ld==rd)
        System.out.println("Diagonal Array");
        else
        System.out.println("Not a Diagonal Array");
    }
    
}
