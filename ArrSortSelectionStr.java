import java.util.*;
    public class ArrSortSelectionStr
    {
    public static void main ( )
    {
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter no. of elements you want in array:");
    int n = Integer.parseInt(sc.nextLine());
    String a[ ] = new String[n];
    int i, j, p;
    String temp;
    
    for ( i= 0; i < a.length ; i++)   //n
    {
       System.out.println("Enter the value at : "+ (i+1));
       a[i] = sc.nextLine();
    }
    
    //Selection sort
    for ( i = 0; i < n-1; i++)
    {  
      for ( p=i, j = i+1; j < n; j++)
          if(a[p].compareToIgnoreCase( a[j]) > 0)
              p=j;//inner loop - j  n square times
      temp = a[i];//outer loop - i  n-1 times
      a[i] = a[p];
      a[p] = temp;
    }
       
    System.out.println("Sorted Array: ");
    for ( i = 0; i < n; i++)
        System.out.print(a[i] + ", ");
      
    }
    }
