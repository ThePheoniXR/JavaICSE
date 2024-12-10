import java.util.*;
class pg89prg3
{
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        int st, et;
        System.out.println("Enter the starting temperature: "); 
        st= sc.nextInt();
        System.out.println("Enter the Ending Temperature: "); 
        et= sc.nextInt();
        if (et>st)
            System.out.println("INCREASE in Molecular Motion.");
        else
            if (et<st)
                System.out.println("DECREASE in Molecular Motion");
        else
            System.out.println("NO Change in Molecular Motion.");
    }
}