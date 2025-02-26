//Write the programs in Java to display the first ten terms of the given series: 4, 8, 16, 32, ...
class Lp10
{
    public static void main()
    {
        int tn, tv=2;
        for (tn=1; tn<=10; tn=tn+1)
        {
            tv=tv*2;
            System.out.print(tv +",");
        }//end of for loop
    }//end of main()
}//end of class