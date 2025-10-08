import java.util.*;// accept a word and check if it is a palindrome
class StrPalin//or not a palindrome word 
{           //  Eg.: Malayalam-malayalaM
    public static void main()
    {
        Scanner x=new Scanner (System.in);
        String s,r="";
        int len, i;
        char ch;
        System.out.println("Enter a word");
        s=x.nextLine();
        len=s.length();
        for(i=0;i<len;i++)
        {
            ch=s.charAt(i);
            r=ch+r;
        }//end of for
        if(r.equalsIgnoreCase(s))
        System.out.println(s+" is a palindrome");
        else
        System.out.println("Not a palindrome");
    }
}