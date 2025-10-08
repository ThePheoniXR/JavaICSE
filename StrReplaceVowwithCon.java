//Example : Sample Input : computer 
import java.util.*;// Sample Output : cpmpvtfr
class StrReplaceVowwithCon
{ public static void main()   { 
        Scanner x=new Scanner (System.in);
        String s,ns = "";             
        int i, len;
        char ch;
        System.out.println("Enter a word");
        s=x.nextLine();
        len=s.length();
        for(i=0;i<len;i++)
        {
            ch=s.charAt(i);
            if("AEIOUaeiou".indexOf(ch)>-1)
                ns = ns + ++ch; 
            else
                ns = ns + ch;
        }//end of for
        System.out.println("New String = " + ns);
    }//end of main
}//end of class
