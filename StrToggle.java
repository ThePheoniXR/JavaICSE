import java.util.*;//accept a sentence and form a new sentence
class StrToggle//with toggle case INPUT : WelComE TO School 
{ public static void main()    //OUTPUT : wELcOMe to sCHOOL 
       { Scanner x=new Scanner (System.in);
        String s,ns = "";             
        int i, len;
        char ch;
        System.out.println("Enter a sentence");
        s=x.nextLine();
        len = s.length();
        for(i=0 ; i<len ; i++)
        {
            ch=s.charAt(i);
            if(Character.isUpperCase(ch))
                ch = Character.toLowerCase(ch);
            else if(Character.isLowerCase(ch))
                ch = Character.toUpperCase(ch);
            ns = ns + ch;
        }//end of for
        System.out.println("New String = " + ns);
    }//end of main
}//end of class
