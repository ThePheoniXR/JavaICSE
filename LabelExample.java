class LabelExample
{
public static void main()
{  
    
int j, k;
first:          //label
for ( j = 1; j <= 6; j++)
{
    for ( k = 1; k <= j; k++)
     {
        if (k > 4)
            break first;
        System.out.print(k);
     }  //end of k loop
    System.out.println();
} //end of j loop
} //end of main 
} //end of class
