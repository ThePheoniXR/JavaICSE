/* to accept a sentence and a word from user and check if 
 * the word is present in that sentence, display a message 
 * "the word exists in the sentence" else 
 * "the word doesn't exists in the sentence"
ex: s="His name is Anantha Krishnan Ananthapadmanabhan Venugopalan Nair"
uw="anantha"
output : The word anantha exists in the sentence */

import java.util.Scanner;
class StrWordSearchindxof
{
public static void main ()
{
Scanner sc=new Scanner (System.in);
String s, uw;
int  i;

System.out.println("Enter a sentence");
s = sc.nextLine();
System.out.println("Enter a word to be searched in the above sentence ");
uw = sc.nextLine();
uw = " " +uw+ " ";   

if(s.indexOf(uw)>-1)
System.out.println("The word "+uw+" exists in the sentence: "+s);
else 
System.out.println("The word "+uw+" doesn't exists in the sentence: "+s);
}//end of main() 
}//end of class 
