import java.util.*;//
class Stringpiglatinword//to convert  all words in a paragraph to piglatin
{
    public static void main() {
        Scanner x=new Scanner (System.in);
        String s,wv= "",wc="",ns="";             
        int i, len; 
        char c;
        System.out.println("Enter a Sentence");
        s=x.nextLine();
        s = s.toLowerCase();
        s=s +".";  //or  "  "   
        len=s.length();
        boolean vow=false;
        for(i=0;i<len;i++)
     {
            c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                vow=true;
            if(Character.isLetterOrDigit(c))
                if(vow) wv = wv + c;  else   wc = wc + c;
            else
            {
                ns = ns + wv + wc + "ay" + " ";
                wv="";
                wc="";
                vow=false;
            }//end of else
        }//end of for
        System.out.println(ns);
    }//end of main
}//end of class


