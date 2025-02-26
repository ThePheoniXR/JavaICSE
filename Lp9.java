//Write the programs in Java to display the first ten terms of the following series: 1, 2, 4, 7, 11, ...
//tn 1 2 3 4 5 ... .. .
//tv 1 2 4 7 11 ... .. .
class Lp9
{
    public static void main()
    {
        int tn, tv=1;
        for (tn=1; tn<=10; tn=tn+1)
        {
            System.out.print(tv + ",");
            tv=tv+tn;
        }//end of for loop
    }//end of main()
}//end of class