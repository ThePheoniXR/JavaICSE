import java.util.*;// Write a program to accept a string. 
class StrLongWord//and display longest word and its size/length 
{
 public static void main()
    { 
        Scanner x=new Scanner (System.in);
        String s,w = "", lw="";             
        int i, len; 
        char ch;
        System.out.println("Enter a Sentence");
        s=x.nextLine();
        s=s +".";  //or  " "
        System.out.println("Given Sentence :  "+ s);
        len=s.length();
        for(i=0;i<len;i++)
        {
            ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch))  //or if(ch != ' ')
              w = w + ch ;
            else
                    { if(w.length() > lw.length())
                        lw=w;
                        w="";
                    }//END OF ELSE
                }//end of for
        System.out.println("Longest word: " +lw +" size: "+lw.length()); 
        }//end of main
    }

