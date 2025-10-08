//Example : Sample Input : computer 
// new string only the first letter of each word of the 
//sentence in capital letters separated by a full stop. 
//Example : INPUT SENTENCE : “This is a cat” 
 //OUTPUT : T.I.A.C.
import java.util.*;
class StrAbrivate
{ public static void main()
    { Scanner x=new Scanner (System.in);
        String s,ns = "";             
        int i, len;
        char ch;
        System.out.println("Enter a sentence");
        s=x.nextLine().toUpperCase();
        len = s.length();
        ns=s.charAt(0) + ".";
        for(i=0 ; i<len ; i++)
        {
            ch=s.charAt(i);
            if(ch==' ')
                ns = ns + s.charAt(i+1) + ".";
        }//end of for
        System.out.println("New String = " + ns);
    }//end of main
}//end of class
