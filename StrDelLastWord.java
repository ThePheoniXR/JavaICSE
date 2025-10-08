/* Define a class to accept a line of string containing multiple words.
 * Now eliminate the last word and display the modified string.
Example:
Sample Input: I have a lot of books pens
Sample Output: I have a lot of books */
import java.util.Scanner;
class StrDelLastWord
{
public static void main ()
{
Scanner sc=new Scanner (System.in);
String s ;
int i;
System.out.println("Enter a line of string");
s = sc.nextLine();
System.out.println("Given string: " + s);
i= s.lastIndexOf(' ');     // last space index number , example- space between (books pens)
//j =s.lastIndexOf(' ',i-1); // II last
s = s.substring(0,i);       
System.out.println("Modified string: "+ s);
}//end of main() 
}//end of class 
