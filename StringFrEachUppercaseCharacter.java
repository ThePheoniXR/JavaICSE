import java.util.*;//
class StringFrEachUppercaseCharacter//to display frequency of Uppercase, 
//lowercase, digits, special characters, and words from a sentence
// using Character class
{
    public static void main() {
        Scanner x=new Scanner (System.in);
        String s;
        int i, len, fU=0, fl=0,fd=0, fw=0;
        char c;
        System.out.println("Enter a sentence");
        s=x.nextLine();
        len=s.length();
        System.out.println("Length =" + len);
        for(i=0;i<len;i++)
        {
            c=s.charAt(i);
            if(Character.isUpperCase (c))
                fU++;
            else if (Character.isLowerCase (c))
                fl++;
            else if (Character.isDigit(c))
                fd++;
            else  if (Character.isWhitespace(c))
                fw++;
        }//end of for
        System.out.println("Uppercase " + fU);
        System.out.println("lowercase: " + fl);
        System.out.println("Digits: " + fd);
        System.out.println("Words: " + (fw+1));
        System.out.println("Special characters: " + (len-fU-fl-fd-fw));
    }//end of main
}//end of class

