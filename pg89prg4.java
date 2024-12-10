//Check whether an item incurred Profit or Loss
import java.util.*;
class pg89prg4
{
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        double sp, cp;
        System.out.println("Enter the Cost Price: "); 
        cp= sc.nextDouble();
        System.out.println("Enter the Selling Price: "); 
        sp= sc.nextDouble();
        if (sp>cp)
            { 
            System.out.println("The item incurred Profit.");
            System.out.println("Profit Percentage= "+ (sp-cp)/cp*100);
            }
        else
            if (cp>sp)
             { 
            System.out.println("The item incurred Loss.");
            System.out.println("Loss Percentage= "+ (cp-sp)/cp*100);
            }
        else 
        System.out.println("No Profit or Loss");
    }
}
