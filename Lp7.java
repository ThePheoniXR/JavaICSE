//Write a program to generate series: 2,3; 4,6; 6,9; ... 300.
class Lp7
{
    public static void main()
    {
        int tn;
        for (tn=1; tn<=100; tn=tn+1)
        System.out.println(2*tn + "," + 3*tn + ";");
    }//end of main()
}//end of class