//Write the program in Java to display the first ten terms of the following series: 1,4. 9. 16,...
class Lp8
{
    public static void main()
    {
            int tn, tv;
            for (tn=1; tn<=10; tn=tn+1)
            {
                tv=tn*tn;
                System.out.print(tv + ",");
            }//end of for loop
    }//end of main()
}//end of class