//Write the programs in Java to display the first ten terms of the given series: 0, 7, 26, ...
class Lp12
{
    public static void main()
    {
        int tn;
        for (tn=1; tn<=10; tn=tn+1)
        System.out.print(tn*tn*tn-1 + ",");
    }
}