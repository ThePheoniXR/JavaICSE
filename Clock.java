class Clock
{
    public static void main()
    {
        int h, m, s, c=0;
        for (h=1; h<=12; h++)
        {                               //12 times
            for (m=1; m<=60; m++)
            {                           //60*12 times
                for (s=1; s<=60; s++)
                {
                    System.out.println("counter= "+ ++c + ", h = " + h + ", m = " + m + ", s = " + s ) ;          //60*60*12 times 
                }
            }
        }
    }
}