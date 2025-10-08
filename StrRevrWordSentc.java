/* accept a sentence reverse it into another string variable 
ex: s="His name is Anantha Krishnan Venugopalan Nair "
output :" riaN nalapoguneV nanhsirK ahtnanA si eman siH" */ 
import java.util.Scanner;
class StrRevrWordSentc
{
public static void main ()
{
Scanner sc=new Scanner (System.in);
String s, t="";
char ch;
int  i, len ;
System.out.println("Enter a sentence");
s = sc.nextLine();   // My name is Anantha Krishnan Venugopalan Nair 
len= s.length();
for ( i=0; i< len; i++)   
{
  ch= s.charAt(i); 
  t = ch + t;    
}//end of loop

System.out.println("Reversed sentence: "+t);
}//end of main() 
}//end of class 
