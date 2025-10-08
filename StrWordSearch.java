/* to accept a sentence and a word from user and check if 
 * the word is present in that sentence, display frequency and message 
 * "the word exists in the sentence" else 
 * "the word doesn't exists in the sentence"
ex: s="His name is Anantha Krishnan Venugopalan Nair"
uw="anantha"
output : The word anantha exists in the sentence */

import java.util.Scanner;
class StrWordSearch
{
public static void main ()
{
Scanner sc=new Scanner (System.in);
String s, w="", uw;
char ch;
int  i, len , f=0;
boolean found = false;
System.out.println("Enter a sentence");
s = sc.nextLine();
System.out.println("Enter a word to be searched in the above sentence ");
uw = sc.nextLine();   
s= s + "."; 
len= s.length();
for ( i=0; i< len; i++)
{
ch= s.charAt(i);
if(ch == ' ' )
     {
     if( uw.equalsIgnoreCase(w))  
           { found=true; f++; }
     w="";
     }
else
     w=w+ch;
}//end of loop
if(found)
System.out.println("The word "+uw+" exists : "+ f + " times ");
else 
System.out.println("The word "+uw+" doesn't exists in the sentence: "+s);
}//end of main() 
}//end of class 
