//Accept a sentence form a new sentence, converting
//each word first letter to uppercase 
import java.util.*;
class StrFirstletterEachWord
{
    public static void main()
    {
        Scanner x=new Scanner (System.in);
        String s,t="";
        int i, len;
        char c;
        System.out.println("Enter a sentence");
        s=x.nextLine();
        s=" "+s;
        len=s.length();
        for(i=0;i<len;i++)
        {//                                    
            c=s.charAt(i);
            if(c == ' ')
            {
            c=Character.toUpperCase(s.charAt(i+1));
            t=t+" "+c;
            i++;
            }//end of if
            else
            t=t+c;
        }//end of for
        System.out.println(t);
    }//end of main
}//end of class


