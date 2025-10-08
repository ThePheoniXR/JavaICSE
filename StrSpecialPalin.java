import java.util.*;
class StrSpecialPalin
{
    public static void main()
    {
        Scanner x=new Scanner (System.in);
        String s,r="";
        int i, len;
        System.out.println("Enter a word");
        s=x.nextLine();
        s=s.toUpperCase();
        len=s.length();
        System.out.println("Length =" + len);
        if(s.charAt(0)==s.charAt(len-1))
            System.out.println(s+" is a Special word");
        else
        System.out.println(s+" is not a Special word");
        for(i=0;i<len;i++)  
            r=s.charAt(i)+r;//reverse
        if(s.equals(r))
        System.out.println(s+" is Palindrome");
        else
        System.out.println(s+" is not Palindrome");
    }//end of main
}//end of class
