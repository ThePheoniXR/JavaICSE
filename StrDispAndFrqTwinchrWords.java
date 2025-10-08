/* Write a program to accept a string. Convert the string to uppercase. Count and output the number of 
*double letter sequences that exist in the string. 
*Sample Input : “SHE WAS FEEDING THE LITTLE RABBIT WITH AN APPLE” 
*Sample Output : 4 */
import java.util.*;
class StrDispAndFrqTwinchrWords
{
 public static void main()
    { 
        Scanner x=new Scanner (System.in);
        String s,w = "";             
        int i, len, c=0; 
        char ch;
        boolean twin = false;
        System.out.println("Enter a Sentence");
        s=x.nextLine()+".";
        len=s.length();
        for(i=0;i<len;i++)
        {
            ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch))
              { w = w + ch ; 
                  if(ch == s.charAt(i+1)) 
                  twin = true;  
                }//END OF IF
            else
                { if(twin) 
                    { System.out.println(w); 
                        twin=false;
                        c++;
                    }
                    w=""; 
                }//END OF ELSE
        }//end of for
        System.out.println("counter = " + c);
    }//end of main
}//end of class
