/* accept a sentence form a new sentence
 * by encoding each letters by shifting
 * by adding with a code value entered by user */
import java.util.*;
class EncodeDecode  
{
    public static void main()
    {
        Scanner x=new Scanner (System.in);
        String s, ns="";
        int len, i,k;
        char ch,j;
        System.out.println("Enter a sentence");
        s=x.nextLine();
        s=s.toUpperCase();
        len=s.length();
        for(j='A';j<='Z';j++)
        {
        for(i=0, k=0;i<len;i++)
        {
            ch=s.charAt(i);
            if(ch==j)
             k++;
        }//end of i loop String-chars 
        if(k!=0)
        System.out.println(j+" - " +k);
    }//end of j loop alphabets
}//end of main
}//end of class
