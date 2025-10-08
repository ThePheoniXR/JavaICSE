/* Wap to accept a sentence, and display 
 * each letter with its corresponding ASCII value.
Eg: s="ABC" OUTPUT:
CHARACTERS-         Ascii code     
            A    -    65
            B    -    66
            C    -    67 */
import java.util.Scanner;
class StrAscii
{
public static void main ()
{
Scanner sc=new Scanner (System.in);
String s;
char ch;
int  i, len ;
System.out.println("Enter a sentence");
s= sc.nextLine();   
len= s.length();
System.out.println("CHARACTERS\t-\tAscii code");
for ( i=0; i< len; i++)
{
ch= s.charAt(i);
System.out.println(ch + "\t\t-\t" + (int)ch);
}//end of loop
}//end of main() 
}//end of class 
