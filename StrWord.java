import java.util.*;// Write a program to accept a string. 
class StrWord//form and display each word seperately 
{
 public static void main()
    { 
        Scanner x=new Scanner (System.in);
        String s,w = "";             
        int i, len; 
        char ch;
       
        System.out.println("Enter a Sentence");
        s=x.nextLine();
        //s=s +".";  //or  " "
        System.out.println("Given Sentence :  "+ s);
        len=s.length();
        for(i=0;i<len;i++)
        {
            ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch))  //or if(ch != ' ')
              w = w + ch ;
            else
                    { 
                        System.out.println(w); 
                        w="";
                    }//END OF ELSE
                }//end of for
        }//end of main
    }

