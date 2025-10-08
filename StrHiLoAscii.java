/* Define a class to input a word in lower case. Find and display the following:
• The letter with the highest ASCII value
• The letter with the lowest ASCII value */
import java.util.Scanner;
class  StrHiLoAscii
{
public static void main ()
{
Scanner sc=new Scanner (System.in);
String s ;
int i, len;
char ch, hi='a', le='z';  
System.out.println("Enter a word");
s = sc.nextLine();
s=s.toLowerCase();
len= s.length();    

for ( i=0; i< len; i++)
{
ch= s.charAt(i);
if(ch > hi )   hi=ch;
if(ch < le )   le=ch;
}//end of loop
System.out.println(" The letter with the lowest ASCII value is "+ le + " - " + (int)le );
System.out.println(" The letter with the highest ASCII value is "+ hi + " - " + (int)hi );
}//end of main() 
}//end of class 
