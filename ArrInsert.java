 

/**
 * WAP to insert an element in an one dimensional array at specificed position
 */
import java.util.*;
class ArrInsert
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
            int a[]={54, 73, 76, 84, 92, 221, 273, 415, 655, 1456, 0}; //intitialzing array
            System.out.println("Enter number to insert into array: ");
            int no=Integer.parseInt(sc.nextLine());
            System.out.println("Enter position");
            int p = Integer.parseInt(sc.nextLine());
            int i;
            //creating space at position
            for (i=a.length-1; i>=p; i--)
                a[i]=a[i-1]; //shifting each elements from last index till p
                a[i]=no; //storing n at p
                for (i=0; i<a.length;i++)
                System.out. println(a[i]+", ");
    }//end of main
}//end of class
