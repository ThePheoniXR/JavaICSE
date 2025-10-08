import java.util.*;// Write a program to accept a string. 
class StrShortWord//and display longest word and its size/length 
{
 public static void main()
    { 
        Scanner x=new Scanner (System.in);
        String s,w = "", sw;             
        int i, len; 
        char ch;
        System.out.println("Enter a Sentence");
        s=x.nextLine();
        sw=s;
        s=s +".";  //or  " "
        System.out.println("Given Sentence :  "+ s);
        len=s.length();
        for(i=0;i<len;i++)
        {
            ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch))  //or if(ch != ' ')
              w = w + ch ;
            else
                    { if(w.length() < sw.length())
                        sw=w;
                        w="";
                    }//END OF ELSE
                }//end of for
        System.out.println("Longest word: " +sw +" size: "+sw.length()); 
        }//end of main
    }

