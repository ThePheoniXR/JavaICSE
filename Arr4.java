/**
 * Write a program to accept 'n' numbers into an array & create a new array of same size,
 * store all the element from the first array in reverse order into second array, display the second array
 * a        11      888     554     879     123
 *          0       1       2       3       4
 *          
 * b        123     879     554     888     11
 * 
 * */
 import java.util.*;
 class Arr4
 {
     public static void main()
     {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter no: of elements you want in array: ");
         int n = sc.nextInt();
         int a[]=new int[n];
         int b[]=new int[n];
         int i;
         System.out.println("ENter all the elements: ");
         for(i=0; i<a.length; i++) //n
             {
                 System.out.println("Enter the value at: " + (i+1));
                 a[i]=sc.nextInt();
             }
         for (i=0; i<n; i++)
         {
             b[i]=a[n-1-i];
         }
         for (i=0; i<n; i++)
         System.out.println(b[i]+ ", ");
     }//end of main
 }//end of class